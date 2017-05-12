### Installing Oracle JDK
Download Oracle JDK 1.8 using the following command.
```
wget --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u102-b14/jdk-8u102-linux-x64.rpm
```
Install the downloaded .rpm file using the following command. 
```
sudo yum localinstall jdk-8u102-linux-x64.rpm
```
Set the environment variables in ```.bash_profile``` file.
```
# User specific environment and startup programs

export JAVA_HOME=/usr/java/jdk1.8.0_102/
export JRE_HOME=/usr/java/jdk1.8.0_102/jre

PATH=$PATH:$HOME/bin:$JAVA_HOME/bin

export PATH
```
Source the ```.bash_profile``` file and test the set environment variables.
```
$ source .bash_profile

$ echo $JRE_HOME
/usr/java/jdk1.8.0_102/jre

$ echo $JAVA_HOME
/usr/java/jdk1.8.0_102/

$ echo $PATH
/...:/usr/local/bin:/usr/X11R6/bin:/home/mkyong/bin:/usr/java/jdk1.8.0_102//bin
```
When multiple JDKs are present, a choice can be made as follows:
```
$ sudo alternatives --config java
[sudo] password for mkyong:

There are 2 programs which provide 'java'.

  Selection    Command
-----------------------------------------------
   1           /usr/lib/jvm/jre-1.6.0-openjdk.x86_64/bin/java
*+ 2           /usr/java/jdk1.8.0_102/jre/bin/java

Enter to keep the current selection[+], or type selection number:
```
### Disable SELinux
The value of the parameter ```SELINUX``` must be set to ```disabled```.
```
[achintya@kumarnode0 ~]$ sudo nano /etc/sysconfig/selinux

# This file controls the state of SELinux on the system.
# SELINUX= can take one of these three values:
#     enforcing - SELinux security policy is enforced.
#     permissive - SELinux prints warnings instead of enforcing.
#     disabled - No SELinux policy is loaded.
SELINUX=disabled
# SELINUXTYPE= can take one of these two values:
#     targeted - Targeted processes are protected,
#     mls - Multi Level Security protection.
SELINUXTYPE=targeted 

```

### Checking and setting swappiness
Display swappiness value:
```
cat /proc/sys/vm/swappiness
```
Output:
```
vm.swappiness = 60
```
Altering the swappiness value:
```
sudo sysctl -w vm.swappiness=10 
```


### Mount Attributes of all volumes
The attributes are retrieved using the ```df``` command.
```
df -h
```
Output:
```
Filesystem      Size  Used Avail Use% Mounted on
/dev/sda1        30G  2,8G   26G  10% /
tmpfs           6,9G     0  6,9G   0% /dev/shm
/dev/sdb1        99G   60M   94G   1% /mnt/resource
```

### Show the reserve space of any non-root, ext-based volumes
#### TBD
### Disable Transparent Hugepage Support
To disable transparent hugepage compaction, the following must be appended to ```/etc/rc.local```.
```
echo never > /sys/kernel/mm/redhat_transparent_hugepage/defrag
```
### Network Interface Configuration
```
[achintya@kumarnode0 ~]$ ifconfig 
eth0      Link encap:Ethernet  HWaddr 00:0D:3A:22:CA:76  
          inet addr:10.0.1.4  Bcast:10.0.1.255  Mask:255.255.255.0
          inet6 addr: fe80::20d:3aff:fe22:ca76/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:338 errors:0 dropped:0 overruns:0 frame:0
          TX packets:417 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000 
          RX bytes:135316 (132.1 KiB)  TX bytes:57345 (56.0 KiB)

lo        Link encap:Local Loopback  
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:65536  Metric:1
          RX packets:0 errors:0 dropped:0 overruns:0 frame:0
          TX packets:0 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:0 (0.0 b)  TX bytes:0 (0.0 b)
```
### Setting Forward and Reverse Host Lookup
The IP addresses, FQDNs and hostnames of all nodes in the cluster are added to ```/etc/hosts``` files of each node.
```
sudo nano /etc/hosts
```
```
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6
10.0.1.4    kumarnode0.westeurope.cloudapp.azure.com kumarnode0.sws41cumpmnuhjudurv0qqubnf.ax.internal.cloudapp.net kumarnode0
10.0.1.5    kumarnode1.westeurope.cloudapp.azure.com kumarnode1.sws41cumpmnuhjudurv0qqubnf.ax.internal.cloudapp.net kumarnode1
#Other nodes', if any, must be appended here.
```
Using ```getent``` to list forward and reverse host lookups:
```
[achintya@kumarnode0 ~]$ getent hosts kumarnode0
10.0.1.4        kumarnode0.westeurope.cloudapp.azure.com kumarnode0.sws41cumpmnuhjudurv0qqubnf.ax.internal.cloudapp.net kumarnode0

[achintya@kumarnode0 ~]$ getent hosts 10.0.1.4
10.0.1.4        kumarnode0.westeurope.cloudapp.azure.com kumarnode0.sws41cumpmnuhjudurv0qqubnf.ax.internal.cloudapp.net kumarnode0

```
### Show the ```nscd``` service is running
Installing the ```nscd``` package:
```
sudo yum install nscd
```
Starting nscd service:
```
service nscd start
```
Checking nscd status:
```
[achintya@kumarnode0 ~]$ service nscd status
nscd (pid 2292) is running...
```

### Show the ```ntpd``` service is running
Starting and checking the status of ```ntpd```:
```
[achintya@kumarnode0 ~]$ service ntpd start
[achintya@kumarnode0 ~]$ service ntpd status
ntpd (pid  1602) is running...
```
