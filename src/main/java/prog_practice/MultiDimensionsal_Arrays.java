package prog_practice;

import java.util.Arrays;

public class MultiDimensionsal_Arrays {
	
	//Java program to check whether
	// an element is present in array or not
	
	public static void arraysearchInt(int[] arr, int valuetocheck) {
		
		for(int numbr: arr) {
			
			if(numbr==valuetocheck) {
				
				System.out.println("Value "+ numbr +" is present in array.");
				
			}
			
		}
		
		
		
	}
	
	public static int[] sortarray(int[] a) {
		
		Arrays.sort(a);
		
		return a;

	}
	
	public static String[] sortStringArray(String[] a) {
		
		Arrays.sort(a);
		
		return a;
	}
	
	
	public static void comparearray(int[] a, int[] b ) {
		boolean result = Arrays.equals(a, b);
		
		if(result==true) {
			
			System.out.println("Arrays are equal");
			
		}
		else {
			
			System.out.println("Arrays are not equal");
		}
		
		
	}
	
	static void largestelement(int[] a) {
		
		 
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
		
			if(a[i]>max) {
				
				max=a[i];
			}
		
		}
		System.out.println(max);
		
	}
	
	public static void arraydemo() {
		
		int[] array = {23,34,46,76,78,98};
		
		
		String[] strarray = {"tom", "john", "harry","thomas"};
		
		
		for(String s : strarray) {
			
			System.out.print(s+ " ");
			
		}
		
		for(int i : array) {
			
			System.out.println(i);
		}
		
		
	}

	public static void main(String[] args) {
		int[] a = {23,34,46,76,78,98};
		int[] b	= {23,34,46,76,78,98};
		
		arraysearchInt(a, 76);
		
		//System.out.println(array.length);
		//largestelement(array);
		//comparearray(a,b);
		
		/*String[] c = {"a", "d", "t", "g", "f", "p"};
		sortStringArray(c);
		
		for(String s: c) {
			
			System.out.println(s);
		}*/
		
		
		
		/*Arrays.parallelSort(a);
		for(int i: a) {
			
			System.out.println(i);
		}
		
		sortarray(b);*/
		
		//System.out.println(a);
		//System.out.println(result);
		
		//arraydemo();
		
		/*int[][] arr = new int[2][2];
		
		arr[0][0]=101;
		arr[0][1]=102;
		arr[1][0]=201;
		arr[1][1]=202;
		
		//System.out.println(arr.length);
		for(int[] row: arr) {
			
			for(int col: row) {
				System.out.print(col);
				System.out.print(" ");
			}
			System.out.println();
			
		}*/

	}

}
