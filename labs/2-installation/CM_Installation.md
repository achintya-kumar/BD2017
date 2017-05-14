### CM/CDH Installation commands
Download CM 5.8.3 as following:
```
[achintya@kumarnode0 ~]$ wget http://archive.cloudera.com/cm5/installer/5.8.3/cloudera-manager-installer.bin
```
Set password for all users (in my case, user ```achintya```) on all nodes:
```
[achintya@kumarnode0 ~]$ passwd
New password:
Retype new password:
passwd: all authentication tokens updated successfully.
```
Enable password login for CM on all nodes:
```
[achintya@kumarnode0 ~]$ sudo perl -p -i -e "s/^PasswordAuthentication no/PasswordAuthentication yes/g" /etc/ssh/sshd_config
[achintya@kumarnode0 ~]$ sudo service sshd restart
```
