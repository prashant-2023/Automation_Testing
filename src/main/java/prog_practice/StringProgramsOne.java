package prog_practice;

import java.util.HashMap;
import java.util.Map;

public class StringProgramsOne {

	
	
	public static void countRepeatedWords(String str) {
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char ch[] = str.toCharArray();
		
		for(char letter : ch) {
			if(map.containsKey(letter)) {
				map.put(letter, map.get(letter)+1);
			}
			else {
				
				map.put(letter, 1);
			}
		}
		for(Map.Entry<Character, Integer>  entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " : " +entry.getValue());
				
			}
			
		}
		
		
	}
	
	
	
	/*public static void StringWordCounter(String str) {
		
		
		String empty = "";
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i <ch.length-1; i++) {
			int count =0;
			if(str.contains(empty)) {
				count++;
				System.out.println("alphabet " + ch[i] + " present " + count + " times.");
			
			}
			else {
				
				System.out.println("alphabet is not repeated"); 
				
			}
			
			
		}
				
		
	}*/
	
	public static void countvaluesusingMap(String str) {
		
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		char ch[] = str.toCharArray();
		
		for(char letter : ch) {
			
			if(hashmap.containsKey(letter)) {
				hashmap.put(letter, hashmap.get(letter) +1 );
			}
			else {
				
				hashmap.put(letter, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
			
			System.out.println("Value " + entry.getKey() +" is printed " + entry.getValue() + " times.");
		}
		
	}
	
	public static void striptring(String str) {
		
		//char ch[] = str.toCharArray();
		
		System.out.println(str.strip());
		
	
		
	}
	
	public static void main(String[] args) {
		
		//String  str= "        **prashant3344automation          **       ";
		//countRepeatedWords(str);
		//StringWordCounter("prashant3344automation");
		//striptring(str);
		//countvaluesusingMap(str);
	}

}
