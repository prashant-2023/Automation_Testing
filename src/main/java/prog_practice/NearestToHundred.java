package prog_practice;



//Java program to return a number which is closest to 100

public class NearestToHundred {
	
	
	public static int nearest(int a, int b) {
		
		int diffa = Math.abs(100-a);
		int diffb = Math.abs(100-b);
		
					
			if(a==b){
				
				System.out.println("Numbers are same.");
			}
			if (diffa==diffb) {
				
				System.out.println("Difference is same.");
			}
			
			
			return (diffa <= diffb) ? a : b;
		
	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int closest = nearest(102,101);
		//int x= -90;
		//int y = 200;
		//int z = x-100;
		System.out.println(closest);

	}

}
