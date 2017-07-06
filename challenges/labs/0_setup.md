### Add users with specific UIDs
```
sudo adduser neymar -u 2010
sudo adduser ronaldo -u 2016
```

### Add groups
```
sudo groupadd barca
sudo groupadd merengues
```

### Add users to the groups created above
```
sudo usermod -a -G barca ronaldo
sudo usermod -a -G merengues neymar
```

### List password entries for ```neymar``` and ```ronaldo```
```
cat /etc/passwd | grep neymar
neymar:x:2010:2010::/home/neymar:/bin/bash
```
```
cat /etc/passwd | grep ronaldo
ronaldo:x:2016:2016::/home/ronaldo:/bin/bash
```

### List group entires for ```barca``` and ```merengues```
```
cat /etc/group | grep barca
barca:x:2017:ronaldo
```
```
cat /etc/group | grep merengues
merengues:x:2018:neymar
```

