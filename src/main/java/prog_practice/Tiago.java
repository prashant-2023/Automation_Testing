package prog_practice;

public class Tiago extends CarEngine{

	/* A subclass has to override all the abstract methods of an abstract class. 
	 * An abstract class can contain both abstract and non-abstract methods.
	 * It is not mandatory to override non-abstract methods of an abstract class.
	 */

	
	public Tiago(int first, double second) {
		super(first, second);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void driveMode(String mode) {
		
		System.out.println("drive mode - abstract");
		
	}

	@Override
	public void changeGear(int gear) {
		System.out.println("change gear - abstract");
		
	}
	
	public void nonAbstractMethod(String carName) {
		System.out.println("this is non-abstract method");
	}

	

}
