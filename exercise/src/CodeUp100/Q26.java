package CodeUp100;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       String time = scan.nextLine();   
       String[] arrTime = time.split(":");
       
       if(arrTime[1].equals("00")) {
    	   System.out.println(0);
       } else {
    	   System.out.println(arrTime[1]);    	   
       } // if-else
    
	} // main

} // end class
