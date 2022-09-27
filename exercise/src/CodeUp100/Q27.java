package CodeUp100;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       
       String date = scan.nextLine();   
       String[] arrDate = date.split("[.]");
       
       System.out.println(arrDate[2] + "-" +arrDate[1] + "-" +arrDate[0]);
    
	} // main

} // end class
