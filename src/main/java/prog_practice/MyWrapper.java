package prog_practice;

public class MyWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Auto Boxing -- Variable to Object
		/*
		int a = 10;
		
		Integer b = a;
		
		System.out.println(b);*/
		
		
		// Unboxing -- Object to variable
		
		Integer a =100;
		
		String s = "123456";
		int b= 20;
		
		//int value = a.intValue();
		
		//double doub_val = a.doubleValue();
		
		//Byte byte_val = a.byteValue();
		
		Integer i = Integer.valueOf(s);
		
		Integer c = Integer.valueOf(b);
		
		Integer intgr = Integer.parseInt(s);
		
		System.out.println(intgr);
		
		
		
		
		
	}

}
