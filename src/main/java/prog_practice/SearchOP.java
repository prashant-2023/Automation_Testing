package prog_practice;



public class SearchOP {

	public static void binarySearch(int[] a, int checkvalue) {

		boolean flag=false;
		int start=0;
		int end=a.length-1;



		while(start<=end) {

			int mid=(start+end)/2;

			if(a[mid]==checkvalue) {

				System.out.println("Value " + a[mid] + " is found at "+ mid + " position." );
				flag=true;
				break;
			}	

			if(checkvalue>a[mid]) {

				start=mid+1;


			}
			if(checkvalue<a[mid]) {

				end=mid-1;


			}



		}
		if(flag==false)
			System.out.println("Element not found");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] testarray= {1,3,5,6,8,9,11,34,56,78,88};



		binarySearch(testarray,88);

	}
}
