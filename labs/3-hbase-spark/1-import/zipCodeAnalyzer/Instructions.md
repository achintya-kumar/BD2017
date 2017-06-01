### Package
  sudo mvn clean package -Dfatjar
  
### Execute
  hadoop jar target/<jar-with-job.jar> -t testtable -c data:Column-26 -o zipResults
