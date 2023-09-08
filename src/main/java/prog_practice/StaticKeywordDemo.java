package prog_practice;

public class StaticKeywordDemo {

	final int age;
	String name;
	static String city;
	
	static String s1="EY";
	static String s2="EY";
	
	
	static {
		
		
		StaticKeywordDemo.city="Bengaluru";
		System.out.println("Inside 1st static block");
	}
	
	static {
		
		System.out.println("Inside 2nd static block");
		
	}
	
	
	public StaticKeywordDemo(int a, String n) {
		this.age=a;
		this.name=n;
		System.out.println("Inside constructor");

	}
	
	public static void read(StaticKeywordDemo skd) {
		
		System.out.println("Name : " + skd.name +"\n" + "Age : " +skd.age + "\n" + "City : " + city);
		
	}

	public static void main(String[] args) {
		
			
		
		StaticKeywordDemo skd = new StaticKeywordDemo(10, "Kartik");
		
		StaticKeywordDemo.city="Gurgaon";
		skd.name="Radha";
		StaticKeywordDemo.read(skd);
		
		
		
		
		/*System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));*/
		
		

	}

}
