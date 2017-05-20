To stop Hive service, issue the following command on the CM server node:
```
[achintya@kumarnode1 ~]$ curl -X POST -u admin:admin 'http://localhost:7180/api/v13/clusters/achintya-kumar/services/hive/commands/stop'
{
  "id" : 205,
  "name" : "Stop",
  "startTime" : "2017-05-20T13:38:45.814Z",
  "active" : true,
  "serviceRef" : {
    "clusterName" : "cluster",
    "serviceName" : "hive"
  }
```
To start Hive service, issue the following command on the CM server node:
```
[achintya@kumarnode1 ~]$ curl -X POST -u admin:admin 'http://localhost:7180/api/v13/clusters/achintya-kumar/services/hive/commands/start'
{
  "id" : 209,
  "name" : "Start",
  "startTime" : "2017-05-20T13:40:16.334Z",
  "active" : true,
  "serviceRef" : {
    "clusterName" : "cluster",
    "serviceName" : "hive"
  }
}
```
To check the status of the Hive service, issue the following command on the CM server node:
```
[achintya@kumarnode1 ~]$ curl -u admin:admin http://localhost:7180/api/v13/clusters/achintya-kumar/services/hive
{
  "name" : "hive",
  "type" : "HIVE",
  "clusterRef" : {
    "clusterName" : "cluster"
  },
  "serviceUrl" : "http://10.0.0.4:7180/cmf/serviceRedirect/hive",
  "roleInstancesUrl" : "http://10.0.0.4:7180/cmf/serviceRedirect/hive/instances",
  "serviceState" : "STARTED",
  "healthSummary" : "GOOD",
  "healthChecks" : [ {
    "name" : "HIVE_HIVEMETASTORES_HEALTHY",
    "summary" : "GOOD",
    "suppressed" : false
  }, {
    "name" : "HIVE_HIVESERVER2S_HEALTHY",
    "summary" : "GOOD",
    "suppressed" : false
  } ],
  "configStalenessStatus" : "FRESH",
  "clientConfigStalenessStatus" : "FRESH",
  "maintenanceMode" : false,
  "maintenanceOwners" : [ ],
  "displayName" : "Hive",
  "entityStatus" : "GOOD_HEALTH"
}
```
