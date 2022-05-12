package exercise;

import java.util.Scanner;

import lombok.Cleanup;

public class ScannerExample {
	
	public static void main (String[] args) {
		@Cleanup
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열 입력> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.println("정수 입력> ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.println("실수 입력> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		System.out.println();
		
	} // main 

} // end class
