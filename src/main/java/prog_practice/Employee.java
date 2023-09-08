package prog_practice;
//PRogram to demonstrate usage of static keyword in java

public class Employee {

	private String empname;
	private	int empId;
	static String company= "Iris Software" ;
	
	public Employee(String name, int id) {
		
		this.empname = name;
		
		this.empId=id;
	
	}
		
	public void display() {
		
		
		System.out.println("Employee Name : " + empname + "\nEmployee ID : " + empId + "\nCompany Name : " + company);
		
	}

	public static void main(String[] args) {
		
		//String company = "Microsoft";
		//company = "Wipro HRSS Ltd.";
		
		Employee rohan = new Employee("Rohan", 589654 );
	//	Employee.company="Monotype";
		rohan.display();
		Employee rani = new Employee("Rani",584756 );
		
		//Employee.company = "Deloitte USI";
		rani.display();
		
		
		
	}

}



