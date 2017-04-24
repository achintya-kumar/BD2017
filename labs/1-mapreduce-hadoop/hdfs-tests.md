# 1. Teragen task
## For running teragen to create a 5GB file with 6 mappers and 16MB block-size
```
time hadoop jar /opt/cloudera//parcels/CDH/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar teragen -Ddfs.blocksize=16M -Dmapred.map.tasks=6 50000000 /user/achintya-kumar/terasort/terasort-input
```
## Time taken
```
real  2m20.519s
user  0m4.808s
sys   0m0.580s
```

#  

# 2. Terasort Task
## For running terasort task on the files created with teragen
```
time hadoop jar /opt/cloudera/parcels/CDH/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar terasort /user/achintya-kumar/terasort/terasort-input /user/achintya-kumar/terasort/terasort-output
```
## Time taken
```
real  29m50.306s
user  0m11.789s
sys   0m2.037s
```
