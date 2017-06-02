package sparkWordCount;

import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class WordCount {
  public static void main(String[] args) {

    // create Spark context with Spark configuration
	SparkConf sparkConf = new SparkConf().setAppName("Spark Count").setMaster("local[2]");
    JavaSparkContext sc = new JavaSparkContext(sparkConf);

    // read in text file and split each document into words
    JavaRDD<String> lines = sc.textFile("hdfs://localhost:8020/user/cloudera/source/MarinerMissionToMars.txt");

    JavaPairRDD<String, Integer> counts = lines.flatMap(line -> Arrays.asList(line.split(" ")).iterator())
            .mapToPair(word -> new Tuple2<String, Integer>(word, 1))
            .reduceByKey((x, y) ->  x +  y);
    
    counts.saveAsTextFile("hdfs://localhost:8020/user/cloudera/results/MarinerMissionToMarsResults");
    
    sc.close();

  }
}