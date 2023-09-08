package prog_practice;

public class Overiding {

	public void show1() {
		
		System.out.println("FirstShow");
		
	}
	
	
	public void dividebyzero() {
		
		int a=2;
		int b=0;
		
		int	result=a/b; // result is infinity then data type is double
	
	System.out.println(result);
		
	}
	public void show() {
		
		System.out.println("Second show");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overiding ovr = new Overiding();
		
		//ovr.show();
		
		ovr.dividebyzero();

	}

}
