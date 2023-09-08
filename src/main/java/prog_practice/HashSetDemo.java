package prog_practice;
/* Set type contains only unique values.*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
		 
		    // Main Method
		    public static void main(String args[])
		    {
		        // Creating HashSet and
		        // adding elements
		        Set<String> hs = new HashSet<String>();
		 
		        hs.add("Geeks");
		        hs.add("For");
		        hs.add("Geeks");
		        hs.add("Is");
		        hs.add(null);
		        hs.add("Very helpful");
		 
		        // Traversing elements
		        Iterator<String> itr = hs.iterator();
		        while (itr.hasNext()) {
		            System.out.println(itr.next());
		        }
		    }
		

	}
