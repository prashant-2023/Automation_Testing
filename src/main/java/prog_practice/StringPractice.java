package prog_practice;

import java.util.HashMap;
import java.util.Map;



public class StringPractice {

	
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
		for(int i=0; i<str.length()-1; i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				
				
				alpha_count++;
			}
			else if(Character.isDigit(str.charAt(i))) {
				
				numeric_count++;
			}
			else {
				spec_count++;
				
			}
			
		}
		
		System.out.println("Total alphabets are : " + alpha_count);
		System.out.println("Total numbers are : " + numeric_count);
		System.out.println("Total special characters are : " + spec_count);
	}
	
	public static void countrepeatedCharacters(String str) {
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
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
	
	//Duplicate method in same class test
	/*public int method1(int a, int b) {
		System.out.println(a+b);
		
		return a+b;
		
	}
	
	public double method1(int a, int b) {
		
		
		System.out.println(a*b);
		return a*b;
	}*/
	
	
	public static void main(String[] args) {
		
		

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
