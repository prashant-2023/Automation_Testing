package prog_practice;

public class EncapsulationDemo extends Employee{

	
	private int age;
	public String name;
	public  EncapsulationDemo(int a, String n){
		super("name",23);
		this.age = a;
		this.name = n;
		System.out.println("Name is : " + name + "\nAge is : " + age);
		
     }
	
	public void testMethod() {
		
		System.out.println("Inside encaps class method");
		
	}
	
	
	
	public static void main(String[] args) {
	       
		//EncapsulationDemo hw = new EncapsulationDemo(23, "Durga");
	   // System.out.println(hw.age);
	  //  System.out.println(hw.name);
	   // hw.testMethod();
	    Employee emp = new Employee("Kajal", 584569);
	    //Employee.company="PWC";
	    emp.display();
	    
		
		
		
	    
	    }
}
