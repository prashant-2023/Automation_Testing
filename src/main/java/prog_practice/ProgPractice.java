package prog_practice;
//import java.util.*;


public class ProgPractice {
	static int count =0;
	
	String s1="javatpoint";
	String s2="javatpoint";
	
	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		/*

		 */
		//linkedlistPractice();
		
		//vectorPractice();
		
		//stackPractice();
		//arraylistPractice();
		//arraylistPracticeMethods();
		//mapPractice();
		//stringPractice();
		//reverseString("Seltos");
		//String nw = capitalizeWord("this string is to be capitalized.");
		//System.out.println(nw);
		/*String reversed = reverseEachWord("this string is to be reversed");
		System.out.println(reversed);*/
		
		repeatwordCount("print how many chars are repeated in this stringg");
	}
	
	/*
	public static void arraylistPractice() {

		ArrayList<String> al = new ArrayList<>();

		al.add("Nexon");
		al.add("Thar");
		al.add("Seltos");
		al.add("Innova");
		al.add("XUV");
		al.add("XUV");

	/*	System.out.println("Returning element from the list : " + al.get(2));
		
		
		
		for(String str : al) {


			System.out.println(str);
		}
		System.out.println("removing last element");
		al.remove("XUV");
		System.out.println(al);
		al.set(2, "Tiago");
		System.out.println("List after modifying the element : " + al);
		
		
		//System.out.println("Sorted List is : " + al);
		
		Collections.sort(al);
		for(int i = 0; i<al.size(); i++) {
			
			System.out.println("List element " + (i+1) + " is : " + al.get(i));
			count++;
		}
		System.out.println("Total no. of elements in the list is " + al.size());
		
	}
	public static void linkedlistPractice(){

		LinkedList<String> ll = new LinkedList<>();
		ll.add("Maruti");
		ll.add("TATA");
		ll.add("Mahindra");
		ll.addFirst("KIA");
		ll.addLast("Nissan");

		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		/*
		for(String str : ll) {

			System.out.println(str);

		}

	}
	public static void vectorPractice() {
		
		Vector<String> vectr = new Vector<>();
		vectr.add("Car");
		vectr.add("Bus");
		vectr.add("Truck");
	
		Iterator<String> itr = vectr.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
					
	}
		vectr.removeElementAt(2);
		System.out.println(vectr);

}
	
	// LIFO(Last In First Out) type
	public static void stackPractice() {
		
		Stack<Integer> stk = new Stack<>();
		stk.add(25);
		stk.add(5343);
		stk.add(44242);
		stk.add(99999);
		
		System.out.println(stk);
		stk.remove(2);
		System.out.println(stk);
		
	}
	public static void arraylistPracticeMethods(){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  al.retainAll(al2);  
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 } 
	
	public static void mapPractice() {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Triumph");
		map.put(2, "Dominor");
		map.put(3, "Meteor");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
		Map.Entry<Integer, String> entry = (Map.Entry)itr.next();
			
		System.out.println(entry.getKey() + entry.getValue());
		
			
		}
	
	}

	
	public static void stringPractice() {
		String str = new String("this is a test string example.");
		String[] splitted = str.split("test");
		System.out.println(Arrays.toString(splitted)); 
		
		for(int i=0;i<splitted.length;i++) {
			
			System.out.println(splitted[i]);
		}
		
	}
	*/
	public static  String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    //System.out.println(ch.length);
	    String rev = "";
	    for(int i=ch.length-1;i>=0;i--) {
	    	rev=rev + ch[i];
	    }
	    return rev;
	    
	}  
	// this string is to be reversed.
	public static String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	}  
	
	public static String reverseEachWord(String str) {
		
		String[] words = str.split("\\s");
		String rev = "";
		
		//System.out.println(words.length);
		
		for(String w : words ) {
			
			rev = rev + " " + reverseString(w.toString());
			
		}
		
		return rev;
	
	} 
	//Count the repetition of a character in a given string.
	public static void repeatwordCount(String str) {
		char characters[] = str.toCharArray();
		
		for(char ch : characters) {
			
			if(characters.toString().contains("a")) {
				count++;
				System.out.println(count);
				System.out.println(ch);
			}
		}
		
	}
}

/*Description	Resource	Path	Location	Type
Project 'Automation Project' is missing required library: 'D:\SeleniumData\poi-src-5.2.3-20220909.zip'	Automation Project		Build path	Build Path Problem
*/
