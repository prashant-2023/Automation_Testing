package prog_practice;

public class PalindromeNumber {

	
	public static String reverString(String str) {
		String reversed="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			reversed+=str.charAt(i);
		}
			
		
		return reversed;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  str=  "7007";
		
		StringBuilder sb = new StringBuilder(str);
		
		String rev = sb.reverse().toString();
		
		if(str.equals(rev)) {
			
			System.out.println("Palindrome");
		}
		else {
			System.out.println("False");
		}

		String revr = reverString("stringbuilder");
		System.out.println(revr);

}}


