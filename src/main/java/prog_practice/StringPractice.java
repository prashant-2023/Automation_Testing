package prog_practice;

import java.util.Collections;
import java.util.HashMap.*;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.stream.events.Characters;




public class StringPractice {
	//IP- This is a good day
	//OP- yadd oo g asis ihT
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static char[] StringReversePreserveSpaces(String s) {
		
		//StringBuilder rev = new StringBuilder();
		char[] ch = s.toCharArray();
		
		int left = 0;
		int right = s.length()-1;
		
		while(left<right) {
			
			if(ch[left]==' ') {
				left++;
				continue;
				
			}
			if(ch[right]==' ') {
				right--;
				continue;
			}
			
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			
			left++;
			right--;
		}
		
		return ch;
		
		
	}
	//intelligent.
	public static void removeDuplicates(String s) {
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c: s.toCharArray()) {
			
			set.add(c);
						
		}
		System.out.println(set.toString());
	}
	
	
	
	
	
	
	
	
	
	
	//Example: aaabbc → a3b2c1
	
		
	public static void replaceStringwithCount(String s) {
		
		//String result = "";
		
		try {
			
			if(s.isBlank()) {
				
				throw new RuntimeException();
			}
			
			
		}catch(RuntimeException e) {
			
			System.out.println("Exception caught ------ String is empty.");
		}
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c: s.trim().toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0) + 1);
			
		}
		
		//System.out.println(map);
		StringBuilder result = new StringBuilder();
		
		for(Map.Entry<Character, Integer> e: map.entrySet()) {
			
			result.append(e.getKey()).append(" ").append(e.getValue()).append(" times\n");
			
		}
		
		System.out.println(result.toString());
		//return map.toString();
	}
	
	
	public static String revString(String str) {
		
		String temp="";
		for(int i=str.length()-1; i>=0;i--) {
			
			temp=temp+str.charAt(i);
				}
		return temp;
	}
	
	
	public static void splitAplhanumericString(String str) {
		
		int alpha_count=0;
		int numeric_count=0;
		int spec_count=0;
		int space_count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				
												
				alpha_count++;
			}
			else if(Character.isDigit(str.charAt(i))) {
				
				numeric_count++;
			}
			else if(Character.isWhitespace(str.charAt(i))) {
				
				space_count++;
			}
			else {
				spec_count++;
				
			}
			
		}
		
		System.out.println("Total alphabets are : " + alpha_count);
		System.out.println("Total numbers are : " + numeric_count);
		System.out.println("Total special characters are : " + spec_count);
		System.out.println("Total spaces are : " + space_count);
	}
	
	public static void countrepeatedCharacters(String str) {
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		char ch[] = str.toCharArray();
		
		for(char c: ch) {
			
			if(m.containsKey(c)) {
				
				m.put(c, m.get(c)+1);
			}
			else {
				
				m.put(c, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> e : m.entrySet()) {
			
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
	}
	
	public static int wordCounter(String str) {
		
		int length = str.length();
		return length;
		
		
	}
	
	public static int wordCounterusingarray(String str) {
		
		int length = str.toCharArray().length;
		return length;
	}
	
	public static int countWordsUsingSplit(String str) {
		
		String trimmed = str.trim();
		System.out.println(trimmed);
		String[] s = trimmed.split("\\s");
		
		if(str.isEmpty()) {
			
			System.out.print("String is empty. Please provide the string value.");
		}
					
			int length = s.length;
			
			return length;
				
		
	}
	
	public static void reverseWords(String str) {
		
		String[] splitted = str.split("\\s");
		
		//char[] ch = splitted.toString().toCharArray();
		
		for(String s : splitted) {
			
			String reversed = revString(s);
			System.out.print(reversed + " ");
			
		}
		
		
	}
	
	//Change 1st char of string to uppercase
	public static void practiceMarch(String s) {
		
		if (s == null || s.isEmpty()) {
			
            System.out.println("String is invalid.");
        }
		else {
	char upCase = Character.toUpperCase(s.charAt(0));
				
	String a =	upCase + s.substring(1);
		
		System.out.println(a);
		
	}}
	
	public static void specialChar() {
		
		 String random = "@#@#sdfsfPrashant@#23fdf$%^&*";
		 String digits = "";
		 String letters = "";
		 String spec	= "";
		 
		 for(int i=0;i<random.length();i++) {
			 
			 if(Character.isLetter(random.charAt(i))) {
				 
				 letters=letters +random.charAt(i) + ", ";
				 
			 }
			 if(Character.isDigit(random.charAt(i))) {
				 
				 digits = digits + random.charAt(i) + ", ";
			 }
			 else if(!Character.isLetter(random.charAt(i))){
				 
				 spec = spec + random.charAt(i)+ ", ";
			 }
		 }
		 System.out.println("These characters are numbers: "  + digits);
		 System.out.println("These characters are alphabets: " + spec); 
		 System.out.println("These characters are special: " + letters); 

	}
	
	
	//Duplicate method in same class test
	/*public int method1(int a, int b) {
		System.out.println(a+b);
		
		return a+b;
		
	}
	
	public double method1(int a, int b) {
		
		
		System.out.println(a*b);
		return a*b;
	}*/
public static char firstNonRepeatingChar(String s) {
		
		char[] chars = s.toLowerCase().toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c: chars) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
					
		}
		
		for(Map.Entry<Character, Integer> e: map.entrySet()) {
			
			if(e.getValue()==1) {
				return e.getKey();
			}
			
		}
		
		
		return '\0';
		
		
	}
	
	public static void main(String[] args) {
		
		//String s = "This is reference number #12345 for 'account' 'prashant87'";
		String s = "WeeksFourThousand";
		//removeDuplicates(s);
		
		System.out.println(firstNonRepeatingChar(s));
		/*
		try { 
		
			replaceStringwithCount(s);
		}
		catch(RuntimeException e) {
			
			System.out.println("String is empty.");
		}
		*/
		//String referencenum = s.split("#")[1].split(" ")[0];
		
		//System.out.println(s.split("'")[3]);
		
		/*
		for(String split: s.split("'")) {
			
			System.out.println(split);
		}
		
		*/
		
		
		
		
		/*String[] words = s.split(" ");
		
		for(String word: words) {
			
			if(word.startsWith("#") || word.startsWith("\'")&&word.endsWith("\'")) {
				
				System.out.println(word);
			}
			
			
		}*/
		
		//String s = "Programming";
		
		//replaceStringwithCount(s);
		
		//String s = "";
		//splitAplhanumericString(s);
		
		//int stringLength = countWordsUsingSplit(s);
		
		//System.out.println(stringLength);
		
		//String inputString = "The quick brown fox jumps over the lazy dog";
		 
		//specialChar();
		
				 
	//	String newString = inputString.substring(1);
		 
		//System.out.println(newString);
		
		
		/*String withoutspace = inputString.replace(" ", "");
		 
		
		System.out.println(withoutspace);*/
		
	
	       /* String patternToFind = "og";

	        // Create a Pattern object
	        Pattern pattern = Pattern.compile(patternToFind);

	        // Create a Matcher object
	        Matcher matcher = pattern.matcher(inputString);

	        // Find the pattern in the input string
	        while (matcher.find()) {
	            System.out.println("Pattern found at index: " + matcher.start());
	        }

	        // If no match is found
	        if (!matcher.find()) {
	            System.out.println("Pattern not found in the input string.");
	        }
		
		
		*/
		
		
		
	/*	
		int[] x = new int[3];
		
		x[1]=50;
		
		Object obj = x;
		
		int[] y = (int[]) obj;
		
		y[1]=100;
		
		System.out.println(x[1]);
		
		(int [] obj) [1]=500;
		
		System.out.println(x[1]);*/
		
		
		
		/*
		Object[] stringArr = new String[5];
		
		stringArr[1]="Java";
		stringArr[2]=100;
		
		System.out.print(stringArr[1] + " ");
		System.out.println(stringArr[2]);
		
		*/
		
		
		
	/*	
		int[] x = new int[10+5];
		
		x[12] = 50;
		
		System.out.println(x [12]);*/
		
		/*StringPractice obj = new StringPractice();
		
		obj.method1(2, 3);*/
		// TODO Auto-generated method stub
		
		//String reversed = revString("Prashant Chauhan");
		//System.out.println(reversed);
		//splitAplhanumericString("Autom@tionUs1ngS3l3nium5");
		//countrepeatedCharacters("abcdabcd1234123444444");
		
	//	System.out.println(wordCounter("abcdabcd1234123444444"));
	//	System.out.println(wordCounterusingarray("Arise! Awake! and stop not until the goal is reached."));
		//int wordcount = countWordsUsingSplit("Arise! Awake! and stop not until the goal is reached.");
		//System.out.println(wordcount);
		//reverseWords("Arise! Awake! and stop not until the goal is reached.");
		
		//int a=2;
		//int b=3;
		/*
		String s1= "ABCD";
		String s2= "ABCD";
		
		String s3 = new String("ABCD");
		String s4 = new String("ABCD");
			
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		System.out.println(s3==s4);
		
		System.out.println(s1.equals(s2));
		*/
		/*System.out.println(a+b+s1);
		
		System.out.println(s1+a+b);*/
		
		/*int[] a = new int[5];
		
		try {
			
			a[5] = 100;
		}
		
		catch(Exception e){
			
			System.out.println("Caught ArrayIndexOutOfBoundsException");
		}*/
		
		
		
	}
	

}
