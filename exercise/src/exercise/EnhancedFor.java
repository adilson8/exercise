package exercise;

public class EnhancedFor {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++ ) {			
			System.out.println("i = " + i);			
		} // for
		
				
		int [] intArr = {1,2,3,4,5};
		
		for ( int arr : intArr ) {			
			System.out.println("i = " + arr);			
		} // enhanced for

	} // main

} // end class
