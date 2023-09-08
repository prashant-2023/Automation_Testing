package prog_practice;



public abstract class A {
	
	abstract void voice();
	
	abstract void colour();
	
	
	static {
		
		System.out.println("Parent class static block");
	}
	
	private int  x;
	
	protected void pr_method() {
		
		System.out.println("Inside A'a protected method");
	}
	
	public void pubmethod() {
		System.out.println("Inside A's public method");
		
	}
	
	public void show() {
		
		System.out.println("Inside A's method");
		
		
	}

	}
	
	
