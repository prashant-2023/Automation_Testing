package prog_practice;

public class NumberSwap {

	
	public static void nmbrSwap(int a, int b) {
		// TODO Auto-generated constructor stub
		
//		int x=0;
		
		int temp =a;
		
		a = b;
		
		b = temp;
		
		
		System.out.println("Value of a = " + a);
		
		System.out.println("Value of b = " + b);
			
		
	//	System.out.println( "Value of a = " + b + "\nValue of b = " + x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nmbrSwap(2,4);
	}

}
