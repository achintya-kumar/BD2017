### Report the latest available version of the API
```
[achintya@kumarnode1 ~]$ curl -u admin:admin 'http://localhost:7180/api/version'
v14
```
### Report the CM version
```
[achintya@kumarnode1 ~]$ curl -u admin:admin 'http://localhost:7180/api/v14/cm/version'
{
  "version" : "5.9.2",
  "buildUser" : "jenkins",
  "buildTimestamp" : "20170330-1814",
  "gitHash" : "822da28bff818f57fc1bfc3eafe3a550300ef1b0",
  "snapshot" : false
}
```
### List all CM users
```
[achintya@kumarnode1 ~]$ curl -u admin:admin 'http://localhost:7180/api/v14/users'
{
  "items" : [ {
    "name" : "admin",
    "roles" : [ "ROLE_ADMIN" ]
  } ]
}
```
### Report the database server in use by CM
```
[achintya@kumarnode1 ~]$ curl -u admin:admin 'http://localhost:7180/api/v14/cm/scmDbInfo'
{
  "scmDbType" : "MYSQL",
  "embeddedDbUsed" : false
}
```
