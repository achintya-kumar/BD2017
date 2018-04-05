### Download and implement the official MySQL repo
#### Enable the repo to install MySQL 5.5
The Linux distribution in use is CentOS 6.9 which is categorized as EL6.
An rpm file is downloaded and installed using the following commands. It is necessary to point out that in the installed rpm file, MySQL 5.6 is enabled by default.
```
wget http://repo.mysql.com/mysql-community-release-el6-7.noarch.rpm
sudo rpm -ivh mysql-community-release-el6-7.noarch.rpm
```
As mentioned above, the default version of MySQL enabled in this repository is 5.6. This maybe altered using the following commands.
```
sudo yum-config-manager --disable mysql56-community
sudo yum-config-manager --enable mysql55-community
sudo yum update -y
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

#### Install the mysql package on all OTHER nodes
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

#### Display MySQL Version
```
mysql --version
mysql  Ver 14.14 Distrib 5.5.56, for Linux (x86_64) using readline 5.1
```

#### Download and copy the JDBC connector to all nodes.
Download the MySQL JDBC driver:
```
wget https://cdn.mysql.com//Downloads/Connector-J/mysql-connector-java-5.1.44.tar.gz

```
The JDBC JAR file is extracted as follows:
```
tar zxvf mysql-connector-java-5.1.44.tar.gz
```
Copy the JDBC driver JAR file to ```/usr/share``` folder.
```
# On minimal images of CentOS, /usr/share/java does not exist.
sudo mkdir /usr/share/java
sudo cp mysql-connector-java-5.1.42/mysql-connector-java-5.1.44-bin.jar /usr/share/java/mysql-connector-java.jar
```

### YUM repository file
```
[achintya@kumarnode0 ~]$ cat /etc/yum.repos.d/
CentOS-Base.repo             CentOS-fasttrack.repo        CentOS-Vault.repo            mysql-community-source.repo
CentOS-Debuginfo.repo        CentOS-Media.repo            mysql-community.repo         OpenLogic.repo
[achintya@kumarnode0 ~]$ cat /etc/yum.repos.d/mysql-community.repo 
[mysql-connectors-community]
name=MySQL Connectors Community
baseurl=http://repo.mysql.com/yum/mysql-connectors-community/el/6/$basearch/
enabled=1
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-mysql

[mysql-tools-community]
name=MySQL Tools Community
baseurl=http://repo.mysql.com/yum/mysql-tools-community/el/6/$basearch/
enabled=1
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-mysql

# Enable to use MySQL 5.5
[mysql55-community]
name=MySQL 5.5 Community Server
baseurl=http://repo.mysql.com/yum/mysql-5.5-community/el/6/$basearch/
enabled=1
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-mysql

# Enable to use MySQL 5.6
[mysql56-community]
name=MySQL 5.6 Community Server
baseurl=http://repo.mysql.com/yum/mysql-5.6-community/el/6/$basearch/
enabled=0
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-mysql

[mysql57-community]
name=MySQL 5.7 Community Server
baseurl=http://repo.mysql.com/yum/mysql-5.7-community/el/6/$basearch/
enabled=0
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-mysql
```
