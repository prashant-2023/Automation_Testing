package prog_practice;

public class Telus_L1 {

	public static void main(String[] args) {
		int nums[] = {5, 0, 23, 0, 1, 0, 32, 0, 9};
		/*
		 * 0,5,23,0,1,0,32,0,9 
		 * 0,0,23,5,1,0,32,0,9
		 * 0,0,0,5,1,23,32,0,9
		 * 0,0,0,0,1,23,32,5,9
		  
		 
		 * 
		 * 
		 * */
		
		
		int size = nums.length;

	//	Output - {5,23,1,32,9,0,0,0,0}
		
	//{5, 0, 23, 0, 1, 0, 32, 0, 9};
		
	/*	if(size==0 || size==1) {
			
			return;
		}
		*/
		int nz=0, z=0,temp=0;
		
		while(z<size) {
			
			if(nums[z]==0) {
					
				temp=nums[z];
				nums[z]=nums[nz];
				nums[nz]=temp;
				nz++;
				z++;				
					
				}
			else {
				
				z++;
			}
				
				
		}
		for(int i: nums) {
			
			System.out.print(i + " ");
		}
			
	
}}
