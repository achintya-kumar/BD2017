### Load up the source file stored within HDFS or locally with appropriate path. I am using HDFS here.
```scala> var file = sc.textFile("hdfs://localhost:8020/user/cloudera/source/MarinerMissionToMars.txt")```

### Flatmap-transform the obtained text file into words
```scala> var flat_map = file.flatMap(line => line.split(" "))```

### Transform every flatmapped word into a tuple consisting of the word and an integer 1
```scala> var map = flat_map.map(word => (word, 1))```

### Now reduce-transform every tuple by key, which in our is the word and the value is the Integer 1
```scala> var count = map.reduceByKey(_ + _)```

### Initiate an action and store everything back into an HDFS location
```count.saveAsTextFile("hdfs://localhost:8020/user/cloudera/word_count_output")```



# Comparison of number of lines: Spark vs MapReduce
Spark = 5  
MapReduce = approximately 80, excluding boilerplate code
