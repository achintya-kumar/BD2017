### Hostname of the DB server node
```
[ec2-user@ip-172-31-12-116 ~]$ hostname -f
ip-172-31-12-116.eu-central-1.compute.internal

```

### Command to display DB server's version
```
[ec2-user@ip-172-31-12-116 ~]$ mysql --version
mysql  Ver 14.14 Distrib 5.6.36, for Linux (x86_64) using  EditLine wrapper
```

### List of all the databases
```
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| hive               |
| hue                |
| mysql              |
| oozie              |
| performance_schema |
| rman               |
| scm                |
| sentry             |
+--------------------+
9 rows in set (0,00 sec)
```

