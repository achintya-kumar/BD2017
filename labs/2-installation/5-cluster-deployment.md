```
{
  "timestamp" : "2017-05-21T20:39:58.481Z",
  "clusters" : [ {
    "name" : "achintya-kumar",
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
          }, {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
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
          }, {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          } ]
        }, {
          "roleType" : "WEBHCAT",
          "items" : [ {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
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
            "value" : "3wl3xj8l4lznu5kdo09ksapfg"
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
            "value" : "35vfzzheijr1n9grxnqr5yzht"
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
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          }, {
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
            "value" : "9a5ynb6lat5m8w7i91h703x0m"
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
            "value" : "2tqtsfjiwpyv654ydne43sr7x"
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
            "value" : "8femqwhgt45e45kfcigaqo4yk"
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
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          }, {
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
            "value" : "5cpg6fxu5o7g474rffnzdzugx"
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
          }, {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          } ]
        }, {
          "roleType" : "NODEMANAGER",
          "items" : [ {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          }, {
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
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          }, {
            "name" : "resource_manager_java_heapsize",
            "value" : "407896064"
          }, {
            "name" : "resourcemanager_fair_scheduler_assign_multiple",
            "value" : "false"
          }, {
            "name" : "yarn_scheduler_fair_continuous_scheduling_enabled",
            "value" : "true"
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
            "value" : "ekubea9ph4f8mm5rrptzrvhmp"
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
            "value" : "esziumx3t3jpfbr1hcy2ftxhv"
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
            "value" : "7akptjkgfrzev0ydnm5ezt8ac"
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
            "value" : "e1d0ecl6cci50xlmsyq587ci"
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
          }, {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          } ]
        }, {
          "roleType" : "FAILOVERCONTROLLER",
          "items" : [ {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          } ]
        }, {
          "roleType" : "GATEWAY",
          "items" : [ {
            "name" : "dfs_client_use_trash",
            "value" : "true"
          } ]
        }, {
          "roleType" : "HTTPFS",
          "items" : [ {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          } ]
        }, {
          "roleType" : "JOURNALNODE",
          "items" : [ {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          } ]
        }, {
          "roleType" : "NAMENODE",
          "items" : [ {
            "name" : "dfs_name_dir_list",
            "value" : "/dfs/nn,/mnt/resource/dfs/nn"
          }, {
            "name" : "dfs_namenode_servicerpc_address",
            "value" : "8022"
          }, {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          } ]
        }, {
          "roleType" : "NFSGATEWAY",
          "items" : [ {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
          } ]
        }, {
          "roleType" : "SECONDARYNAMENODE",
          "items" : [ {
            "name" : "fs_checkpoint_dir_list",
            "value" : "/dfs/snn"
          }, {
            "name" : "oom_heap_dump_enabled",
            "value" : "false"
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
            "value" : "5ad7lzq8m7kl2goczq862h82q"
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
            "value" : "ehj09s8sq2oadqsr6rj7iuqvq"
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
            "value" : "8mn8ccaorrvp3pw1vvjafxgrh"
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
            "value" : "1r8ufwpm6cjbni6udl2338n1"
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
    "pwHash" : "dddfd3da6833c2c9775c4634d8207f31bb302972fde94319cf4dfd4aca818732",
    "pwSalt" : -760347281301086914,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-HOSTMONITOR-bb77996d471b66d313ff976e5a4cedf2",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "28829e9b999e306e5329e9ff58e7c9907708fc10182e1a1778de4c146bea6b58",
    "pwSalt" : 659275294753684954,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-REPORTSMANAGER-bb77996d471b66d313ff976e5a4cedf2",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "18c42c708c1297cc4953b451f61329052d96d5f3181bcc4163039a1537b69488",
    "pwSalt" : 1398704168903740495,
    "pwLogin" : true
  }, {
    "name" : "__cloudera_internal_user__mgmt-SERVICEMONITOR-bb77996d471b66d313ff976e5a4cedf2",
    "roles" : [ "ROLE_USER" ],
    "pwHash" : "f66bf21d1b829a4cf25cd86806c4f17e5a9832d04d6c28e8d2c153e3d70d0b8e",
    "pwSalt" : -3077579819403137317,
    "pwLogin" : true
  }, {
    "name" : "admin",
    "roles" : [ "ROLE_ADMIN" ],
    "pwHash" : "acb206d244422c6145ee31f28cb2220aed92adcd077cd61d232b7ec58ff765d6",
    "pwSalt" : 5115940420466839461,
    "pwLogin" : true
  } ],
  "versionInfo" : {
    "version" : "5.9.2",
    "buildUser" : "jenkins",
    "buildTimestamp" : "20170330-1814",
    "gitHash" : "822da28bff818f57fc1bfc3eafe3a550300ef1b0",
    "snapshot" : false
  },
  "managementService" : {
    "name" : "mgmt",
    "type" : "MGMT",
    "config" : {
      "roleTypeConfigs" : [ {
        "roleType" : "ACTIVITYMONITOR",
        "items" : [ {
          "name" : "oom_heap_dump_enabled",
          "value" : "false"
        } ]
      }, {
        "roleType" : "ALERTPUBLISHER",
        "items" : [ {
          "name" : "oom_heap_dump_enabled",
          "value" : "false"
        } ]
      }, {
        "roleType" : "EVENTSERVER",
        "items" : [ {
          "name" : "event_server_heapsize",
          "value" : "407896064"
        }, {
          "name" : "oom_heap_dump_enabled",
          "value" : "false"
        } ]
      }, {
        "roleType" : "HOSTMONITOR",
        "items" : [ {
          "name" : "firehose_non_java_memory_bytes",
          "value" : "805306368"
        }, {
          "name" : "oom_heap_dump_enabled",
          "value" : "false"
        }, {
          "name" : "role_config_suppression_firehose_heap_size_validator",
          "value" : "true"
        }, {
          "name" : "role_config_suppression_firehose_non_java_memory_validator",
          "value" : "true"
        } ]
      }, {
        "roleType" : "NAVIGATOR",
        "items" : [ {
          "name" : "oom_heap_dump_enabled",
          "value" : "false"
        } ]
      }, {
        "roleType" : "NAVIGATORMETASERVER",
        "items" : [ {
          "name" : "oom_heap_dump_enabled",
          "value" : "false"
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
        }, {
          "name" : "oom_heap_dump_enabled",
          "value" : "false"
        } ]
      }, {
        "roleType" : "SERVICEMONITOR",
        "items" : [ {
          "name" : "firehose_non_java_memory_bytes",
          "value" : "805306368"
        }, {
          "name" : "oom_heap_dump_enabled",
          "value" : "false"
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
          "value" : "dlotjdthv0o4yw1a2srb00na"
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
          "value" : "euzu1e2gl28d21xjul0grfmuz"
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
          "value" : "5jzn1cfha7dgz1imrogmpz6we"
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
          "value" : "21iozxgqwxg68rjpceyspkxns"
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
          "value" : "6hjttuscksbypqh3x9cacb194"
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
      "value" : "https://archive.cloudera.com/cdh5/parcels/{latest_supported}/,http://localhost/cdh5.9/,http://localhost/cdh4.7/,https://archive.cloudera.com/impala/parcels/latest/,https://archive.cloudera.com/search/parcels/latest/,https://archive.cloudera.com/accumulo/parcels/1.4/,https://archive.cloudera.com/accumulo-c5/parcels/latest/,https://archive.cloudera.com/kafka/parcels/latest/,https://archive.cloudera.com/navigator-keytrustee5/parcels/latest/,http://localhost/spark0.9/,https://archive.cloudera.com/sqoop-connectors/parcels/latest/"
    } ]
  }
}
```
