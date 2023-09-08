package prog_practice;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101,"Ketan");
		map.put(102, "Shreya");
		map.put(105, null);
		map.put(104, "Kiran");
		map.put(103, "Kartik");
		map.put(101, "Chintu");
		map.put(106, "Lalit");
		map.put(107, null);
		map.put(null, "1st null key");
		map.put(null, "2nd Null key");    // Only one null key is allowed
		//System.out.println(map.get(105));
		
	//	System.out.println(map);
		
		//System.out.println(map.size());
		
		Set<Entry<Integer, String>> s = map.entrySet();
		//System.out.println(s);
		/*
		for(Map.Entry<Integer, String> e:s) {
			
			System.out.println(e.getKey()+"   " + e.getValue());
			
		}
		*/
		
		//Traversing using iterator
		
		
		Iterator<Entry<Integer, String>> itr = s.iterator();
		
		while(itr.hasNext()) {
			
			//System.out.println(itr.next());
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + "   " + entry.getValue());
			
			
			
		}
		
		
		
		
	}

}
