package CodeUp100;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();        
        char[] arr = num.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i]);
            
            for(int j = arr.length-1; j > i; j--) {
                System.out.print("0");
            } // for
            
            System.out.println("]");
        } // for
    
	} // main

} // end class
