package prog_practice;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceCounter {

	public static void occurCounter(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char ch[] = str.toCharArray();
		for(char ltr : ch) {
			
			if(map.containsKey(ltr)) {
				
				map.put(ltr, map.get(ltr)+1 );
			
		}
			else {
				
				map.put(ltr, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			System.out.println((entry.getKey() + " " + entry.getValue()));
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurCounter("automationusingseleniumjava");

	}

}
