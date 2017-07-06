### Running ```teragen``` as user ```neymar``` 
```
[ec2-user@ip-172-31-7-238 ~]$ sudo su neymar
[neymar@ip-172-31-7-238 ec2-user]$ time hadoop jar /opt/cloudera/parcels/CDH/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar teragen -Ddfs.blocksize=16M -Dmapred.map.tasks=8 65536000 /user/neymar/tgen640
17/07/06 12:43:54 INFO client.RMProxy: Connecting to ResourceManager at ip-172-31-12-116.eu-central-1.compute.internal/172.31.12.116:8032
17/07/06 12:43:55 INFO terasort.TeraGen: Generating 65536000 using 8
17/07/06 12:43:55 INFO mapreduce.JobSubmitter: number of splits:8
17/07/06 12:43:55 INFO Configuration.deprecation: mapred.map.tasks is deprecated. Instead, use mapreduce.job.maps
17/07/06 12:43:55 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1499357171170_0001
17/07/06 12:43:56 INFO impl.YarnClientImpl: Submitted application application_1499357171170_0001
17/07/06 12:43:56 INFO mapreduce.Job: The url to track the job: http://ip-172-31-12-116.eu-central-1.compute.internal:8088/proxy/application_1499357171170_0001/
17/07/06 12:43:56 INFO mapreduce.Job: Running job: job_1499357171170_0001
17/07/06 12:44:03 INFO mapreduce.Job: Job job_1499357171170_0001 running in uber mode : false
17/07/06 12:44:03 INFO mapreduce.Job:  map 0% reduce 0%
17/07/06 12:44:22 INFO mapreduce.Job:  map 12% reduce 0%
...
17/07/06 12:45:14 INFO mapreduce.Job:  map 99% reduce 0%
17/07/06 12:45:15 INFO mapreduce.Job:  map 100% reduce 0%
17/07/06 12:45:15 INFO mapreduce.Job: Job job_1499357171170_0001 completed successfully
17/07/06 12:45:15 INFO mapreduce.Job: Counters: 33
	File System Counters
		FILE: Number of bytes read=0
		FILE: Number of bytes written=1021512
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=682
		HDFS: Number of bytes written=6553600000
		HDFS: Number of read operations=32
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=16
	Job Counters 
		Launched map tasks=8
		Other local map tasks=8
		Total time spent by all maps in occupied slots (ms)=511020
		Total time spent by all reduces in occupied slots (ms)=0
		Total time spent by all map tasks (ms)=511020
		Total vcore-milliseconds taken by all map tasks=511020
		Total megabyte-milliseconds taken by all map tasks=523284480
	Map-Reduce Framework
		Map input records=65536000
		Map output records=65536000
		Input split bytes=682
		Spilled Records=0
		Failed Shuffles=0
		Merged Map outputs=0
		GC time elapsed (ms)=1619
		CPU time spent (ms)=131550
		Physical memory (bytes) snapshot=2823442432
		Virtual memory (bytes) snapshot=12545646592
		Total committed heap usage (bytes)=2923429888
		Peak Map Physical memory (bytes)=386633728
		Peak Map Virtual memory (bytes)=1576611840
	org.apache.hadoop.examples.terasort.TeraGen$Counters
		CHECKSUM=140750829423462787
	File Input Format Counters 
		Bytes Read=0
	File Output Format Counters 
		Bytes Written=6553600000

real	1m23.105s
user	0m6.094s
sys	0m0.283s
```

### Listing the teragen output inside ```tgen640```
```
[neymar@ip-172-31-7-238 ec2-user]$ hadoop fs -ls /user/neymar/tgen640
Found 9 items
-rw-r--r--   3 neymar supergroup          0 2017-07-06 12:45 /user/neymar/tgen640/_SUCCESS
-rw-r--r--   3 neymar supergroup  819200000 2017-07-06 12:45 /user/neymar/tgen640/part-m-00000
-rw-r--r--   3 neymar supergroup  819200000 2017-07-06 12:45 /user/neymar/tgen640/part-m-00001
-rw-r--r--   3 neymar supergroup  819200000 2017-07-06 12:45 /user/neymar/tgen640/part-m-00002
-rw-r--r--   3 neymar supergroup  819200000 2017-07-06 12:45 /user/neymar/tgen640/part-m-00003
-rw-r--r--   3 neymar supergroup  819200000 2017-07-06 12:45 /user/neymar/tgen640/part-m-00004
-rw-r--r--   3 neymar supergroup  819200000 2017-07-06 12:45 /user/neymar/tgen640/part-m-00005
-rw-r--r--   3 neymar supergroup  819200000 2017-07-06 12:44 /user/neymar/tgen640/part-m-00006
-rw-r--r--   3 neymar supergroup  819200000 2017-07-06 12:44 /user/neymar/tgen640/part-m-00007
```

### Showing number of blocks within ```/user/neymar/tgen640``` directory
```
[neymar@ip-172-31-7-238 ec2-user]$ hdfs fsck /user/neymar/tgen640 -files -blocks | grep blocks
Connecting to namenode via http://ip-172-31-12-116.eu-central-1.compute.internal:50070
 Total blocks (validated):	392 (avg. block size 16718367 B)
 Minimally replicated blocks:	392 (100.0 %)
 Over-replicated blocks:	0 (0.0 %)
 Under-replicated blocks:	0 (0.0 %)
 Mis-replicated blocks:		0 (0.0 %)
 Corrupt blocks:		0
```
