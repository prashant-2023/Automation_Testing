package prog_practice;

public class ExceptionHandling {

	public static int areaofrectangle(int a, int b) throws MyException  {
		
	if(b==0) {
		
		throw new MyException();
	}
		
		int area =  a/b;
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result=0;
		
			
				try {
					result = areaofrectangle(2,0);
				} catch (MyException e) {
					// TODO Auto-generated catch block
					//e.toString();
					e.getMessage();
					e.printStackTrace();
				}
			
		
		System.out.println(result);

	}

}
