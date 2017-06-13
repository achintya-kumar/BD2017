#Place this download inside /root
#NOTE: this needs to be done on every node of the cluster, else the HDFS DataNodes will fail to start

wget \
    --no-cookies \
    --no-check-certificate \
    --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" \
    -O UnlimitedJCEPolicyJDK7.zip \
    http://download.oracle.com/otn-pub/java/jce/7/UnlimitedJCEPolicyJDK7.zip
