package prog_practice;

import java.util.*;

//import java.util.HashMap;

public class ArraysPractice {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,0,2,0,3,0,4,5};
		
		int[] result = moveZerosLeft(arr);
		
		for(int e: result) {
			
			System.out.print(e + " ");
		}
		
	}
	public static int[] moveZerosLeft(int[] arr) {
		if (arr == null) {
			return null;
		}

		int n = arr.length;
		if (n <= 1) {
			return arr;
		}

		// writeIndex points to where the next non-zero should be placed from the right
		int writeIndex = n - 1;

		// Move non-zero elements to the right side in reverse order.
		// This preserves the original relative order of non-zero elements when the
		// remaining left positions are filled with zeros.
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[writeIndex] = arr[i];
				writeIndex--;
			}
		}

		// Fill the remaining left positions with zeros
		for (int i = 0; i <= writeIndex; i++) {
			arr[i] = 0;
		}

		return arr;
	}
	
	
	
	
	//{1,1,555,555,8,3,9,1,4,54,23,87,99,142,99}
	//{1,2,12,13,14}
	//{5,6,7,9,10,15,40}
	//o/p - 1,2,3,4,5,6,7,8,9,10,15,40
	
	// Write a program to rotate an array to the right by k positions.
	
	public static void rotateArray(int[] arr, int k) {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] countDuplicates(int arr[]) {
		
		int positiveDuplicates = 0;
		int negativeDuplicates = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
				
		for(int num: arr) {
			
				
				map.put(num, map.getOrDefault(num, 0)+1);
				
		}
		
		
		
		for(Map.Entry<Integer, Integer> e: map.entrySet()) {
			
			if(e.getValue()>1) {
				
				positiveDuplicates++;
				
				//System.out.print(" " +e.getKey());
			}
			if(e.getKey()<0) {
				
				negativeDuplicates++;
			}
			
			
			
		}
		
		System.out.print("Total duplicates are: " +  (positiveDuplicates+negativeDuplicates));
		
		return new int[]{positiveDuplicates, negativeDuplicates};
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int findSecondLargest(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int e: arr) {
			
			if(e>largest) {
				secondLargest = largest;
				largest = e;
				
			}
			else if(e<largest && e>secondLargest){
				
				secondLargest = e;
			}
			
		}
		
		
		
		return secondLargest;
	}
	
	public static void mergeSortedArrays(int[] a, int[] b) {
		
		int alength = a.length;
		int blength = b.length;
		
		int[] mergedArray = new int[alength+blength];
		
		int i=0;
		int j=0;
		int k=0;
		for(; i<alength && j<blength; k++) {
				
				
				if(a[i]<=b[j]) {
					
					mergedArray[k] = a[i];
					i++;
					
				}else {
					mergedArray[k] = b[j];
					j++;
					
				}
				
			
			
		}
		
		while(i<alength) {
			
			mergedArray[k++] = a[i++];
			
		}
		
		while(j<blength){
			
			mergedArray[k++] = b[j++];
		}
		
		for(int e: mergedArray) {
			
			System.out.print(e + " ");
		}
		
	}
	
	
	
	
	
	
	
	
	public static void findLargestNSmallest(int[] arr) {
		
		if(arr.length==0 || arr==null) {
			
			System.out.println("Array is empty.");
			
		}
		if(arr.length==1) {
			System.out.println("Array is only element, i.e. " + arr[0]);
		}
		
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]>largest) {
				
				largest = arr[i];
			}else if(arr[i]<smallest){
				
				smallest = arr[i];
			}
			
			
		}
		
		
		
		System.out.println("Largest is: " + largest + "\nSmallest is: " + smallest);
		
				
		
	}
	
	
	
	
	
	public static void removeDuplicate(int[] arr) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			
			if(set.add(num)) {
				
				System.out.print(num+" ");
			}
						
		}
		
		System.out.println("\n");
	}
	
		
	
	public static int[]findIndexUsingTwoPointers(int arr[], int target) {
		
		int left = 0;
		int right = arr.length-1;
		Arrays.sort(arr);
		
		while(left<right) {
			
			int sum = arr[left] + arr[right];
			
			if(sum==target) {
				
				return new int[] {left,right};
				
			}
			else if(sum>target) {
				
				right--;
		
			}else {
				left++;
			}
						
		}
		
			return new int[] {-1,-1};
	}
	
	

	
	public static int[][] interArray(int target, int[] arr) {
		//target = 11
		//int[] arr = {1,4,5,2,6,10};
		
		
		for(int i=1;i<arr.length; i++) {
		 	
		for(int j=i+1; j<arr.length;j++) {
			
			if(arr[i]+arr[j] == target) {
				
				return new int[][] {{i,j}, {arr[i], arr[j]}};
			}
			
		}
		}
		return new int[][] {{-1,-1}, {-1,-1}};
	}
	
	
	
	public static void swapnumbers(int arr[], int x,  int y) {
		
		int temp=0;
		
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}
	
	
	public static void multipdimarr(int row, int col) {
		
		//int r = 4;
		//int c = 5;
		
		int[][] mArr = new int[row][col];
		
		for(int i=0;i<row; i++) {
			
			for(int j=0;j<col;j++) {
				
				int numr = (int)(Math.random() * 100);
				
				mArr[i][j] = numr;
				
				System.out.print(mArr[i][j] + " ");
			}
			System.out.println();
			
			
			
		}
		/*
		double[][] mArray = new double[2][3];
		
		for(double a[]: mArray) {
			
			
		for(double y: a) {
			
			double number = Math.round((Math.random())*100);
			y= number;
			System.out.print(y + " ");
			
			
		}
		
		System.out.println();
				
			
		
			
		}
		
		
		for(int n[] : mArr) {
			
			
			for(int x: n) {
				
				
				int numr = (int)(Math.random()*10);
				x = numr;
				
				System.out.print(x + " ");
				
				
			}
			System.out.println();
		}
		*/
		
	}
	
	//BubbleSort algorithm
public static void bubblesortedArray(int[] arr) {
		
		//34,24,54,26,76,45,34,54
		//24,34,54,26,76,45,34,54
		//24,34,54,26,76,45,34,54
		//24,26,54,34,76,45,34,54
		//24,
		//int x = arr[0];
		//int temp=0;
		
		int size = arr.length;
		
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					swapnumbers(arr, j, j+1);				
					
				}
				//System.out.print(arr[j] + " ");
				
			}
			/*for(int a: arr) {
				
				System.out.print(a + " ");
				
			}
			System.out.println();*/
		}
		for(int a: arr) {
			
			System.out.print(a + " ");
			
		}
		
	}}
	

//	public static void main(String[] args) {
//		
//		//int[] arrayforsort= {-300, -200,-100};
//		
//		//int[] negArray = {100,200,300};
//		
//		//int[] a1 = {1,2,12,13,14,18};
//			int[] b1 = {600,700,6,7,9,10,549,600,700,9,7,6,43,15,16,-40,40,501,16,500,501,-800,600,32,90,100,500,550,2,450};
//		
//			int[] dupes = countDuplicates(b1);
//		
//			System.out.println("\nPositive duplicates are: " + dupes[0] + " \nNegative duplicates are: " + dupes[1]);
//		 
//		//int secondlargest = findSecondLargest(b1);
//				
//		//System.out.print(secondlargest);
//		
//		//mergeSortedArrays(arrayforsort,negArray);
//		//System.out.println(findSecondLargest(b1));
//		
//		//findLargestNSmallest(b1);
//		
//		
//		//removeDuplicate(arrayforsort);
//		//removeDuplicate(negArray);
//		
//		
//		
//		//swapnumbers(arrayforsort, 1 , 5);
//		/*
//		for(int a : arrayforsort) {
//			
//			System.out.print(a + " ");
//			
//		}*/
//		/*
//		int[] result = findIndexUsingTwoPointers(arrayforsort, 17);
//		
//		if(result[0]!=-1) {
//			
//			System.out.println("Indices are : " + result[0] +" and " + result[1]);
//			
//			
//		}
//		else {
//			
//			System.out.println("Elements doesnt add up to target value");
//		}
//		*/
//		
//		//bubblesortedArray(arrayforsort);
//		
//		/*
//		
//		Students.year=2025;
//		Students s1 = new Students();
//		
//		s1.name = "Hari";
//		s1.roll = 23;
//		s1.marks = 65;
//		
//		
//		Students s2 = new Students();
//		
//		s2.name = "Ram";
//		s2.roll = 24;
//		s2.marks = 98;
//		
//		
//		Students st[] = new Students[2];
//		
//		st[0] = s1;
//		st[1] = s2;
//	
//		for(Students val : st) {
//			
//			System.out.println(val.roll + " " + val.name + " : "  + val.marks + " "+Students.year);
//			
//		}
//		*/
//		
//	//	multipdimarr(5,6);
//		
//		/*
//		int[] arr = new int[5];
//		
//		
//		for(int i=0; i<arr.length-1; i++) {
//			
//			int rand = (int) (Math.random() * 10);
//			
//			arr[i]=rand;
//			
//			System.out.print(arr[i] + " ");
//			
//		}
//		
//		
//		*/
//		
//		/*
//		int[] arr = new int[5];
//		
//		for(int a: arr) {
//
//			int rand = (int) (Math.random() * 100);
//
//			a=rand;
//
//			System.out.print(a + " ");
//
//		}
//		
//*/
//	}
//
//}
