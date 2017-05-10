### Download and implement the official MySQL repo
#### Enable the repo to install MySQL 5.5
The Linux distribution in use is CentOS 6.9 which is categorized as EL6.
An rpm file is downloaded and installed using the following commands. It is necessary to point out that in the installed rpm file, MySQL 5.6 is enabled by default.
```
[achintya@kumarnode0 ~]$ wget http://repo.mysql.com/mysql-community-release-el6-7.noarch.rpm
[achintya@kumarnode0 ~]$ sudo rpm -ivh mysql-community-release-el6-7.noarch.rpm
```
As mentioned above, the default version of MySQL enabled in this repository is 5.6. This maybe altered using the following commands.
```
[achintya@kumarnode0 ~]$ sudo yum-config-manager --disable mysql56-community
[achintya@kumarnode0 ~]$ sudo yum-config-manager --enable mysql55-community
```

#### Install the mysql package on all nodes
On other nodes, the following must be executed:
```
sudo yum install mysql
```
The important output is enclosed below:
```
Transaction Summary
================================================================================
Install       1 Package(s)

Total download size: 15 M
Installed size: 65 M
Is this ok [y/N]: y
Downloading Packages:
mysql-community-client-5.5.56-2.el6.x86_64.rpm           |  15 MB     00:00     
Running rpm_check_debug
Running Transaction Test
Transaction Test Succeeded
Running Transaction
  Installing : mysql-community-client-5.5.56-2.el6.x86_64                   1/1 
  Verifying  : mysql-community-client-5.5.56-2.el6.x86_64                   1/1 

Installed:
  mysql-community-client.x86_64 0:5.5.56-2.el6 
```
#### Install mysql-server on the server
Once the required versions are enabled, the installed repositories must be updated and the required programs must be installed as follows:
```
sudo yum install mysql-server
```
Important output is enclosed below:
```
Transaction Summary
==================================================================
Install       4 Package(s)

Total download size: 54 M
Installed size: 239 M
Is this ok [y/N]: y
Downloading Packages:
(1/4): mysql-community-client-5.5.56-2.el6 |  15 MB     00:00     
(2/4): mysql-community-common-5.5.56-2.el6 | 277 kB     00:00     
(3/4): mysql-community-libs-5.5.56-2.el6.x | 1.7 MB     00:00     
(4/4): mysql-community-server-5.5.56-2.el6 |  38 MB     00:00     
------------------------------------------------------------------
Total                              72 MB/s |  54 MB     00:00     
Running rpm_check_debug
Running Transaction Test
Transaction Test Succeeded
Running Transaction
  Installing : mysql-community-common-5.5.56-2.el6.x86_64     1/4 
  Installing : mysql-community-libs-5.5.56-2.el6.x86_64       2/4 
  Installing : mysql-community-client-5.5.56-2.el6.x86_64     3/4 
  Installing : mysql-community-server-5.5.56-2.el6.x86_64     4/4 
  Verifying  : mysql-community-client-5.5.56-2.el6.x86_64     1/4 
  Verifying  : mysql-community-common-5.5.56-2.el6.x86_64     2/4 
  Verifying  : mysql-community-libs-5.5.56-2.el6.x86_64       3/4 
  Verifying  : mysql-community-server-5.5.56-2.el6.x86_64     4/4 

Installed:
  mysql-community-server.x86_64 0:5.5.56-2.el6                    

Dependency Installed:
  mysql-community-client.x86_64 0:5.5.56-2.el6                    
  mysql-community-common.x86_64 0:5.5.56-2.el6                    
  mysql-community-libs.x86_64 0:5.5.56-2.el6 
```
#### Download and copy the JDBC connector to all nodes.
