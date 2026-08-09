package prog_practice;

public class Admiral_India {

	public static void main(String[] args) {
		
		/*[4:48 PM] Veenal Gupta

		Java program to print Even length words in a String

		Input: s = "This is a java language"

		Output: This

		        is

		        java

		        language*/
		
		String s= "This is a java language odd even even even even even even";
		
		String[] words=s.split(" ");
		
		
		
		for(int i=0;i<words.length;i++) {
			
			if((words[i].length())%2==0) {
			
			System.out.print(words[i] + " ");;
			
			
		}
		
		}

	}

}
