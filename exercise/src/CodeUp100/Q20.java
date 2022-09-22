package CodeUp100;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String cdn = scan.nextLine();
		cdn = cdn.replaceAll("-", "");
		
		System.out.printf(cdn);
		
	} // main

} // end class
