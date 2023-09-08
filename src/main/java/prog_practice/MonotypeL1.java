package prog_practice;


import java.util.HashMap;




public class MonotypeL1 {
	
	
	
	public static void reverse(String str, int n) {
		
		//String temp="";
		String substring = str.substring(n);
		
		substring+=str.substring(0,n);
		
		System.out.println(substring);
	}
	
	public static void reverseString(String str) {
		
		String[] arr = {};
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
		
		
	}
	
	public static void countoccurrence(String str) {
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		//char[] ch = str.toCharArray();
		
		//System.out.println(ch);
		
		for(int i=0; i<str.length(); i++) {
			
			if(m.containsKey(str.charAt(i))) {
				
				
				m.put(str.charAt(i), m.get(str.charAt(i))+1);
			}
			else {
				
				m.put(str.charAt(i), 1);
			}
			
		}
		
		//System.out.println(m);
		
		Object[] arr = m.entrySet().toArray();
			
			//Iterator<Entry<Character, Integer>> itr = m.entrySet().iterator();
			
			for(Object e : arr)
			{
				
				System.out.print(e);
				
			//System.out.print(e.getKey() + "" + e.getValue()+ " ");
	}
		}
		
		
		
	
	
	
	//Output - ashantKumarPr
	// gnirtsa e sreveR
	/**Input - prashantkumar, output - p1r2a3s1h1n1t1k1u1m1/ **/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "\" I will certainly clear the interview of an Automation Engineer.\"\nThanks!";
		
		
		//reverse(s, 2);
		//reverseString(s);
		//countoccurrence(s);
		
		//String sub = s.substring(0, 5);
		//System.out.println(sub);
		//reverse(s,4);	
		
	//System.out.println(s.compareTo("strprintlnprintlreplaceCharreplacedln"));
		
		//System.out.println(s.indexOf("mat", 5));
		//System.out.println(s.lastIndexOf('a', 14));
		//replacespaceswithunderscore(s);
		detectdoubletriplespaces(s);
		//System.out.println(s);
	}
	
	
	public static void replacespaceswithunderscore(String str) {
		
		String replaced = str.replace("\s", "_");
		System.out.println(replaced);
	
	}
	
	public static void detectdoubletriplespaces(String str) {
		
		if(str.contains("\s\s") || str.contains("\s\s\s")) {
			
			System.out.println("String contains multiple spaces");
		}
		else {
			System.out.println("Input string is valid.");
		}
		
	}
	
	
	
	
	public static void replaceChar(String str, int n) {
		int x=2;
		char ch = str.charAt(x);
		char newchar = 'f';
		
		String replaced = str.replace(ch, newchar);
		
		System.out.println(replaced);	
	}
	
	

}
