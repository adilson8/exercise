package CodeUp100;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();		
		String[] split = word.split("");		
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println("'" + split[i] + "'");
		} // for
		
	} // main

} // end class
