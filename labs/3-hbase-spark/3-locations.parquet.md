## Read from Hive table inside spark-shell
```
scala> var results = sqlContext.sql("SELECT * FROM my_table")
```

## Store the read results as parquet file
```
scala> results.write.parquet("/user/cloudera/parquet")
```
