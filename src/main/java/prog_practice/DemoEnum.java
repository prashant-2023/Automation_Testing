package prog_practice;

public enum DemoEnum {

	New("NEW"), InProgress("IPR"), InReview("INR"), ReadyForTesting("RFT"), Closed("CLD");
	
	public String abb;
	
	DemoEnum(String s) {
		
		this.abb=s;
	}
	
	public String getabb() {
		
		return abb;
	}
	


public static void main(String[] args) {
	
	DemoEnum e = DemoEnum.ReadyForTesting;
	//System.out.println(e.getabb());
	
	switch(e)
	{
	case New:
		
		System.out.println("Defect Raised");
		System.out.println(e.getabb());
		break;
		
	case InProgress:
		
		System.out.println("Defect is with dev team");
		System.out.println(e.getabb());
		break;
		
	case InReview:
		
		System.out.println("Defect is with dev lead");
		System.out.println(e.getabb());
		break;
		
	case ReadyForTesting:
	
		System.out.println("Defect is ready for testing");
		System.out.println(e.getabb());
		break;
		
	default :
		System.out.println("Defect is closed");
		System.out.println(e.getabb());
		break;
		
		
	
	}
	 
	
}
}
