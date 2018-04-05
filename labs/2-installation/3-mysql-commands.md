To list the MySQL version:
```
[achintya@kumarnode0 ~]$ mysql --version
mysql  Ver 14.14 Distrib 5.5.56, for Linux (x86_64) using readline 5.1
```

## Run MySQL secure installation
```
# Make sure mysqld is running
sudo service mysqld start
sudo /usr/bin/mysql_secure_installation

[...]
Enter current password for root (enter for none):
OK, successfully used password, moving on...
[...]
Set root password? [Y/n] y
New password:
Re-enter new password:
Remove anonymous users? [Y/n] Y
[...]
Disallow root login remotely? [Y/n] N
[...]
Remove test database and access to it [Y/n] Y
[...]
Reload privilege tables now? [Y/n] Y
All done!
```
## Database Creation
### Log into mysql server
```
mysql -u root
```
## Create Databases for SCM(scm), Activity Monitor(amon), Reports Manager(rman), Hive Metastore Server(hive), Hue Server(hue), Sentry Server(sentry), Cloudera Navigator Audit Server(nav), Cloudera Navigator Metadata Server(navms) and Oozie(oozie)
For example:
```
create database scm DEFAULT CHARACTER SET utf8;
create database amon DEFAULT CHARACTER SET utf8;
create database rman DEFAULT CHARACTER SET utf8;
create database hive DEFAULT CHARACTER SET utf8;
create database hue DEFAULT CHARACTER SET utf8;
create database sentry DEFAULT CHARACTER SET utf8;
create database nav DEFAULT CHARACTER SET utf8;
create database navms DEFAULT CHARACTER SET utf8;
create database oozie DEFAULT CHARACTER SET utf8;

grant all on scm.* TO 'scm'@'%' IDENTIFIED BY 'scm_password';
grant all on amon.* TO 'amon'@'%' IDENTIFIED BY 'amon_password';
grant all on rman.* TO 'rman'@'%' IDENTIFIED BY 'rman_password';
grant all on hive.* TO 'hive'@'%' IDENTIFIED BY 'hive_password';
grant all on hue.* TO 'hue'@'%' IDENTIFIED BY 'hue_password';
grant all on sentry.* TO 'sentry'@'%' IDENTIFIED BY 'sentry_password';
grant all on nav.* TO 'nav'@'%' IDENTIFIED BY 'nav_password';
grant all on navms.* TO 'navms'@'%' IDENTIFIED BY 'navms_password';
grant all on oozie.* TO 'oozie'@'%' IDENTIFIED BY 'oozie_password';
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
