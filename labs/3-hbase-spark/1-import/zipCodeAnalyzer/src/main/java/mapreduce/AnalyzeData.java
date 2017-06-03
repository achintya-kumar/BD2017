package mapreduce;

import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapReduceUtil;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// cc AnalyzeData MapReduce job that reads the imported data and analyzes it.
public class AnalyzeData {

  private static final Log LOG = LogFactory.getLog(AnalyzeData.class);

  public static final String NAME = "AnalyzeData";
  public enum Counters { ROWS, COLS, ERROR, VALID }

  /**
   * Implements the <code>Mapper</code> that reads the data and extracts the
   * required information.
   */
  // vv AnalyzeData
  static class AnalyzeMapper extends TableMapper<Text, IntWritable> { // co AnalyzeData-1-Mapper Extend the supplied TableMapper class, setting your own output key and value types.

    private JSONParser parser = new JSONParser();
    private IntWritable ONE = new IntWritable(1);
    @Override
    public void map(ImmutableBytesWritable row, Result columns, Context context) throws IOException {
      context.getCounter(Counters.ROWS).increment(1);
      String value = null;
      try {
        for (Cell cell : columns.listCells()) {
          context.getCounter(Counters.COLS).increment(1);
          value = Bytes.toStringBinary(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());

          context.write(new Text(value), ONE);
          context.getCounter(Counters.VALID).increment(1);
        }
      } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Row: " + Bytes.toStringBinary(row.get()) +
          ", JSON: " + value);
        context.getCounter(Counters.ERROR).increment(1);
      }
    }
  }

  /**
   * Implements the <code>Reducer</code> part of the process.
   */
  static class AnalyzeReducer extends Reducer<Text, IntWritable, Text, IntWritable> { // co AnalyzeData-3-Reducer Extend a Hadoop Reducer class, assigning the proper types.

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values,
      Context context) throws IOException, InterruptedException {
      int count = 0;
      for (IntWritable one : values) count++; // co AnalyzeData-4-Count Count the occurrences and emit sum.
      context.write(key, new IntWritable(count));
    }
  }
  private static CommandLine parseArgs(String[] args) throws ParseException {
    Options options = new Options();
    Option o = new Option("t", "table", true,
      "table to read from (must exist)");
    o.setArgName("table-name");
    o.setRequired(true);
    options.addOption(o);
    o = new Option("c", "column", true,
      "column to read data from (must exist)");
    o.setArgName("family:qualifier");
    options.addOption(o);
    o = new Option("o", "output", true,
      "the directory to write to");
    o.setArgName("path-in-HDFS");
    o.setRequired(true);
    options.addOption(o);
    
    CommandLineParser parser = new PosixParser();
    CommandLine cmd = null;
    try {
      cmd = parser.parse(options, args);
    } catch (Exception e) {
      System.err.println("ERROR: " + e.getMessage() + "\n");
      HelpFormatter formatter = new HelpFormatter();
      formatter.printHelp(NAME + " ", options, true);
      System.exit(-1);
    }
    if (cmd.hasOption("d")) {
      Logger log = Logger.getLogger("mapreduce");
      log.setLevel(Level.DEBUG);
      System.out.println("DEBUG ON");
    }
    return cmd;
  }

  /**
   * Main entry point.
   *
   * @param args  The command line parameters.
   * @throws Exception When running the job fails.
   */
  // vv AnalyzeData
  public static void main(String[] args) throws Exception {
    /*...*/
    // ^^ AnalyzeData
    Configuration conf = HBaseConfiguration.create();
    String[] otherArgs =
      new GenericOptionsParser(conf, args).getRemainingArgs();
    CommandLine cmd = parseArgs(otherArgs);
    // get details
    String table = cmd.getOptionValue("t");
    String column = cmd.getOptionValue("c");
    String output = cmd.getOptionValue("o");

    // vv AnalyzeData
    Scan scan = new Scan(); // co AnalyzeData-5-Scan Create and configure a Scan instance.
    if (column != null) {
      byte[][] colkey = KeyValue.parseColumn(Bytes.toBytes(column));
      if (colkey.length > 1) {
        scan.addColumn(colkey[0], colkey[1]);
      } else {
        scan.addFamily(colkey[0]);
      }
    }

    Job job = Job.getInstance(conf, "Analyze data in " + table);
    job.setJarByClass(AnalyzeData.class);
    TableMapReduceUtil.initTableMapperJob(table, scan, AnalyzeMapper.class,
      Text.class, IntWritable.class, job); // co AnalyzeData-6-Util Set up the table mapper phase using the supplied utility.
    job.setReducerClass(AnalyzeReducer.class);
    job.setOutputKeyClass(Text.class); // co AnalyzeData-7-Output Configure the reduce phase using the normal Hadoop syntax.
    job.setOutputValueClass(IntWritable.class);
    job.setNumReduceTasks(1);
    FileOutputFormat.setOutputPath(job, new Path(output));

    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
  // ^^ AnalyzeData
}
