package prog_practice;

import java.util.Arrays;

public class Capgemini_L1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* String str="A@ma!n&";
	        //O/P:- n@am!A&
		 String result="";
		 
		 for(int i=0; i<str.length(); i++) {
			 
			 if(!Character.isLetterOrDigit(str.charAt(i))) {
				 
				 
				 result = result + str.charAt(i);
			 }
			 
			 
		 }
		
		
	}*/
		
		
		
		//int arr[]={1,0,1,0,1,0,1,0,1,0,1};
		//O/P={1,1,1,0,0}
		
		//int[] result = shiftZerosToLeft(arr);
		
		//System.out.println(Arrays.toString(result));
		String s = "C@rbonFr##";
		
		//System.out.println(arr);
		
		reverseStringKeepingSpecialChar(s);
		
		
}
	
		public static void reverseStringKeepingSpecialChar(String s) {
				
				s.toLowerCase();
				
				char[] result = new char[s.length()];
				
				for(int i=0; i<s.length(); i++) {
					
					if(!Character.isLetterOrDigit(s.charAt(i))) {
						
						result[i] = s.charAt(i);
						
					}
					
				}
				
			System.out.println(Arrays.toString(result));
			
			int j=s.length()-1;
			//"C@rbonFr##";
			for(int i=0; i<=s.length()-1; i++) {
				
				if(Character.isLetterOrDigit(s.charAt(i))) {
					
					
					
					result[i] = s.charAt(i);
					
				}
			}
			System.out.println(Arrays.toString(result));
				
				
			}
		
	public static int[] shiftZerosToLeft(int[] arr) {
		
		int[] newArray = new int[arr.length];
		
		int count =arr.length-1;
		
		for(int a: arr) {
		
			if(a!=0) {
				
				newArray[count]=a;
				count--;
			}
			
		}
		
		
		return newArray;
	}
	
	public static int[] shiftZerosToRight(int[] arr) {
		
		int[] newArray = new int[arr.length];
				
				int count=0;
				
				for(int a: arr) {
					
					if(a!=0) {
						
						newArray[count] = a;
						count++;
						
					}
					
				}
				
				//System.out.println(Arrays.toString(newArray));
				
				return newArray;
		
		
	}
	
	// C@rbonFr##
	// ##fRnobr@C
	// r@FnobrC##
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}