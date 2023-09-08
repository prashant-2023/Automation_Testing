package prog_practice;



public class StaticFinalClass {

	public static int a = 10;
	public final int b = 20;
	public static final int c = 5;

	public static void main(String args[])
	{
	a= 20;
	//b =5;
	//c = 15;
	System.out.println(a);
	//System.out.println(b);
	System.out.println(c);
	}

}