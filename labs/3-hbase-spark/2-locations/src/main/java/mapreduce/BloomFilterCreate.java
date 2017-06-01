package mapreduce;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.KeyValueTextInputFormat;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.lib.NullOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import bloomFilter.BloomFilter;

public class BloomFilterCreate extends Configured implements Tool
{
	public static class MapClass extends MapReduceBase implements Mapper<Text, Text, Text, BloomFilter<String>>
	{
		BloomFilter<String> bf = new BloomFilter<String>();
		
		OutputCollector<Text, BloomFilter<String>> oc = null;
		
		public void map(Text key, Text value, OutputCollector<Text, BloomFilter<String>> output, Reporter reporter) throws IOException
		{
			// fetch output collector. Don't change!
			if(oc == null)
				oc = output;
				
			// insert your map code here!

			String line = value.toString();
			
			String otherThanQuote = " [^\"] ";
	        String quotedString = String.format(" \" %s* \" ", otherThanQuote);
	        String regex = String.format("(?x) " + // enable comments, ignore white spaces
	                ",                         " + // match a comma
	                "(?=                       " + // start positive look ahead
	                "  (?:                     " + //   start non-capturing group 1
	                "    %s*                   " + //     match 'otherThanQuote' zero or more times
	                "    %s                    " + //     match 'quotedString'
	                "  )*                      " + //   end group 1 and repeat it zero or more times
	                "  %s*                     " + //   match 'otherThanQuote'
	                "  $                       " + // match the end of the string
	                ")                         ", // stop positive look ahead
	                otherThanQuote, quotedString, otherThanQuote);        

	        
	        
			String[] csvValues = line.split(regex, -1);
			
			bf.add(csvValues[19]); // <-- Once the key is taken away, the location-names move to index 19.
		}
		
		public void close() throws IOException
		{
			oc.collect(new Text("testkey"), bf);
		}
	}
	
	public static class Reduce extends MapReduceBase implements Reducer<Text, BloomFilter<String>, Text, Text>
	{
		JobConf job = null;		
		BloomFilter<String> bf = new BloomFilter<String>();
		
		public void configure(JobConf job)
		{
			this.job = job;
		}
		
		public void reduce(Text key, Iterator<BloomFilter<String>> values, OutputCollector<Text, Text> output, Reporter reporter) throws IOException
		{
			// insert your reduce code here!
			//BloomFilter<String> emptyBloomFilter = new BloomFilter<String>();
			while(values.hasNext()){
				BloomFilter<String> value = values.next();
				bf.union(value);; // <-- Unioning the results across all the bloomfilters.
			}
			//output.collect(new Text("BloomFilter"), new Text(bf.bitSet.toString()));
		}
		
		public void close() throws IOException
		{
			Path file = new Path(job.get("mapred.output.dir") + "/bloomfilter");
			
			FSDataOutputStream out = file.getFileSystem(job).create(file);
			
			bf.write(out);
			out.close();
		}
	}
	
	public int run(String[] args) throws IOException
	{
		Configuration conf = getConf();
		JobConf job = new JobConf(conf, BloomFilterCreate.class);
		
		Path in = new Path(args[0]);
		Path out = new Path(args[1]);
		
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);
		
		job.setJobName("Bloom Filter");	
		job.setMapperClass(MapClass.class);
		job.setReducerClass(Reduce.class);
		job.setNumReduceTasks(1);
		
		job.setInputFormat(KeyValueTextInputFormat.class);
		job.setOutputFormat(NullOutputFormat.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(BloomFilter.class);
		job.set("key.value.separator.in.input.line", ",");
		
		JobClient.runJob(job);
		
		return 0;
	}
	
	public static void main(String[] args) throws Exception
	{
		int res = ToolRunner.run(new Configuration(), new BloomFilterCreate(), args);		
		System.exit(res);
	}
}