echo This must be executed as root. Make sure you're root or Cancel.
read foo
echo adding a principal for a new user
kadmin.local <<eoj
addprinc -pw cloudera hdfs@ACHINTYA-KUMAR
eoj
echo clearing credentials cache
kdestroy
echo authenticating hdfs user for its superuser privileges
kinit hdfs@ACHINTYA-KUMAR
echo creating a new directory inside /user using hdfs user's privileges
hadoop fs -mkdir /user/raffles
echo changing the owner of /user/raffles to raffles from hdfs
hadoop fs -chown raffles /user/raffles
echo clearing credentials cache
kdestroy
echo authenticating raffles to test his privilege over /user/raffles
kinit raffles@ACHINTYA-KUMAR
hadoop fs -mkdir /user/raffles/testFolderCreation
echo displaying results of previous action
hadoop fs -ls /user/raffles
