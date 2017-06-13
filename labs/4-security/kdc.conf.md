```
[kdcdefaults]
 kdc_ports = 88
 kdc_tcp_ports = 88

[realms]
 ACHINTYA-KUMAR = {
  #master_key_type = aes256-cts
  acl_file = /var/kerberos/krb5kdc/kadm5.acl
  dict_file = /usr/share/dict/words
  max_renewable_life = 7d
  max_life = 1d
  admin_keytab = /var/kerberos/krb5kdc/kadm5.keytab
  supported_enctypes = aes256-cts:normal aes128-cts:normal des3-hmac-sha1:norma$
  default_principal_flags = +renewable, +forwardable
 }
 ```
