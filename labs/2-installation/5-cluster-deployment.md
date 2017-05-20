```
{
  "timestamp" : "2017-05-20T07:56:08.650Z",
  "clusters" : [ {
    "name" : "Cluster 1",
    "version" : "CDH5",
    "services" : [ {
      "name" : "hive",
      "type" : "HIVE",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "HIVEMETASTORE",
          "items" : [ {
            "name" : "hive_metastore_java_heapsize",
            "value" : "407896064"
          } ]
        }, {
          "roleType" : "HIVESERVER2",
          "items" : [ {
            "name" : "hiveserver2_java_heapsize",
            "value" : "407896064"
          }, {
            "name" : "hiveserver2_spark_driver_memory",
            "value" : "966367641"
          }, {
            "name" : "hiveserver2_spark_executor_cores",
            "value" : "2"
          }, {
            "name" : "hiveserver2_spark_executor_memory",
            "value" : "912680550"
          }, {
            "name" : "hiveserver2_spark_yarn_driver_memory_overhead",
            "value" : "102"
          }, {
            "name" : "hiveserver2_spark_yarn_executor_memory_overhead",
            "value" : "153"
          } ]
        } ],
        "items" : [ {
          "name" : "hive_metastore_database_host",
          "value" : "kumarnode1"
        }, {
          "name" : "hive_metastore_database_name",
          "value" : "hive"
        }, {
          "name" : "hive_metastore_database_password",
          "value" : "hive_password"
        }, {
          "name" : "mapreduce_yarn_service",
          "value" : "yarn"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "hive-GATEWAY-4a0b1f2952c13923dd0a57d2f799f9c3",
        "type" : "GATEWAY",
        "hostRef" : {
          "hostId" : "b0082016-c859-40db-822e-d4805988ec6b"
        },
        "config" : {
          "items" : [ ]
        }
      }, {
        "name" : "hive-GATEWAY-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "GATEWAY",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ ]
        }
      }, {
        "name" : "hive-HIVEMETASTORE-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "HIVEMETASTORE",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "3islhbcf9vb16348iounvg6su"
          } ]
        }
      }, {
        "name" : "hive-HIVESERVER2-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "HIVESERVER2",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "ddpfuo0vnbrlxw7cwpt1hkqqp"
          } ]
        }
      } ],
      "displayName" : "Hive"
    }, {
      "name" : "zookeeper",
      "type" : "ZOOKEEPER",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "SERVER",
          "items" : [ {
            "name" : "zookeeper_server_java_heapsize",
            "value" : "407896064"
          } ]
        } ],
        "items" : [ ]
      },
      "roles" : [ {
        "name" : "zookeeper-SERVER-4a0b1f2952c13923dd0a57d2f799f9c3",
        "type" : "SERVER",
        "hostRef" : {
          "hostId" : "b0082016-c859-40db-822e-d4805988ec6b"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "eguualhjgduy8fxeahkmr88dr"
          }, {
            "name" : "serverId",
            "value" : "2"
          } ]
        }
      }, {
        "name" : "zookeeper-SERVER-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "SERVER",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "thaz1n6phmxz8xdifbsvpfeq"
          }, {
            "name" : "serverId",
            "value" : "1"
          } ]
        }
      } ],
      "displayName" : "ZooKeeper"
    }, {
      "name" : "hue",
      "type" : "HUE",
      "config" : {
        "roleTypeConfigs" : [ ],
        "items" : [ {
          "name" : "database_host",
          "value" : "kumarnode1"
        }, {
          "name" : "database_password",
          "value" : "hue_password"
        }, {
          "name" : "database_type",
          "value" : "mysql"
        }, {
          "name" : "hive_service",
          "value" : "hive"
        }, {
          "name" : "hue_webhdfs",
          "value" : "hdfs-NAMENODE-bb77996d471b66d313ff976e5a4cedf2"
        }, {
          "name" : "oozie_service",
          "value" : "oozie"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "hue-HUE_SERVER-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "HUE_SERVER",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "m6ujsyaos6ndmdg88q5sbsy0"
          }, {
            "name" : "secret_key",
            "value" : "6g14swCcCpvRj2xN5B558yoij0ghKt"
          } ]
        }
      } ],
      "displayName" : "Hue"
    }, {
      "name" : "oozie",
      "type" : "OOZIE",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "OOZIE_SERVER",
          "items" : [ {
            "name" : "oozie_database_host",
            "value" : "kumarnode1"
          }, {
            "name" : "oozie_database_password",
            "value" : "oozie_password"
          }, {
            "name" : "oozie_database_type",
            "value" : "mysql"
          }, {
            "name" : "oozie_database_user",
            "value" : "oozie"
          }, {
            "name" : "oozie_java_heapsize",
            "value" : "407896064"
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
        "name" : "oozie-OOZIE_SERVER-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "OOZIE_SERVER",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "39if5ocjr2o62t3djzfh1azl7"
          } ]
        }
      } ],
      "displayName" : "Oozie"
    }, {
      "name" : "yarn",
      "type" : "YARN",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "GATEWAY",
          "items" : [ {
            "name" : "mapred_reduce_tasks",
            "value" : "2"
          }, {
            "name" : "mapred_submit_replication",
            "value" : "1"
          } ]
        }, {
          "roleType" : "JOBHISTORY",
          "items" : [ {
            "name" : "mr2_jobhistory_java_heapsize",
            "value" : "407896064"
          } ]
        }, {
          "roleType" : "NODEMANAGER",
          "items" : [ {
            "name" : "yarn_nodemanager_heartbeat_interval_ms",
            "value" : "100"
          }, {
            "name" : "yarn_nodemanager_local_dirs",
            "value" : "/yarn/nm,/mnt/resource/yarn/nm"
          }, {
            "name" : "yarn_nodemanager_log_dirs",
            "value" : "/yarn/container-logs,/mnt/resource/yarn/container-logs"
          }, {
            "name" : "yarn_nodemanager_resource_cpu_vcores",
            "value" : "2"
          }, {
            "name" : "yarn_nodemanager_resource_memory_mb",
            "value" : "3623"
          } ]
        }, {
          "roleType" : "RESOURCEMANAGER",
          "items" : [ {
            "name" : "resource_manager_java_heapsize",
            "value" : "407896064"
          }, {
            "name" : "yarn_scheduler_maximum_allocation_mb",
            "value" : "3623"
          }, {
            "name" : "yarn_scheduler_maximum_allocation_vcores",
            "value" : "2"
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
          "value" : "Te1MoqZt3f6lFWLo6eZeG6gq5aXYcw"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "yarn-JOBHISTORY-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "JOBHISTORY",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "6zb71rjysvofenzxo82ev0m6v"
          } ]
        }
      }, {
        "name" : "yarn-NODEMANAGER-4a0b1f2952c13923dd0a57d2f799f9c3",
        "type" : "NODEMANAGER",
        "hostRef" : {
          "hostId" : "b0082016-c859-40db-822e-d4805988ec6b"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "dpbpi8qj306se478qutr4dmb5"
          } ]
        }
      }, {
        "name" : "yarn-NODEMANAGER-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "NODEMANAGER",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "rdvaihhrygls7wu5rmkt8xv0"
          } ]
        }
      }, {
        "name" : "yarn-RESOURCEMANAGER-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "RESOURCEMANAGER",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "rm_id",
            "value" : "39"
          }, {
            "name" : "role_jceks_password",
            "value" : "erragbtpa5locx0g2t9rqkvx7"
          } ]
        }
      } ],
      "displayName" : "YARN (MR2 Included)"
    }, {
      "name" : "hdfs",
      "type" : "HDFS",
      "config" : {
        "roleTypeConfigs" : [ {
          "roleType" : "BALANCER",
          "items" : [ {
            "name" : "balancer_java_heapsize",
            "value" : "407896064"
          } ]
        }, {
          "roleType" : "DATANODE",
          "items" : [ {
            "name" : "dfs_data_dir_list",
            "value" : "/dfs/dn,/mnt/resource/dfs/dn"
          }, {
            "name" : "dfs_datanode_du_reserved",
            "value" : "3157157068"
          }, {
            "name" : "dfs_datanode_failed_volumes_tolerated",
            "value" : "1"
          }, {
            "name" : "dfs_datanode_max_locked_memory",
            "value" : "3798990848"
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
            "value" : "/dfs/nn,/mnt/resource/dfs/nn"
          }, {
            "name" : "dfs_namenode_servicerpc_address",
            "value" : "8022"
          } ]
        }, {
          "roleType" : "SECONDARYNAMENODE",
          "items" : [ {
            "name" : "fs_checkpoint_dir_list",
            "value" : "/dfs/snn"
          } ]
        } ],
        "items" : [ {
          "name" : "dfs_ha_fencing_cloudera_manager_secret_key",
          "value" : "sXuwVYuL5IK5lAkTqXljTx2M3kYfnl"
        }, {
          "name" : "fc_authorization_secret_key",
          "value" : "PzoSDtPVKs8OcRQIlzXmK4co1RDKYx"
        }, {
          "name" : "http_auth_signature_secret",
          "value" : "AIXzocUO5tSwCIt4KpCNFNe105KR3X"
        }, {
          "name" : "rm_dirty",
          "value" : "true"
        }, {
          "name" : "service_health_suppression_hdfs_under_replicated_blocks",
          "value" : "true"
        }, {
          "name" : "zookeeper_service",
          "value" : "zookeeper"
        } ]
      },
      "roles" : [ {
        "name" : "hdfs-BALANCER-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "BALANCER",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ ]
        }
      }, {
        "name" : "hdfs-DATANODE-4a0b1f2952c13923dd0a57d2f799f9c3",
        "type" : "DATANODE",
        "hostRef" : {
          "hostId" : "b0082016-c859-40db-822e-d4805988ec6b"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "5sslmxhhs0jltqy1rtuu3xj5a"
          } ]
        }
      }, {
        "name" : "hdfs-DATANODE-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "DATANODE",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "1pu8cin1rxjm4eq8qdgijgq5i"
          } ]
        }
      }, {
        "name" : "hdfs-NAMENODE-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "NAMENODE",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "namenode_id",
            "value" : "41"
          }, {
            "name" : "role_jceks_password",
            "value" : "4wpkjk2tzu12rztna3m8j9qj2"
          } ]
        }
      }, {
        "name" : "hdfs-SECONDARYNAMENODE-bb77996d471b66d313ff976e5a4cedf2",
        "type" : "SECONDARYNAMENODE",
        "hostRef" : {
          "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
        },
        "config" : {
          "items" : [ {
            "name" : "role_jceks_password",
            "value" : "1k8o64j9p898h27occm9ioznj"
          } ]
        }
      } ],
      "displayName" : "HDFS"
    } ]
  } ],
  "hosts" : [ {
    "hostId" : "45402149-222a-45ce-956d-d617d69787d1",
    "ipAddress" : "10.0.0.4",
    "hostname" : "kumarnode1",
    "rackId" : "/default",
    "config" : {
      "items" : [ {
        "name" : "memory_overcommit_threshold",
        "value" : "1"
      } ]
    }
  }, {
    "hostId" : "b0082016-c859-40db-822e-d4805988ec6b",
    "ipAddress" : "10.0.0.5",
    "hostname" : "kumarnode2",
    "rackId" : "/default",
    "config" : {
      "items" : [ ]
    }
  } ],
  "users" : [ {
    "name" : "__cloudera_internal_user__mgmt-EVENTSERVER-bb77996d471b66d313ff976e5a4cedf2",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "4776609a8c571033526d4321f17395165151812bd50100fa680586a659ff0073",
    "pwSalt" : -4391258824288477485,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-HOSTMONITOR-bb77996d471b66d313ff976e5a4cedf2",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "c34c1e93ef7d471ed65476d0ae6db15825e02ea909c5be885b738389f480a216",
    "pwSalt" : -2014304282436428999,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-REPORTSMANAGER-bb77996d471b66d313ff976e5a4cedf2",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "7b299593bbd005b81fafb63f5240b10300f51707a9f2c0c4a7cb98e2688aaf5e",
    "pwSalt" : 5426844928054973755,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-SERVICEMONITOR-bb77996d471b66d313ff976e5a4cedf2",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "b6c0eb4d13d922ba8ff4a10016162961d6bd8b6401236dd74a46657032fefaa5",
    "pwSalt" : -8389082665676611862,
    "pwLogin" : true
  }, {
    "name" : "admin",
    "roles" : [ "ROLE_ADMIN" ],
    "pwHash" : "acb206d244422c6145ee31f28cb2220aed92adcd077cd61d232b7ec58ff765d6",
    "pwSalt" : 5115940420466839461,
    "pwLogin" : true
  } ],
  "versionInfo" : {
    "version" : "5.8.3",
    "buildUser" : "jenkins",
    "buildTimestamp" : "20161019-1014",
    "gitHash" : "518f0d6d44abc87bc392646e4369a20c8192b7cf",
    "snapshot" : false
  },
  "managementService" : {
    "name" : "mgmt",
    "type" : "MGMT",
    "config" : {
      "roleTypeConfigs" : [ {
        "roleType" : "EVENTSERVER",
        "items" : [ {
          "name" : "event_server_heapsize",
          "value" : "407896064"
        } ]
      }, {
        "roleType" : "HOSTMONITOR",
        "items" : [ {
          "name" : "firehose_heapsize",
          "value" : "407896064"
        }, {
          "name" : "firehose_non_java_memory_bytes",
          "value" : "805306368"
        }, {
          "name" : "role_config_suppression_firehose_heap_size_validator",
          "value" : "true"
        }, {
          "name" : "role_config_suppression_firehose_non_java_memory_validator",
          "value" : "true"
        } ]
      }, {
        "roleType" : "REPORTSMANAGER",
        "items" : [ {
          "name" : "headlamp_database_host",
          "value" : "kumarnode1"
        }, {
          "name" : "headlamp_database_name",
          "value" : "rman"
        }, {
          "name" : "headlamp_database_password",
          "value" : "rman_password"
        }, {
          "name" : "headlamp_database_user",
          "value" : "rman"
        }, {
          "name" : "headlamp_heapsize",
          "value" : "407896064"
        } ]
      }, {
        "roleType" : "SERVICEMONITOR",
        "items" : [ {
          "name" : "firehose_heapsize",
          "value" : "407896064"
        }, {
          "name" : "firehose_non_java_memory_bytes",
          "value" : "805306368"
        }, {
          "name" : "role_config_suppression_firehose_heap_size_validator",
          "value" : "true"
        }, {
          "name" : "role_config_suppression_firehose_non_java_memory_validator",
          "value" : "true"
        } ]
      } ],
      "items" : [ ]
    },
    "roles" : [ {
      "name" : "mgmt-ALERTPUBLISHER-bb77996d471b66d313ff976e5a4cedf2",
      "type" : "ALERTPUBLISHER",
      "hostRef" : {
        "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "dxl452ah1oczmtdmfcntlvww9"
        } ]
      }
    }, {
      "name" : "mgmt-EVENTSERVER-bb77996d471b66d313ff976e5a4cedf2",
      "type" : "EVENTSERVER",
      "hostRef" : {
        "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "f4mxvvpxi76lr8ppr0kxzk9tq"
        } ]
      }
    }, {
      "name" : "mgmt-HOSTMONITOR-bb77996d471b66d313ff976e5a4cedf2",
      "type" : "HOSTMONITOR",
      "hostRef" : {
        "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "avihn3dlggxtxs2rem96xtc1z"
        } ]
      }
    }, {
      "name" : "mgmt-REPORTSMANAGER-bb77996d471b66d313ff976e5a4cedf2",
      "type" : "REPORTSMANAGER",
      "hostRef" : {
        "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "e38b3lguno4jj88tc2gwhpy2g"
        } ]
      }
    }, {
      "name" : "mgmt-SERVICEMONITOR-bb77996d471b66d313ff976e5a4cedf2",
      "type" : "SERVICEMONITOR",
      "hostRef" : {
        "hostId" : "45402149-222a-45ce-956d-d617d69787d1"
      },
      "config" : {
        "items" : [ {
          "name" : "role_jceks_password",
          "value" : "233kcaou6bq9wqsp3bphbsopc"
        } ]
      }
    } ],
    "displayName" : "Cloudera Management Service"
  },
  "managerSettings" : {
    "items" : [ {
      "name" : "CLUSTER_STATS_START",
      "value" : "10/24/2012 2:20"
    }, {
      "name" : "PUBLIC_CLOUD_STATUS",
      "value" : "NOT_ON_PUBLIC_CLOUD"
    }, {
      "name" : "REMOTE_PARCEL_REPO_URLS",
      "value" : "https://archive.cloudera.com/cdh5/parcels/{latest_supported}/,https://archive.cloudera.com/cdh4/parcels/latest/,https://archive.cloudera.com/impala/parcels/latest/,https://archive.cloudera.com/search/parcels/latest/,https://archive.cloudera.com/accumulo/parcels/1.4/,https://archive.cloudera.com/accumulo-c5/parcels/latest/,https://archive.cloudera.com/kafka/parcels/latest/,https://archive.cloudera.com/navigator-keytrustee5/parcels/latest/,https://archive.cloudera.com/spark/parcels/latest/,https://archive.cloudera.com/sqoop-connectors/parcels/latest/"
    } ]
  }
}
```
