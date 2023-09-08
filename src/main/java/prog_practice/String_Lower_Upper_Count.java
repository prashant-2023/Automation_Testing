package prog_practice;

public class String_Lower_Upper_Count {

	public static void main(String[] args) {
		
		String str = "This is auTomation sTring";
		int uppercount=0;
		int lowercount=0;
		String uppercase="";
		String lowercase="";
		
		char[] ch= str.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			
			if(ch[i]>='A' & ch[i] <='Z') {
				uppercount++;
				uppercase+=ch[i];
				
			}
			else if(ch[i]>='a' & ch[i] <='z') {
				lowercount++;
				lowercase+=ch[i];
				
			}
			
			
		}
		
		
		System.out.println("UpperCase" + " " + uppercount + "  " + uppercase);
		System.out.println("LowerCase" + " " + lowercount + "   " + lowercase );
	}

}
