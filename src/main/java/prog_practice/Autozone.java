package prog_practice;

public class Autozone {

	//Given two strings, string 1 and string 2, 
	//select only the characters in each string
	//where the character in the same position in the other string is in uppercase. 
	//Return these as a single string. e.g., if string 1 = “heLLo” and string 2 = “GUlp”, Output would be “help” Solution Reasoning – we select letters “he” from string 1 since G and U from string 2 are uppercase, similarly we select letters “lp” from string 2 since LL from string 1 are in uppercase. Finally, when we join “he” and “lp” we got “help”. Other Examples: - I/P – “1234567”, “XxXxX”, O/P – “135” I/P – “EVERYTHING”, “SomeThings”, O/P – “EYSomeThings”
	 //I/P – “EVERYTHING”, “SomeThings”, O/P – “EYSomeThings”
	// s1 = GOODday  , s2 = GoodMORNING.
	
	public static void main(String[] args) {
		
		
		String s1 = "EVERYTHING";
		String s2 = "SomeThings";
		//String result = "";
		
		if(s1.isBlank() || s2.isBlank()) {
			
			System.out.println("One of the string is empty. Please enter both the string values.");
		}
		
		int minlength = Math.min(s1.length(), s2.length());		
			
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < minlength; i++) {
			
            if (Character.isUpperCase(s2.charAt(i))) {
                sb.append(s1.charAt(i));
            }
           
        }
		
		for (int i = 0; i < minlength; i++) {
		 if (Character.isUpperCase(s1.charAt(i))) {
             sb.append(s2.charAt(i));
         }
		}
		System.out.println(sb.toString());
		
		
	
	}}
	
