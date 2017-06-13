### Creating a new test user principal
```
kadmin.local:  addprinc -pw kumar kumar@ACHINTYA-KUMAR
WARNING: no policy specified for kumar@ACHINTYA-KUMAR; defaulting to no policy
Principal "kumar@ACHINTYA-KUMAR" created.
kadmin.local:  exit
```
### Authenticating the user created above
```
[root@quickstart ~]# kinit kumar
Password for kumar@ACHINTYA-KUMAR: 
[root@quickstart ~]# klist
Ticket cache: FILE:/tmp/krb5cc_0
Default principal: kumar@ACHINTYA-KUMAR

Valid starting     Expires            Service principal
06/12/17 19:41:21  06/13/17 19:41:21  krbtgt/ACHINTYA-KUMAR@ACHINTYA-KUMAR
	renew until 06/19/17 19:41:21
```
