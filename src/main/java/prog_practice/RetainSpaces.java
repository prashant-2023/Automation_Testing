package prog_practice;

public class RetainSpaces {

	public static void main(String agrs[]) {
		
	//String str = "a b d f gh";
	/*	
	StringBuilder sb = new StringBuilder(str); // Output - h1g2f3d4ba
	
	for(int i=0;i<str.length();i++) {
		
		if(str.charAt(i)== ' ') {
			
			sb.replace(i, i, str);
		}
				
	}
	System.out.println(sb);
	*/
	String str = "a b d f gh";
	
	char[] inputArr = str.toCharArray();
	
	char[] resultArr = new char[inputArr.length]; 
	
	for(int i=0; i<inputArr.length; i++) {
		
		if(inputArr[i]== ' ') {		//putting all the spaces in resultArray
			
			resultArr[i] = ' ';
		}
		
	}
	
	int j = resultArr.length-1;
	
	for(int i=0; i<inputArr.length;i++) {
		
	if(inputArr[i] != ' ') { // putting non-space values in resultArray starting from last index
		
	
		if(resultArr[j] == ' ') {	// skipping spaces inserted in resultArray.
			
			j--;
		}
		
		resultArr[j]=inputArr[i];
		j--;
		
	}
	}
	System.out.println(String.valueOf(resultArr));
}
}
