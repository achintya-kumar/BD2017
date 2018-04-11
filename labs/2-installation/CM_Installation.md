### CM/CDH Installation commands
Download CM 5.8.3 repo file as following:
```
# FOR CENTOS 6
wget https://archive.cloudera.com/cm5/redhat/6/x86_64/cm/cloudera-manager.repo

# FOR CENTOS 7
wget https://archive.cloudera.com/cm5/redhat/7/x86_64/cm/cloudera-manager.repo
```
Edit the downloaded repo file and edit the ```baseurl``` as follows:
```
[achintya@kumarnode0 ~]$ sudo nano cloudera-manager.repo

[cloudera-manager]
# Packages for Cloudera Manager, Version 5, on RedHat or CentOS 6 x86_64        
name=Cloudera Manager
baseurl=https://archive.cloudera.com/cm5/redhat/6/x86_64/cm/5.8.3/
gpgkey =https://archive.cloudera.com/cm5/redhat/6/x86_64/cm/RPM-GPG-KEY-cloudera
gpgcheck = 1


```
Finally, copy this edited file to ```/etc/yum.repos.d/```
```
cp cloudera-manager.repo /etc/yum.repos.d/ 
```
## Install Oracle JDK 1.7 (This will work only after the cloudera-manager.repo file has been downloaded and placed in the right location)
```
sudo yum install -y oracle-j2sdk1.7
```

## Install Cloudera Manager using the following:
```
sudo yum install cloudera-manager-daemons cloudera-manager-server
```

# ALTERNATIVE: The above CM installation can be also achieved by downloading an installer as shown below: JDK will be installed as a part of the process and no separate installation is needed.
Download CM 5.8.3 installer as following:
```
[achintya@kumarnode0 ~]$ wget http://archive.cloudera.com/cm5/installer/5.8.3/cloudera-manager-installer.bin
```
## Install Cloudera Manager Server and Cloudera Manager Daemons
```
sudo yum install cloudera-manager-daemons cloudera-manager-server
```
## Prepare databases for CM
SYNTAX: 
```
sudo /usr/share/cmf/schema/scm_prepare_database.sh <database-type> <database-name> <username> <user_password>
```
Example:
```
sudo /usr/share/cmf/schema/scm_prepare_database.sh mysql scm scm scm_password
```
Set password for all users (in my case, user ```achintya```) on all nodes:
```
[achintya@kumarnode0 ~]$ passwd
New password:
Retype new password:
passwd: all authentication tokens updated successfully.
```
# Enable password login for CM on all nodes:
```
[achintya@kumarnode0 ~]$ sudo perl -p -i -e "s/^PasswordAuthentication no/PasswordAuthentication yes/g" /etc/ssh/sshd_config
[achintya@kumarnode0 ~]$ sudo service sshd restart
```
