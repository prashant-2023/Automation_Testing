package prog_practice;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap();
		
		map.put("Shubham", 24456);
		map.put("Durga Prasad", 85569);
		map.put("Shanti Devi", 25564);
		map.put("Maitri Devi", 24558);
		
		//System.out.println(map);
		
		//System.out.println(map.get("Shubham"));
		
		for(Map.Entry<String, Integer> mapentry : map.entrySet()) {
			
		System.out.println(mapentry.getKey() +" : "+ mapentry.getValue());
		//System.out.println(mapentry.getValue());
			
		}
		
		
		

	}

}
