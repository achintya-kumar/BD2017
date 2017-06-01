package client;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import filter.BloomFilter;

public class Main {

   public static void main(String[] args) throws Exception {
	   Configuration conf = new Configuration();
	   conf.set("fs.defaultFS","hdfs://localhost/user/cloudera:8020");
	   readFile("/user/cloudera/bloom/bloomfilter", conf);
   }
   
   public static void readFile(String file, Configuration conf) throws IOException {
	    FileSystem fileSystem = FileSystem.get(conf);
	    Path path = new Path("/user/cloudera/bloom/bloomfilter");
	    BloomFilter<String> bf = new BloomFilter<String>();
	    bf.readFields(fileSystem.open(path, 0));
	    
	    JFrame frame = new JFrame("Locations");
	    frame.addWindowListener(new WindowListener() {
			
			public void windowOpened(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowDeactivated(WindowEvent e) {}
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			public void windowClosed(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
		});
	    
	    while(true) {
		    String location = JOptionPane.showInputDialog(frame, "Enter the location");
		    boolean result = false;
		    if(location != null)
		    	result = bf.contains(location);
		    else 
		    	System.exit(1);
		    JOptionPane.showMessageDialog(frame, "Location: " + location + "\nFound: " + result, "Result", result?JOptionPane.INFORMATION_MESSAGE:JOptionPane.ERROR_MESSAGE, null);
	    }
	    
	    
	  }
}
