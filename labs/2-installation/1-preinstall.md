### The nodes used for this assignment have the following specifications:
Operating System: CentOS 6.9  
Hardware: Standard DS11 (2 cores, 14 GB memory) from Microsoft Azure  
Number of Nodes: 2

### Disable SELinux & Kernel Firewall
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
Let us now disable the kernel firewall.
```
sudo /etc/init.d/iptables stop
sudo /etc/init.d/ip6tables stop
sudo chkconfig iptables off
sudo chkconfig ip6tables off
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
sudo sysctl -w vm.swappiness=1
```
To make this change permanent:
```
sudo nano /etc/sysctl.conf 
```
Add ```vm.swappiness=1``` to the file above.


### Mount Attributes of all volumes
The attributes are retrieved using the ```df``` command.
```
df -h
```
Output:
```
Filesystem      Size  Used Avail Use% Mounted on
/dev/sda1        30G   14G   15G  47% /
tmpfs           6,9G     0  6,9G   0% /dev/shm
/dev/sdb1        28G  322M   26G   2% /mnt/resource

```

### Show the reserve space of any non-root, ext-based volumes
#### TBD
### Disable Transparent Hugepage Support

To disable transparent hugepage compaction, the following must be appended to ```/etc/rc.local```.
```
echo never > /sys/kernel/mm/transparent_hugepage/defrag
echo never > /sys/kernel/mm/transparent_hugepage/enabled
```
Additionally, appent ```transparent_hugepage=never``` to the line ```kernel``` inside the file ```/etc/grub.conf```.
### Network Interface Configuration
```
[achintya@kumarnode0 ~]$ ifconfig 
eth0      Link encap:Ethernet  HWaddr 00:0D:3A:22:CA:76  
          inet addr:10.0.0.4  Bcast:10.0.0.255  Mask:255.255.255.0
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
10.0.0.4    kumarnode1
10.0.0.5    kumarnode2
#Other nodes', if any, must be appended here.
```
Using ```getent``` to list forward and reverse host lookups:
```
[achintya@kumarnode0 ~]$ getent hosts kumarnode1
10.0.0.4        kumarnode1

[achintya@kumarnode0 ~]$ getent hosts 10.0.0.4
10.0.0.4        kumarnode1
```
### Show the ```nscd``` service is running
Installing the ```nscd``` package:
```
sudo yum install nscd
```
Starting nscd service:
```
sudo service nscd start
# Making sure the service starts automatically at boot
sudo chkconfig nscd on
```
Checking nscd status:
```
[achintya@kumarnode0 ~]$ sudo service nscd status
nscd (pid 2292) is running...
```

### Show the ```ntpd``` service is running
Starting and checking the status of ```ntpd```:
```
[achintya@kumarnode0 ~]$ sudo service ntpd start
[achintya@kumarnode0 ~]$ sudo chkconfig ntpd on
[achintya@kumarnode0 ~]$ sudo service ntpd status
ntpd (pid  1602) is running...
```
## Reboot
```sudo reboot```
