package CodeUp100;

import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	

		String originalNum = scan.nextLine();
		String [] stringArr = originalNum.split(" ");
		
		Long num1 = Long.parseLong(stringArr[0]);
		Long num2 = Long.parseLong(stringArr[1]);
		
		System.out.println(num1 + num2);
    
	} // main

} // end class
