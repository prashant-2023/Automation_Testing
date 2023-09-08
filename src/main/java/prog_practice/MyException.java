package prog_practice;

public class MyException extends Exception{

	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is toString method in my exception.";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "This is getmessage method in exception class";
	}
	
	

}
