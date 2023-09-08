package prog_practice;

public abstract class CarEngine {

	int a;
	double b;
	
	//* An abstract class can contain both abstract and non-abstract methods.
	//* An abstract class can have a constructor, static method.
	//* An abstract class can have final method that prevents child class of abstract class not to change the body of the method
	public abstract void driveMode(String mode);
	public abstract void changeGear(int gear);
	
	public static void StaticMethod() {
		
	}
	
	public void nonabstartmehod() {
	}
	
	public CarEngine(int first, double second) {
		
		this.a=first;
		this.b=second;
	}
}