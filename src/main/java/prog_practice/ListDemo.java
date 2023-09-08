// Java program to demonstrate the
// working of ArrayList
package prog_practice;
import java.util.*;

class ListDemo {

	
	// Main Method
	public static void main(String[] args)
	{
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("abc");
		alist.add("def");
		alist.add(2, "xyz");
		Collections.sort(alist, Collections.reverseOrder());
		
		
		// Declaring the ArrayList with
		// initial size n
		ArrayList<String> al = new ArrayList<String>();
			
			al.add("25");
			al.add("36");
		

		Collections.sort(al);
		
		
		// Printing elements
		System.out.println(al);
		
		// Remove element at index 3
		//al.remove(3);

		// Displaying the ArrayList
		// after deletion
		System.out.println(al);

		// Printing elements one by one
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");
		
		alist.addAll(al);
		System.out.println(alist);
	}
	
}
