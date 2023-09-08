package prog_practice;

public class EqualsMethodDemo {
	
	int random;
	
	public EqualsMethodDemo(int x) {
		// TODO Auto-generated constructor stub
		
		this.random=x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var1 = 25;
		int var2 = 26;
		
		EqualsMethodDemo emd = new EqualsMethodDemo(5);
		EqualsMethodDemo emd2 = new EqualsMethodDemo(5);
		EncapsulationDemo ecap = new EncapsulationDemo(26, "ram");
		//ecap.privateMethod();
		//ecap.protectedMethod();
		
		/*
		System.out.println("object 1 is " + emd);
		System.out.println("object 2 is " + emd2); */
		
		System.out.println("Is object 1 equals to object 2 " + (var1 == var2));

	}

}
