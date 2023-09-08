package prog_practice;



public class C extends B{
	
static {
		
		System.out.println("Child class static block");
	}
	
	public void show() {
		
		System.out.println("Inside C's method");
		
	}
	
	public static void main(String args[]) {
		
	
		
	A ref = new B();
	ref.show();
	
	A b_obj = new B();
	b_obj.pr_method();
	
	
	//ref = new A();
	ref.show();
	ref.pubmethod();
	ref.pr_method();
	
		
	ref = new C();
	ref.show();
	
	}
	
	
}
