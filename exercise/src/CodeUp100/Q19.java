package CodeUp100;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String time = scan.nextLine();
		String [] arr = time.split("\\.");
		
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);

	} // main

} // end class
