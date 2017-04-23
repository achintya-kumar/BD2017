import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;


public class WordCount extends Configured implements Tool{

	public int run(String[] args) throws Exception {
		
		//Checking if the number of supplied arguments are inadequate
		if(args.length < 2) {
			System.out.println("Please enter input and output paths!");
			return -1; // <-- Indicates abnormal termination of execution
		}
		
		//Creating map-reduce job configuration
		JobConf conf = new JobConf(WordCount.class);
		conf.setJobName("Wordcount");
		
		FileInputFormat.setInputPaths(conf, new Path(args[0]));
		FileOutputFormat.setOutputPath(conf, new Path(args[1]));
		
		//Setting the class and types of keys and values of output of the mapper
		conf.setMapperClass(WordMapper.class);
		conf.setMapOutputKeyClass(Text.class);
		conf.setMapOutputValueClass(IntWritable.class);
		
		//Setting the class and the types of keys and values of the output of the reducer
		conf.setReducerClass(WordReducer.class);
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);
		
		JobClient.runJob(conf);
		return 0;
		
	}
	
	public static void main(String[] args) throws Exception {
		int exitCode = ToolRunner.run(new WordCount(), args);
		System.exit(exitCode);
	}

}

class WordMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>{

	public void map(LongWritable key, Text value,
			OutputCollector<Text, IntWritable> output, Reporter r)
			throws IOException {
		//Getting the string out of the hadoop box-class Text and tokenizing it
		String string = value.toString();
		StringTokenizer tokens = new StringTokenizer(string);
		
		while(tokens.hasMoreTokens()){ // <-- Looping through the tokens
			String token = tokens.nextToken();
			if(token.length() > 0)
				output.collect(new Text(token), new IntWritable(1)); // <-- Mapping every token to a key-value pair with the token as the key and 1 as the value wrapped in hadoop box-classes.
		}
	}

}

class WordReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>{

	public void reduce(Text key, Iterator<IntWritable> values,
			OutputCollector<Text, IntWritable> output, Reporter r)
			throws IOException {
		//Setting the counter for the received KV pair to 0. The 'values' consists of shuffled values from all the nodes for every key.
		int count = 0;
		
		while(values.hasNext()){
			IntWritable value = values.next();
			count += value.get(); // <-- Adding every occurrence of every value, could be very well replaced with a simple increment ++ operator.
		}
		
		output.collect(key, new IntWritable(count)); // <-- collecting the output for the received intermediate KV pair into final KV pair.
		
	}

}

