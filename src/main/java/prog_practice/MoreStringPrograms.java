package prog_practice;

/*Program to count numeric lower case, upper case, special characters in a string */

public class MoreStringPrograms {

	public static void stringCounter(String str) {
		
		String alphabets="";
		String numbers="";
		String specChar="";
		String upperCase ="";
		
		
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				alphabets+=str.charAt(i);
				if(Character.isUpperCase(str.charAt(i))) {
					upperCase+=str.charAt(i);
				}
			}
			else if(Character.isDigit(str.charAt(i))) {
			numbers+=str.charAt(i);
		}
			
			else {
				specChar+=str.charAt(i);
			}
		}
		System.out.println("Alphabets : " + alphabets);
		System.out.println("Numbers : " + numbers);
		System.out.println("Special Characters : " + specChar);
		System.out.println("Uppercase letters are : " + upperCase);
	}
	
	
	public static void countUpperLowerSpecNumeric(String str) {
		
		int digitCount=0;
		int upperCount=0;
		int lowerCount=0;
		int specCount=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				digitCount++;
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				upperCount++;
		}
			else if(Character.isLowerCase(str.charAt(i))) {
				lowerCount++;
			}
			else {
				specCount++;
			}
		
		}
		System.out.println("Total numeric : " + digitCount);
		System.out.println("Total uppercase : " + upperCount);
		System.out.println("Total lowercase : " + lowerCount);
		System.out.println("Total special characters : " + specCount);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "automatioGETEGn234$%^#@674336@$@%$^&";
		stringCounter(string);
		countUpperLowerSpecNumeric(string);

	}

}
