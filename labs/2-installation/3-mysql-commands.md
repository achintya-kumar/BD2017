To list the MySQL version:
```
[achintya@kumarnode0 ~]$ mysql --version
mysql  Ver 14.14 Distrib 5.5.56, for Linux (x86_64) using readline 5.1
```
## Database Creation
### Log into mysql server
```
mysql -u root
```
## Create Databases for SCM(scm), Activity Monitor(amon), Reports Manager(rman), Hive Metastore Server(hive), Hue Server(hue), Sentry Server(sentry), Cloudera Navigator Audit Server(nav), Cloudera Navigator Metadata Server(navms) and Oozie(oozie)
For example:
```
create database amon DEFAULT CHARACTER SET utf8;
grant all on amon.* TO 'amon'@'%' IDENTIFIED BY 'amon_password';
```
To show the list of databases:
```
[achintya@kumarnode0 ~]$ mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 17
Server version: 5.5.56 MySQL Community Server (GPL)

Copyright (c) 2000, 2017, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| amon               |
| hive               |
| hue                |
| mysql              |
| nav                |
| navms              |
| oozie              |
| performance_schema |
| rman               |
| scm                |
| sentry             |
+--------------------+
12 rows in set (0.00 sec)

mysql> 
```
