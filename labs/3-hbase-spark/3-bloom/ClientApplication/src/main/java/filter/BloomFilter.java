package filter;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;

import org.apache.hadoop.io.Writable;

public class BloomFilter<E> implements Writable 
{	
	public BitSet bitSet;
	private int bitArraySize = 10000;
	private int numHashFunc = 6;
	
	static final Charset charset = Charset.forName("UTF-8"); // encoding used for storing hash values as strings

    static final String hashName = "MD5"; // MD5 gives good enough accuracy in most circumstances. Change to SHA1 if it's needed
    static final MessageDigest digestFunction;
    static { // The digest method is reused between instances
        MessageDigest tmp;
        try {
            tmp = java.security.MessageDigest.getInstance(hashName);
        } catch (NoSuchAlgorithmException e) {
            tmp = null;
        }
        digestFunction = tmp;
    }
	
    //Constructor
	public BloomFilter()
	{
		bitSet = new BitSet(bitArraySize);
	}
	
	//Add an item to the bit array
	public void add(E obj)
	{		
		int[] hashes = getHashIndexes(obj);
	    for (int hash : hashes){
	    	bitSet.set(Math.abs(hash % bitArraySize), true);
	    }
	}
	
	//Check if an item exists in bit array
	public boolean contains(E obj)
	{	
		int[] hashes = getHashIndexes(obj);
        for (int hash : hashes) {
            if (!bitSet.get(Math.abs(hash % bitArraySize))) {
                return false;
            }
        }
        return true;
	}
	
	public void union(BloomFilter<E> other)
	{
		bitSet.or(other.bitSet);
	}
	
	protected int[] getHashIndexes(E obj)
	{
		int[] indexes = new int[numHashFunc];
		int k = 0;
        byte salt = 0;
        while (k < numHashFunc) {
            byte[] digest;
            synchronized (digestFunction) {
                digestFunction.update(salt);
                salt++;
                digest = digestFunction.digest(obj.toString().getBytes(charset));                
            }
        
            for (int i = 0; i < digest.length/4 && k < numHashFunc; i++) {
                int h = 0;
                for (int j = (i*4); j < (i*4)+4; j++) {
                    h <<= 8;
                    h |= ((int) digest[j]) & 0xFF;
                }
                indexes[k] = h;
                k++;
            }
        }
        return indexes;
	}
	
	public void write(DataOutput out) throws IOException
	{
//		int byteArraySize = (int) (bitArraySize / 8);		
//		byte[] byteArray = new byte[byteArraySize];
//		
//		// ...
//		byteArray = bitSet.toByteArray();
//		
//		out.write(byteArray);
//		
//		
//		//
		out.writeInt(bitArraySize);
		out.writeInt(numHashFunc);
		
		
		long[] longs = bitSet.toLongArray();
		out.writeInt(longs.length);
		
		for (int i = 0; i < longs.length; i++) {
			out.writeLong(longs[i]);
		}
		
		   
	}
	
	public void readFields(DataInput in) throws IOException
	{
//		int byteArraySize = (int) (bitArraySize / 8);
//		byte[] byteArray = new byte[byteArraySize];
//		
//		in.readFully(byteArray);
//		
//		// ...
		
		bitArraySize = in.readInt();
		numHashFunc = in.readInt();
		

		long[] longs = new long[in.readInt()];
		for (int i = 0; i < longs.length; i++) {
			longs[i] = in.readLong();
		}

		bitSet = BitSet.valueOf(longs);
		
	}
	
}
