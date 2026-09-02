package prog_practice;

import java.util.Collections;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	

	public static void main(String[] args) {
		
		int[] arr = {35,78,89,-102,112,104};
	      Map<Integer,Integer> map = new LinkedHashMap<>();

	      
	      for(int i=0; i<arr.length; i++){

	          int diff = Math.abs(100-arr[i]);

	          map.put(arr[i], diff);
	      }
	      
	      Integer min = Collections.min(map.values());
	      for(Entry<Integer,Integer> e : map.entrySet()) {
	          
	    	  
	    	  
	    	  if(e.getValue() == min) {
	    		  System.out.println("The closest number to 100 is: " + e.getKey());
	    	  }
	        
	      }
		
		
		
		
		
		
		
		
		
		
//		HashMap<String, Integer> map = new HashMap();
//		
////		map.put("Shubham", 24456);
////		map.put("Durga Prasad", 85569);
////		map.put("Shanti Devi", 25564);
////		map.put("Maitri Devi", 24558);
//		
//		//System.out.println(map);
//		
//		//System.out.println(map.get("Shubham"));
//		
//		for(Map.Entry<String, Integer> mapentry : map.entrySet()) {
//			
//		System.out.println(mapentry.getKey() +" : "+ mapentry.getValue());
//		//System.out.println(mapentry.getValue());
//			
//		}
//		
		
		

	}

}
