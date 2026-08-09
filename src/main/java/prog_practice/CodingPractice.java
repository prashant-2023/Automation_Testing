package prog_practice;

public class CodingPractice {

	public static void main(String[] args) {
		
		int a[] = {0,32,0,54,0,1,32,0,4,0,243,3,56,37,0,0};
	      
	    int j=0;
	    int temp=0;
		
	    //Shift zeros to left
	      for(int i=0;i<=a.length-1; i++){
	          
	          if(a[i]==0) {
	        	  
	        	  temp=a[i];
	        	  a[i]=a[j];
	        	  a[j]=temp;
	        	  j++;
	          }
	          
	          /* Shift zeros to right
	           * 
	           * int j= a.length-1;
	           * for(int i=a.length-1;i>=0; i--){
	          
	          if(a[i]==0) {
	        	  
	        	  temp=a[i];
	        	  a[i]=a[j];
	        	  a[j]=temp;
	        	  j--;
	          }
	           * 
	           * */
	           
	      }

	      for(int val : a) {
	    	  
	    	  System.out.print(val + " ");
	      }
		
		

	}

}
