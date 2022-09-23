package CodeUp100;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String number = scan.nextLine();		
		String[] split = number.split("\\.");		
		
		System.out.println(split[0]);
		System.out.println(split[1]);
		
	} // main

} // end class
