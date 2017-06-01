The bit array size used for our bloomFilter is **10000**.

MD5 generates a **128**-bit hash. 
Then, for **983** keys, we shall have **128** * **983** = **125824**-bits. 
This is over **12** times more than the space required to hold the bloom filter.
