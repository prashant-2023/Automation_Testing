package prog_practice;

public class B extends A{
	
	
	void voice() {
		
		System.out.println("Roar");
	}
	
	void colour() {
		
		System.out.println("AztecGold");
	}
	
	
	public void show() {
		
		System.out.println("INside B's method");
	}
	
	public void music() {
		
		System.out.println("Inside B's music");
	}
	
	protected void pr_method() {
		
		System.out.println("Overridden private method of class A ");
	}
	
	public static void main(String[] args) {
		
		A obj = new B();
		
		obj.voice();
		obj.colour();
		
			
		
	}
}
