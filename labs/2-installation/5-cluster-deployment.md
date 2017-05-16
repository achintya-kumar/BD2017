```json
{
  "timestamp" : "2017-05-15T23:56:47.601Z",
  "clusters" : [ {
    "name" : "achintya-kumar",
    "version" : "CDH5",
    "services" : [ {
      "name" : "oozie",
      "type" : "OOZIE",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "OOZIE_SERVER",
          "items" : [ {
            "name" : "oozie_database_host",
            "value" : "kumarnode0.westeurope.cloudapp.azure.com:7432"
          }, {
            "name" : "oozie_database_name",
            "value" : "oozie_oozie_server"
          }, {
            "name" : "oozie_database_password",
            "value" : "pSf42QPq7t"
          }, {
            "name" : "oozie_database_type",
            "value" : "postgresql"
          }, {
            "name" : "oozie_database_user",
            "value" : "oozie_oozie_server"
          }, {
            "name" : "oozie_java_heapsize",
            "value" : "932184064"
          } ]
        } ],
        "items" : [ {
          "name" : "hive_service",
          "value" : "hive"
        }, {
          "name" : "mapreduce_yarn_service",
          "value" : "yarn"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "oozie-OOZIE_SERVER-fd271d7516a20212b84440063e0ec55f",
        "type" : "OOZIE_SERVER",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "91tavti82vii82yvtqurom1r3"
          } ]
        }
      } ],
      "displayName" : "Oozie"
    }, {
      "name" : "hue",
      "type" : "HUE",
      "config" : {
        "roleTypeConfigs" : [ ],
        "items" : [ {
          "name" : "database_host",
          "value" : "kumarnode0.westeurope.cloudapp.azure.com"
        }, {
          "name" : "database_password",
          "value" : "93PAJXA7ej"
        }, {
          "name" : "database_port",
          "value" : "7432"
        }, {
          "name" : "database_type",
          "value" : "postgresql"
        }, {
          "name" : "hive_service",
          "value" : "hive"
        }, {
          "name" : "hue_webhdfs",
          "value" : "hdfs-HTTPFS-d8552a9542268ca2e1195e55c890de13"
        }, {
          "name" : "oozie_service",
          "value" : "oozie"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "hue-HUE_SERVER-fd271d7516a20212b84440063e0ec55f",
        "type" : "HUE_SERVER",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "6i8f0cu6w5owo0gv2zh7pd3et"
          }, {
            "name" : "secret_key",
            "value" : "j5hAlWpaetSZri8op61hSKSUcqmdhB"
          } ]
        }
      } ],
      "displayName" : "Hue"
    }, {
      "name" : "zookeeper",
      "type" : "ZOOKEEPER",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "SERVER",
          "items" : [ {
            "name" : "zookeeper_server_java_heapsize",
            "value" : "932184064"
          } ]
        } ],
        "items" : [ ]
      },
      "roles" : [ {
        "name" : "zookeeper-SERVER-571d76cda821282c5040741b43231499",
        "type" : "SERVER",
        "hostRef" : {
          "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "8pslaayi9zw2ybc4k3cc5ri3e"
          }, {
            "name" : "serverId",
            "value" : "3"
          } ]
        }
      }, {
        "name" : "zookeeper-SERVER-d8552a9542268ca2e1195e55c890de13",
        "type" : "SERVER",
        "hostRef" : {
          "hostId" : "1996e121-c9ba-441e-9c55-0613292caa57"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "doco813hd8g7yf6u8eyyno769"
          }, {
            "name" : "serverId",
            "value" : "2"
          } ]
        }
      }, {
        "name" : "zookeeper-SERVER-fd271d7516a20212b84440063e0ec55f",
        "type" : "SERVER",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "7qagtv4iim3mndrl4ok4du1la"
          }, {
            "name" : "serverId",
            "value" : "1"
          } ]
        }
      } ],
      "displayName" : "ZooKeeper"
    }, {
      "name" : "hdfs",
      "type" : "HDFS",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "BALANCER",
          "items" : [ {
            "name" : "balancer_java_heapsize",
            "value" : "932184064"
          } ]
        }, {
          "roleType" : "DATANODE",
          "items" : [ {
            "name" : "dfs_data_dir_list",
            "value" : "/mnt/resource/dfs/dn"
          } ]
        }, {
          "roleType" : "GATEWAY",
          "items" : [ {
            "name" : "dfs_client_use_trash",
            "value" : "true"
          } ]
        }, {
          "roleType" : "NAMENODE",
          "items" : [ {
            "name" : "dfs_name_dir_list",
            "value" : "/mnt/resource/dfs/nn"
          }, {
            "name" : "dfs_namenode_servicerpc_address",
            "value" : "8022"
          } ]
        }, {
          "roleType" : "SECONDARYNAMENODE",
          "items" : [ {
            "name" : "fs_checkpoint_dir_list",
            "value" : "/mnt/resource/dfs/snn"
          } ]
        } ],
        "items" : [ {
          "name" : "dfs_block_size",
          "value" : "268435456"
        }, {
          "name" : "dfs_ha_fencing_cloudera_manager_secret_key",
          "value" : "k4ANpHyjgQQrFB62VaFDlYuGo6wPgE"
        }, {
          "name" : "fc_authorization_secret_key",
          "value" : "rPtPxDTHRa1jvkLtCL5A3nLiJ8nkNJ"
        }, {
          "name" : "http_auth_signature_secret",
          "value" : "lJUKB3i6RFsi8pdAaD8g2kDz8HmZsK"
        }, {
          "name" : "rm_dirty",
          "value" : "true"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "hdfs-BALANCER-fd271d7516a20212b84440063e0ec55f",
        "type" : "BALANCER",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ ]
        }
      }, {
        "name" : "hdfs-DATANODE-571d76cda821282c5040741b43231499",
        "type" : "DATANODE",
        "hostRef" : {
          "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "59xmbv5yol5um86rjdex6lvvj"
          } ]
        }
      }, {
        "name" : "hdfs-DATANODE-d8552a9542268ca2e1195e55c890de13",
        "type" : "DATANODE",
        "hostRef" : {
          "hostId" : "1996e121-c9ba-441e-9c55-0613292caa57"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "7j23arrng4qpadisu03l8a87"
          } ]
        }
      }, {
        "name" : "hdfs-DATANODE-fd271d7516a20212b84440063e0ec55f",
        "type" : "DATANODE",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "cwvc7rgbitgmkx845wecpv8i3"
          } ]
        }
      }, {
        "name" : "hdfs-HTTPFS-d8552a9542268ca2e1195e55c890de13",
        "type" : "HTTPFS",
        "hostRef" : {
          "hostId" : "1996e121-c9ba-441e-9c55-0613292caa57"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "5i17uq46r6z256oawk61srkt6"
          } ]
        }
      }, {
        "name" : "hdfs-NAMENODE-fd271d7516a20212b84440063e0ec55f",
        "type" : "NAMENODE",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "namenode_id",
            "value" : "54"
          }, {
            "name" : "role_jceks_password",
            "value" : "3le0nx98k6zvy37felw7hyvh1"
          } ]
        }
      }, {
        "name" : "hdfs-NFSGATEWAY-571d76cda821282c5040741b43231499",
        "type" : "NFSGATEWAY",
        "hostRef" : {
          "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "8px6n5x85uj29o5hz0k7x3djy"
          } ]
        }
      }, {
        "name" : "hdfs-SECONDARYNAMENODE-571d76cda821282c5040741b43231499",
        "type" : "SECONDARYNAMENODE",
        "hostRef" : {
          "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "bk0yh708xo8ib18e1lfombqw0"
          } ]
        }
      } ],
      "displayName" : "HDFS"
    }, {
      "name" : "yarn",
      "type" : "YARN",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "GATEWAY",
          "items" : [ {
            "name" : "mapred_reduce_tasks",
            "value" : "6"
          }, {
            "name" : "mapred_submit_replication",
            "value" : "1"
          } ]
        }, {
          "roleType" : "JOBHISTORY",
          "items" : [ {
            "name" : "mr2_jobhistory_java_heapsize",
            "value" : "932184064"
          } ]
        }, {
          "roleType" : "NODEMANAGER",
          "items" : [ {
            "name" : "yarn_nodemanager_heartbeat_interval_ms",
            "value" : "100"
          }, {
            "name" : "yarn_nodemanager_local_dirs",
            "value" : "/mnt/resource/yarn/nm"
          }, {
            "name" : "yarn_nodemanager_log_dirs",
            "value" : "/mnt/resource/yarn/container-logs"
          }, {
            "name" : "yarn_nodemanager_resource_cpu_vcores",
            "value" : "4"
          }, {
            "name" : "yarn_nodemanager_resource_memory_mb",
            "value" : "5043"
          } ]
        }, {
          "roleType" : "RESOURCEMANAGER",
          "items" : [ {
            "name" : "resource_manager_java_heapsize",
            "value" : "932184064"
          }, {
            "name" : "yarn_scheduler_maximum_allocation_mb",
            "value" : "15462"
          }, {
            "name" : "yarn_scheduler_maximum_allocation_vcores",
            "value" : "4"
          } ]
        } ],
        "items" : [ {
          "name" : "hdfs_service",
          "value" : "hdfs"
        }, {
          "name" : "rm_dirty",
          "value" : "true"
        }, {
          "name" : "zk_authorization_secret_key",
          "value" : "wt0NskvBkWEsBuqtEXFR49ZCgP3Sl0"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "yarn-JOBHISTORY-fd271d7516a20212b84440063e0ec55f",
        "type" : "JOBHISTORY",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "5jwqu052pxtsanvqny3pmjzwf"
          } ]
        }
      }, {
        "name" : "yarn-NODEMANAGER-571d76cda821282c5040741b43231499",
        "type" : "NODEMANAGER",
        "hostRef" : {
          "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "f4jskda43wid37gek5aee2pxt"
          } ]
        }
      }, {
        "name" : "yarn-NODEMANAGER-d8552a9542268ca2e1195e55c890de13",
        "type" : "NODEMANAGER",
        "hostRef" : {
          "hostId" : "1996e121-c9ba-441e-9c55-0613292caa57"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "bawhf335x8isf2bi37fmt4lcq"
          } ]
        }
      }, {
        "name" : "yarn-NODEMANAGER-fd271d7516a20212b84440063e0ec55f",
        "type" : "NODEMANAGER",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "erqg74jm1gblqy41p1zqplenu"
          } ]
        }
      }, {
        "name" : "yarn-RESOURCEMANAGER-fd271d7516a20212b84440063e0ec55f",
        "type" : "RESOURCEMANAGER",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "rm_id",
            "value" : "50"
          }, {
            "name" : "role_jceks_password",
            "value" : "kn0l1hs71gxqviptql7esz3e"
          } ]
        }
      } ],
      "displayName" : "YARN (MR2 Included)"
    }, {
      "name" : "hive",
      "type" : "HIVE",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "HIVEMETASTORE",
          "items" : [ {
            "name" : "hive_metastore_java_heapsize",
            "value" : "4067426304"
          }, {
            "name" : "hive_metastore_server_max_message_size",
            "value" : "406742630"
          } ]
        }, {
          "roleType" : "HIVESERVER2",
          "items" : [ {
            "name" : "hiveserver2_java_heapsize",
            "value" : "932184064"
          }, {
            "name" : "hiveserver2_spark_driver_memory",
            "value" : "966367641"
          }, {
            "name" : "hiveserver2_spark_executor_cores",
            "value" : "4"
          }, {
            "name" : "hiveserver2_spark_executor_memory",
            "value" : "1030330777"
          }, {
            "name" : "hiveserver2_spark_yarn_driver_memory_overhead",
            "value" : "102"
          }, {
            "name" : "hiveserver2_spark_yarn_executor_memory_overhead",
            "value" : "173"
          } ]
        } ],
        "items" : [ {
          "name" : "hive_metastore_database_host",
          "value" : "kumarnode0.westeurope.cloudapp.azure.com"
        }, {
          "name" : "hive_metastore_database_name",
          "value" : "hive"
        }, {
          "name" : "hive_metastore_database_password",
          "value" : "B6YeGsqxLO"
        }, {
          "name" : "hive_metastore_database_port",
          "value" : "7432"
        }, {
          "name" : "hive_metastore_database_type",
          "value" : "postgresql"
        }, {
          "name" : "mapreduce_yarn_service",
          "value" : "yarn"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "hive-GATEWAY-571d76cda821282c5040741b43231499",
        "type" : "GATEWAY",
        "hostRef" : {
          "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67"
        },
        "config" : {
          "items" : [ ]
        }
      }, {
        "name" : "hive-GATEWAY-d8552a9542268ca2e1195e55c890de13",
        "type" : "GATEWAY",
        "hostRef" : {
          "hostId" : "1996e121-c9ba-441e-9c55-0613292caa57"
        },
        "config" : {
          "items" : [ ]
        }
      }, {
        "name" : "hive-GATEWAY-fd271d7516a20212b84440063e0ec55f",
        "type" : "GATEWAY",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ ]
        }
      }, {
        "name" : "hive-HIVEMETASTORE-571d76cda821282c5040741b43231499",
        "type" : "HIVEMETASTORE",
        "hostRef" : {
          "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "a4jhs8oc2y7afiv9pky4qey55"
          } ]
        }
      }, {
        "name" : "hive-HIVEMETASTORE-fd271d7516a20212b84440063e0ec55f",
        "type" : "HIVEMETASTORE",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "551b6s90gb71o1luc5gf6y9gg"
          } ]
        }
      }, {
        "name" : "hive-HIVESERVER2-fd271d7516a20212b84440063e0ec55f",
        "type" : "HIVESERVER2",
        "hostRef" : {
          "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "4hqxqgdumhshti3krrpif0jpv"
          } ]
        }
      }, {
        "name" : "hive-WEBHCAT-571d76cda821282c5040741b43231499",
        "type" : "WEBHCAT",
        "hostRef" : {
          "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67"
        },
        "config" : {
          "items" : [ {
            "name" : "hive_webhcat_secret_key",
            "value" : "wAFr9A6f2hDBnt9wHhQIgdJKIhILfe"
          }, {
            "name" : "role_jceks_password",
            "value" : "sqy6ok0a2fp70y3vbia0u7s4"
          } ]
        }
      } ],
      "displayName" : "Hive"
    } ]
  } ],
  "hosts" : [ {
    "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6",
    "ipAddress" : "10.0.0.4",
    "hostname" : "kumarnode0.westeurope.cloudapp.azure.com",
    "rackId" : "/default",
    "config" : {
      "items" : [ {
        "name" : "memory_overcommit_threshold",
        "value" : "1"
      } ]
    }
  }, {
    "hostId" : "2ffc4111-7811-4ed4-b11b-562a49901e67",
    "ipAddress" : "10.0.0.4",
    "hostname" : "kumarnode1.northeurope.cloudapp.azure.com",
    "rackId" : "/default",
    "config" : {
      "items" : [ {
        "name" : "memory_overcommit_threshold",
        "value" : "1"
      } ]
    }
  }, {
    "hostId" : "1996e121-c9ba-441e-9c55-0613292caa57",
    "ipAddress" : "10.0.0.4",
    "hostname" : "kumarnode2.westus.cloudapp.azure.com",
    "rackId" : "/default",
    "config" : {
      "items" : [ {
        "name" : "memory_overcommit_threshold",
        "value" : "1"
      } ]
    }
  } ],
  "users" : [ {
    "name" : "__cloudera_internal_user__mgmt-ACTIVITYMONITOR-fd271d7516a20212b84440063e0ec55f",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "7e2e6fbde4c17b29de37e90ec72bd9ac0c0b0585a8ad5f7e4df4b8dfb2d59ee4",
    "pwSalt" : 2394975610285182261,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-EVENTSERVER-fd271d7516a20212b84440063e0ec55f",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "473b9dd27d357306cbf807b83273bede83baea522730f183b38cb8461e74f2db",
    "pwSalt" : -2249594743447065272,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-HOSTMONITOR-fd271d7516a20212b84440063e0ec55f",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "49bbc1aa8d0214377568bfa6f35c979ae1b63cb3e5d1811b3bc676fd28614bbb",
    "pwSalt" : 2796055613751775444,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-REPORTSMANAGER-fd271d7516a20212b84440063e0ec55f",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "fc606302e25ec88a6de9167ac4cf4bc73e57482c0988368ca24c7449905ccdbd",
    "pwSalt" : -3445187476500571105,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-SERVICEMONITOR-fd271d7516a20212b84440063e0ec55f",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "dc8b209a3a8999320f6ced3f2977ab67d7bbacd4e4cd596c3667368a719f5f41",
    "pwSalt" : 8090569753168022781,
    "pwLogin" : true
  }, {
    "name" : "admin",
    "roles" : [ "ROLE_ADMIN" ],
    "pwHash" : "105955e5ec4210d680137d278f4ca26e1af9f0e89a284c230ee000bb379ba5b6",
    "pwSalt" : 1452865557137224448,
    "pwLogin" : true
  } ],
  "versionInfo" : {
    "version" : "5.11.0",
    "buildUser" : "jenkins",
    "buildTimestamp" : "20170412-1249",
    "gitHash" : "70cb1442626406432a6e7af5bdf206a384ca3f98",
    "snapshot" : false
  },
  "managementService" : {
    "name" : "mgmt",
    "type" : "MGMT",
    "config" : {
      "roleTypeConfigs" : [ {
        "roleType" : "ACTIVITYMONITOR",
        "items" : [ {
          "name" : "firehose_database_host",
          "value" : "kumarnode0.westeurope.cloudapp.azure.com:7432"
        }, {
          "name" : "firehose_database_name",
          "value" : "amon"
        }, {
          "name" : "firehose_database_password",
          "value" : "6rIgIdxIfo"
        }, {
          "name" : "firehose_database_type",
          "value" : "postgresql"
        }, {
          "name" : "firehose_database_user",
          "value" : "amon"
        }, {
          "name" : "firehose_heapsize",
          "value" : "932184064"
        } ]
      }, {
        "roleType" : "EVENTSERVER",
        "items" : [ {
          "name" : "event_server_heapsize",
          "value" : "932184064"
        } ]
      }, {
        "roleType" : "HOSTMONITOR",
        "items" : [ {
          "name" : "firehose_non_java_memory_bytes",
          "value" : "1610612736"
        } ]
      }, {
        "roleType" : "REPORTSMANAGER",
        "items" : [ {
          "name" : "headlamp_database_host",
          "value" : "kumarnode0.westeurope.cloudapp.azure.com:7432"
        }, {
          "name" : "headlamp_database_name",
          "value" : "rman"
        }, {
          "name" : "headlamp_database_password",
          "value" : "23M8nxpsNm"
        }, {
          "name" : "headlamp_database_type",
          "value" : "postgresql"
        }, {
          "name" : "headlamp_database_user",
          "value" : "rman"
        }, {
          "name" : "headlamp_heapsize",
          "value" : "932184064"
        } ]
      }, {
        "roleType" : "SERVICEMONITOR",
        "items" : [ {
          "name" : "firehose_non_java_memory_bytes",
          "value" : "1610612736"
        } ]
      } ],
      "items" : [ ]
    },
    "roles" : [ {
      "name" : "mgmt-ACTIVITYMONITOR-fd271d7516a20212b84440063e0ec55f",
      "type" : "ACTIVITYMONITOR",
      "hostRef" : {
        "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "b6psyu5wlshmxb7wnxxs2qccx"
        } ]
      }
    }, {
      "name" : "mgmt-ALERTPUBLISHER-fd271d7516a20212b84440063e0ec55f",
      "type" : "ALERTPUBLISHER",
      "hostRef" : {
        "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "k1gechd7qvkbav95tr139jva"
        } ]
      }
    }, {
      "name" : "mgmt-EVENTSERVER-fd271d7516a20212b84440063e0ec55f",
      "type" : "EVENTSERVER",
      "hostRef" : {
        "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "ac5cfqcs6sl9y22hgku2st6go"
        } ]
      }
    }, {
      "name" : "mgmt-HOSTMONITOR-fd271d7516a20212b84440063e0ec55f",
      "type" : "HOSTMONITOR",
      "hostRef" : {
        "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "edawfdcjm4su2yb0oyzimqq9o"
        } ]
      }
    }, {
      "name" : "mgmt-REPORTSMANAGER-fd271d7516a20212b84440063e0ec55f",
      "type" : "REPORTSMANAGER",
      "hostRef" : {
        "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "6m9icntai2c0mu3mk3jgo9bdk"
        } ]
      }
    }, {
      "name" : "mgmt-SERVICEMONITOR-fd271d7516a20212b84440063e0ec55f",
      "type" : "SERVICEMONITOR",
      "hostRef" : {
        "hostId" : "f9f7d92b-d3d5-40e1-a19d-510f2b159ab6"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "b1jyzx5nrsm9sowexwtpkf8e2"
        } ]
      }
    } ],
    "displayName" : "Cloudera Management Service"
  },
  "managerSettings" : {
    "items" : [ {
      "name" : "CLUSTER_STATS_START",
      "value" : "10/22/2012 13:20"
    }, {
      "name" : "PUBLIC_CLOUD_STATUS",
      "value" : "NOT_ON_PUBLIC_CLOUD"
    }, {
      "name" : "REMOTE_PARCEL_REPO_URLS",
      "value" : "https://archive.cloudera.com/cdh5/parcels/{latest_supported}/,https://archive.cloudera.com/cdh4/parcels/latest/,https://archive.cloudera.com/impala/parcels/latest/,https://archive.cloudera.com/search/parcels/latest/,https://archive.cloudera.com/accumulo/parcels/1.4/,https://archive.cloudera.com/accumulo-c5/parcels/latest/,https://archive.cloudera.com/kafka/parcels/latest/,https://archive.cloudera.com/navigator-keytrustee5/parcels/latest/,http://archive.cloudera.com/kudu/parcels/latest/,https://archive.cloudera.com/spark/parcels/latest/,https://archive.cloudera.com/sqoop-connectors/parcels/latest/"
    } ]
  }
}
```
