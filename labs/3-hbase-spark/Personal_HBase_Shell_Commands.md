#### Display the version
```version```


#### Create a new table
```create 'customer', 'address', 'order'```

#### Display a list of all the tables
```list```

#### Insert some values using ```put```
```
put 'customer', 'john', 'address:city', 'Boston'
put 'customer', 'john', 'address:state', 'Massachussetts'
put 'customer', 'john', 'address:street', 'street1'
put 'customer', 'john', 'order:number', '0014-55'
put 'customer', 'john', 'order:amount', '500'

put 'customer', 'finch', 'address:city', 'Sydney'
put 'customer', 'finch', 'address:country', 'Australia'
put 'customer', 'finch', 'address:street', 'street55'
put 'customer', 'finch', 'order:number', '44514-55'
```

#### Get all records belonging to a ```row-id```.
```get 'customer', 'john'```

#### Get all records belonging to a ```column family``` of a given ```row-id```.
```get 'customer', 'john', 'address'```

#### Get the value of a ```column``` of a ```column-family``` of a given ```row-id```.

```get 'customer', 'john', 'address:city'```

#### Get all records from a table
```scan 'customer'```

#### Delete a particular ```column``` of a given ```row-id```.
```delete 'customer', 'john', 'address:city'```

#### Delete an entire column family
```alter 'customer', 'delete' => 'address'```

#### Create a new column family
```alter 'customer', {NAME=>'address'}```

#### Create a table with specified versions 
```alter 'customer', {NAME=>'address', VERSIONS=>3} ```

#### Count the number of entries in a table
```count customer```

#### Change the number of versions of a column family
```alter 'customer', NAME=>'address', VERSIONS=>5```

#### Display specific number of versions of a column
```scan 'customer', {COLUMN=>'address:city', VERSIONS=>2}```

#### DISABLE the table before trying to DELETE it!
```disable 'customer'```

#### Drop the table
```drop 'customer'```
