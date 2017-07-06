### Listing the directories within the ```/user```
```
[ec2-user@ip-172-31-12-116 ~]$ HADOOP_USER_NAME=hdfs hadoop fs -ls /user
Found 6 items
drwxrwxrwx   - mapred hadoop              0 2017-07-06 12:06 /user/history
drwxrwxr-t   - hive   hive                0 2017-07-06 12:06 /user/hive
drwxrwxr-x   - hue    hue                 0 2017-07-06 12:07 /user/hue
drwxr-xr-x   - hdfs   supergroup          0 2017-07-06 12:10 /user/neymar
drwxrwxr-x   - oozie  oozie               0 2017-07-06 12:07 /user/oozie
drwxr-xr-x   - hdfs   supergroup          0 2017-07-06 12:11 /user/ronaldo
```

### Output of CM API call to endpoint ```../api/v14/hosts```
```
[ec2-user@ip-172-31-12-116 ~]$ curl -u admin:admin 'http://localhost:7180/api/v14/hosts'
{
  "items" : [ {
    "hostId" : "c9a595cb-73ce-4c88-815e-eac6db789a4f",
    "ipAddress" : "172.31.12.116",
    "hostname" : "ip-172-31-12-116.eu-central-1.compute.internal",
    "rackId" : "/default",
    "hostUrl" : "http://ip-172-31-12-116.eu-central-1.compute.internal:7180/cmf/hostRedirect/c9a595cb-73ce-4c88-815e-eac6db789a4f",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15799816192
  }, {
    "hostId" : "f4c656fe-c773-4e21-bbe2-efe2f31ff91b",
    "ipAddress" : "172.31.13.87",
    "hostname" : "ip-172-31-13-87.eu-central-1.compute.internal",
    "rackId" : "/default",
    "hostUrl" : "http://ip-172-31-12-116.eu-central-1.compute.internal:7180/cmf/hostRedirect/f4c656fe-c773-4e21-bbe2-efe2f31ff91b",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15799816192
  }, {
    "hostId" : "9413fcf9-ecbf-4037-a59a-b9040ffe9da3",
    "ipAddress" : "172.31.4.234",
    "hostname" : "ip-172-31-4-234.eu-central-1.compute.internal",
    "rackId" : "/default",
    "hostUrl" : "http://ip-172-31-12-116.eu-central-1.compute.internal:7180/cmf/hostRedirect/9413fcf9-ecbf-4037-a59a-b9040ffe9da3",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15799816192
  }, {
    "hostId" : "c5da0e74-5723-4c1a-acd6-680a9d7b7bbb",
    "ipAddress" : "172.31.7.238",
    "hostname" : "ip-172-31-7-238.eu-central-1.compute.internal",
    "rackId" : "/default",
    "hostUrl" : "http://ip-172-31-12-116.eu-central-1.compute.internal:7180/cmf/hostRedirect/c5da0e74-5723-4c1a-acd6-680a9d7b7bbb",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15799816192
  }, {
    "hostId" : "b01244d8-c245-4054-9ece-a31c588e0c58",
    "ipAddress" : "172.31.8.127",
    "hostname" : "ip-172-31-8-127.eu-central-1.compute.internal",
    "rackId" : "/default",
    "hostUrl" : "http://ip-172-31-12-116.eu-central-1.compute.internal:7180/cmf/hostRedirect/b01244d8-c245-4054-9ece-a31c588e0c58",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15799816192
  } ]
```
