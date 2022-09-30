package CodeUp100;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		Integer num10 = Integer.valueOf(scan.nextLine(), 16);
		
		String num8 = Integer.toOctalString(num10);
		
		System.out.println(num8);		
    
	} // main

} // end class
