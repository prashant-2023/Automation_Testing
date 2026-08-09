package prog_practice;

public class EY_L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,1,1,1,0,1,1,0,1,1,0};

		int zeros =0;
		int ones = 0;
	//	int zerocount=0;
		//int onecount=0;
		//int count[] = {};


		for(int i=0;i<arr.length;i++){


		if(arr[i]==0){

		//zerocount++;
			zeros++;
		
			
	
		
		//System.out.println();

		}
		
		
		else if(arr[i]==1){

		//onecount++;
		//count++;
		
			ones++;
			//System.out.print(arr[i]);
		


		}

		

		}
		
System.out.println("Zeros are " + zeros);
System.out.println("Ones are " + ones);

	}

}
