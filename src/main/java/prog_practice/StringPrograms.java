package prog_practice;

public class StringPrograms {

	

	public static String str = "Auto-generated method stub";
	
	public static void reverseString(String str) {
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1; i>=0 ; i--) {
			
			
			
			System.out.print(ch[i]);
			
		}
		
	}
	
	public static void reverseWords(String str) {
		
		String[] splitted = str.split("\\s");
		
		for(int i=splitted.length-1; i>=0 ; i--) {
			
			System.out.print(splitted[i] + " ");
		}
		
		
	}
	
	public static void printString() {
		
		String string = "prashant.   chauha  n4040@gmail.com";
		
		String[] newstr = string.split("\\s");
		int i =1;
		for(String str : newstr) {
			
			System.out.println("This is " + i + " character : " + str);
			i++;
		}
		
	}
	
	
	
	public static void splitaplhanumericString(String str) {
		
		String alphabets= "A-Z, a-z";
		String numbers = "1,2,3,4,5,6,7,8,9,0";
		String spec_char = "!,@,#,$,%,^,&,*,?"; 
		
		char ch[] = str.toCharArray();
		int alphacount =0;
		int nocount = 0;
		int speccount = 0;
		for(int i=0; i<ch.length-1; i++) {
			
			if(Character.isLetter(str.charAt(i))) {
				
				
				alphacount++;
				
			}
			else if(ch.toString().contains(numbers)) {
				
				System.out.println("Numbers : " + nocount);
				nocount++;
				
			}
			else if(ch.toString().contains(spec_char)) {
				
				System.out.println("Special Characters : " + speccount );
				speccount++;
				
			}
			System.out.println("Alphabets : " + alphacount);
		
		}	
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		//reverseWords(str);
		
		//System.out.println("\n");
		//reverseWords("prashant.   chauha  n4040@gmail.com");
		//System.out.println("\n");
		//reverseString("prashant.   chauha  n4040@gmail.com");
		//printString();
		
		splitaplhanumericString("absc34562adgdsg");
		
	
	}

	

}
