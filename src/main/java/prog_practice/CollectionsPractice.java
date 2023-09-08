package prog_practice;



import java.util.*;
import java.util.Collections;
import java.util.List;

public class CollectionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	List<Integer> l= new ArrayList<Integer>();

		l.add(8);
		l.add(3);
		l.add(5);
		l.add(6);
		l.add(8);
		System.out.println(Collections.min(l));
		Integer i = Collections.max(l);
		System.out.println(i);
		boolean b = l.isEmpty();
		int size = l.size();

		System.out.println(b + " " + size);*/
		
		//String merged = stringmerge("prashant", "12345678");
		//System.out.println(merged);
		
	countSpaces(" auto mat tion using selenium ja a va ");
	
	}


	/*String S1="hello"
String S2="12345"
Output=h1e2l3l4o5.*/
	
	public static String stringmerge(String s1, String s2) {
		
		String temp="";
		//String temp2="";
		
		for(int i=0;i<s1.length();i++) {
			
			temp += s1.charAt(i) + ""+s2.charAt(i);
			
			
			
			
		}
		
		return temp;		
		
	}
	
	//Input = " auto mat tion us ing selenium ja a va " --------> Output : Spaces = 7
	
	public static void countSpaces(String s) {
		
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		for(char c: s.toCharArray()) {
			if(String.valueOf(c).isBlank()) {
				if(m.containsKey(c)) {
					
					m.put(c, m.get(c)+1);
					
							}
		
			else {
				
				m.put(c, 1);
			}
		}}
			System.out.println("Spaces are "  + m);
			
			/*for(Map.Entry<Character,Integer> e : m.entrySet() ) {
				
				System.out.print(e.getKey() + "" + e.getValue() + " ");
				
				
			}*/
		
	
	}
}

