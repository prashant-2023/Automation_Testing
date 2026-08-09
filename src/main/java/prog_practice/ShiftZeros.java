package prog_practice;

public class ShiftZeros {
	
	public static void swap(int arr[], int a, int b) {
		
	int temp;
	
	temp=arr[a];
	arr[a] = arr[b];
	arr[b]= temp;
		
		
	}
	
	public static void shiftZerosToRight(int arr[]) {
		
		int j=arr.length-1;
		int length = arr.length-1;
		
		for(int i=length;i>=0; i--) {
				
			if(arr[i]==0) {
							
				swap(arr,j,i);
				j--;
				
			}
			
		}
		for(int a : arr) {
		
			System.out.print(a + " ");
		}
			
	}
		
		
	public static void shiftZerosToLeft(int arr[]) {	
		
		int j=0;
		int length = arr.length-1;
		
		for(int i=0;i<=length; i++) {
				
			if(arr[i]==0) {
							
				swap(arr,j,i);
				j++;
				
			}
			
		}
		for(int a : arr) {
		
			System.out.print(a + " ");
		}	
		
		
	}
	
	/*
	 public static void shiftZerosToLeft(int[] array) {
		 
	        if (array == null || array.length == 0) 
	        	return;

	        int insertionPos = 0;
	        for (int num : array) {
	            if (num != 0) {
	                array[insertionPos++] = num;
	            }
	        }
	        while (insertionPos < array.length) {
	            array[insertionPos++] = 0;
	        }
	    }
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {24,1,0,2,54,0,23,45,55,0,43,45,3,0,23,0,51,0};
			
		//shiftZerosToRight(arr);
		
		shiftZerosToLeft(arr);
		
		/*
		 
		  			 0,2,54,1,23,45,55,0,43,45.........  arr[0] = arr[i];
		  			 0,0,1,2,54,1,23,45,55,1,43,45.......  arr[1] = arr[i];
	
		  			 									   arr[2] = arr[i];
		 
		//int zeroleft[]= {};
		
		//shiftZerosToLeft(arr);
		/*
		for (int num : arr) {
            System.out.print(num + " ");
        }
		*/
	//	int count=0; {1,2,54,0,23,45,55,0,43,45,3,0,23,0,51,0};
		
	}

}
