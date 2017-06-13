## 1. Create a principal for user `raffles`
### Run `kadmin.local` or `kadmin` depending on whether you're on node running KDC or not.
### Add the principal for the aforementioned user
```
kadmin.local:  addprinc raffles@ACHINTYA-KUMAR
WARNING: no policy specified for raffles@ACHINTYA-KUMAR; defaulting to no policy
Enter password for principal "raffles@ACHINTYA-KUMAR": 
Re-enter password for principal "raffles@ACHINTYA-KUMAR": 
Principal "raffles@ACHINTYA-KUMAR" created.
```
### Authenticate the user as follows:
```
[root@quickstart cloudera]# kinit raffles@ACHINTYA-KUMAR
Password for raffles@ACHINTYA-KUMAR: 
```
### (Optional) check for received TGT in the credentials cache
```
[root@quickstart cloudera]# klist
Ticket cache: FILE:/tmp/krb5cc_0
Default principal: raffles@ACHINTYA-KUMAR

Valid starting     Expires            Service principal
06/13/17 14:17:15  06/14/17 14:17:15  krbtgt/ACHINTYA-KUMAR@ACHINTYA-KUMAR
	renew until 06/20/17 14:17:15
```
## 2. teragen
### Run ```teragen``` using the following command (arguments inspired from first exercise)
```
[root@quickstart cloudera]# time hadoop jar /usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar teragen -Ddfs.blocksize=16M -Dmapred.map.tasks=6 50000000 /user/raffles/terasort/terasort-input
```
### Console output
```
17/06/13 15:30:14 INFO client.RMProxy: Connecting to ResourceManager at quickstart.cloudera/10.0.2.15:8032
17/06/13 15:30:15 INFO hdfs.DFSClient: Created token for raffles: HDFS_DELEGATION_TOKEN owner=raffles@ACHINTYA-KUMAR, renewer=yarn, realUser=, issueDate=1497393015047, maxDate=1497997815047, sequenceNumber=2, masterKeyId=10 on 10.0.2.15:8020
17/06/13 15:30:15 INFO security.TokenCache: Got dt for hdfs://quickstart.cloudera:8020; Kind: HDFS_DELEGATION_TOKEN, Service: 10.0.2.15:8020, Ident: (token for raffles: HDFS_DELEGATION_TOKEN owner=raffles@ACHINTYA-KUMAR, renewer=yarn, realUser=, issueDate=1497393015047, maxDate=1497997815047, sequenceNumber=2, masterKeyId=10)
17/06/13 15:30:15 INFO terasort.TeraGen: Generating 50000000 using 6
17/06/13 15:30:15 INFO mapreduce.JobSubmitter: number of splits:6
17/06/13 15:30:15 INFO Configuration.deprecation: mapred.map.tasks is deprecated. Instead, use mapreduce.job.maps
17/06/13 15:30:16 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1497391788136_0001
17/06/13 15:30:16 INFO mapreduce.JobSubmitter: Kind: HDFS_DELEGATION_TOKEN, Service: 10.0.2.15:8020, Ident: (token for raffles: HDFS_DELEGATION_TOKEN owner=raffles@ACHINTYA-KUMAR, renewer=yarn, realUser=, issueDate=1497393015047, maxDate=1497997815047, sequenceNumber=2, masterKeyId=10)
17/06/13 15:30:18 INFO impl.YarnClientImpl: Submitted application application_1497391788136_0001
17/06/13 15:30:18 INFO mapreduce.Job: The url to track the job: http://quickstart.cloudera:8088/proxy/application_1497391788136_0001/
17/06/13 15:30:18 INFO mapreduce.Job: Running job: job_1497391788136_0001
17/06/13 15:30:38 INFO mapreduce.Job: Job job_1497391788136_0001 running in uber mode : false
17/06/13 15:30:38 INFO mapreduce.Job:  map 0% reduce 0%
17/06/13 15:30:59 INFO mapreduce.Job:  map 5% reduce 0%
17/06/13 15:31:03 INFO mapreduce.Job:  map 11% reduce 0%
...
17/06/13 15:33:30 INFO mapreduce.Job:  map 92% reduce 0%
17/06/13 15:33:31 INFO mapreduce.Job:  map 93% reduce 0%
17/06/13 15:33:35 INFO mapreduce.Job:  map 100% reduce 0%
17/06/13 15:33:36 INFO mapreduce.Job: Job job_1497391788136_0001 completed successfully
17/06/13 15:33:36 INFO mapreduce.Job: Counters: 31
	File System Counters
		FILE: Number of bytes read=0
		FILE: Number of bytes written=751134
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=510
		HDFS: Number of bytes written=5000000000
		HDFS: Number of read operations=24
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=12
	Job Counters 
		Launched map tasks=6
		Other local map tasks=6
		Total time spent by all maps in occupied slots (ms)=175628288
		Total time spent by all reduces in occupied slots (ms)=0
		Total time spent by all map tasks (ms)=343024
		Total vcore-seconds taken by all map tasks=343024
		Total megabyte-seconds taken by all map tasks=175628288
	Map-Reduce Framework
		Map input records=50000000
		Map output records=50000000
		Input split bytes=510
		Spilled Records=0
		Failed Shuffles=0
		Merged Map outputs=0
		GC time elapsed (ms)=7751
		CPU time spent (ms)=87300
		Physical memory (bytes) snapshot=889053184
		Virtual memory (bytes) snapshot=4335972352
		Total committed heap usage (bytes)=291504128
	org.apache.hadoop.examples.terasort.TeraGen$Counters
		CHECKSUM=107387891658806101
	File Input Format Counters 
		Bytes Read=0
	File Output Format Counters 
		Bytes Written=5000000000

real	3m27.166s
user	0m6.585s
sys	0m0.566s
```

## 3. terasort
### Run `terasort` using the following command:
```
[root@quickstart cloudera]# time hadoop jar /usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar terasort /user/raffles/terasort/terasort-input /user/raffles/terasort/terasort-output
```
### Console output:
```
17/06/13 15:50:56 INFO terasort.TeraSort: starting
17/06/13 15:51:00 INFO hdfs.DFSClient: Created token for raffles: HDFS_DELEGATION_TOKEN owner=raffles@ACHINTYA-KUMAR, renewer=yarn, realUser=, issueDate=1497394260300, maxDate=1497999060300, sequenceNumber=3, masterKeyId=10 on 10.0.2.15:8020
17/06/13 15:51:00 INFO security.TokenCache: Got dt for hdfs://quickstart.cloudera:8020; Kind: HDFS_DELEGATION_TOKEN, Service: 10.0.2.15:8020, Ident: (token for raffles: HDFS_DELEGATION_TOKEN owner=raffles@ACHINTYA-KUMAR, renewer=yarn, realUser=, issueDate=1497394260300, maxDate=1497999060300, sequenceNumber=3, masterKeyId=10)
17/06/13 15:51:00 INFO input.FileInputFormat: Total input paths to process : 6
Spent 751ms computing base-splits.
Spent 28ms computing TeraScheduler splits.
Computing input splits took 780ms
Sampling 10 splits of 300
Making 1 from 100000 sampled records
Computing parititions took 1881ms
Spent 2664ms computing partitions.
17/06/13 15:51:02 INFO client.RMProxy: Connecting to ResourceManager at quickstart.cloudera/10.0.2.15:8032
17/06/13 15:51:03 INFO mapreduce.JobSubmitter: number of splits:300
17/06/13 15:51:03 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1497391788136_0002
17/06/13 15:51:03 INFO mapreduce.JobSubmitter: Kind: HDFS_DELEGATION_TOKEN, Service: 10.0.2.15:8020, Ident: (token for raffles: HDFS_DELEGATION_TOKEN owner=raffles@ACHINTYA-KUMAR, renewer=yarn, realUser=, issueDate=1497394260300, maxDate=1497999060300, sequenceNumber=3, masterKeyId=10)
17/06/13 15:51:04 INFO impl.YarnClientImpl: Submitted application application_1497391788136_0002
17/06/13 15:51:04 INFO mapreduce.Job: The url to track the job: http://quickstart.cloudera:8088/proxy/application_1497391788136_0002/
17/06/13 15:51:04 INFO mapreduce.Job: Running job: job_1497391788136_0002
17/06/13 15:51:22 INFO mapreduce.Job: Job job_1497391788136_0002 running in uber mode : false
17/06/13 15:51:22 INFO mapreduce.Job:  map 0% reduce 0%
17/06/13 15:51:38 INFO mapreduce.Job:  map 1% reduce 0%
17/06/13 15:52:03 INFO mapreduce.Job:  map 2% reduce 0%
...
17/06/13 16:40:53 INFO mapreduce.Job:  map 100% reduce 99%
17/06/13 16:40:59 INFO mapreduce.Job:  map 100% reduce 100%
17/06/13 16:41:23 INFO mapreduce.Job: Job job_1497391788136_0002 completed successfully
17/06/13 16:41:23 INFO mapreduce.Job: Counters: 49
	File System Counters
		FILE: Number of bytes read=6122259166
		FILE: Number of bytes written=8345650590
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=5000043800
		HDFS: Number of bytes written=5000000000
		HDFS: Number of read operations=903
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=2
	Job Counters 
		Launched map tasks=300
		Launched reduce tasks=1
		Data-local map tasks=300
		Total time spent by all maps in occupied slots (ms)=2204182016
		Total time spent by all reduces in occupied slots (ms)=541164032
		Total time spent by all map tasks (ms)=4305043
		Total time spent by all reduce tasks (ms)=1056961
		Total vcore-seconds taken by all map tasks=4305043
		Total vcore-seconds taken by all reduce tasks=1056961
		Total megabyte-seconds taken by all map tasks=2204182016
		Total megabyte-seconds taken by all reduce tasks=541164032
	Map-Reduce Framework
		Map input records=50000000
		Map output records=50000000
		Map output bytes=5100000000
		Map output materialized bytes=2185277767
		Input split bytes=43800
		Combine input records=0
		Combine output records=0
		Reduce input groups=50000000
		Reduce shuffle bytes=2185277767
		Reduce input records=50000000
		Reduce output records=50000000
		Spilled Records=189258678
		Shuffled Maps =300
		Failed Shuffles=0
		Merged Map outputs=300
		GC time elapsed (ms)=35973
		CPU time spent (ms)=1078310
		Physical memory (bytes) snapshot=44817424384
		Virtual memory (bytes) snapshot=219871219712
		Total committed heap usage (bytes)=14505476096
	Shuffle Errors
		BAD_ID=0
		CONNECTION=0
		IO_ERROR=0
		WRONG_LENGTH=0
		WRONG_MAP=0
		WRONG_REDUCE=0
	File Input Format Counters 
		Bytes Read=5000000000
	File Output Format Counters 
		Bytes Written=5000000000
17/06/13 16:41:23 INFO terasort.TeraSort: done

real	50m28.310s
user	0m16.497s
sys	0m2.506s
```

## 4. Destroy the TGT in credentials cache once done
```
[root@quickstart cloudera]# kdestroy
[root@quickstart cloudera]# klist
klist: No credentials cache found (ticket cache FILE:/tmp/krb5cc_0)
```
