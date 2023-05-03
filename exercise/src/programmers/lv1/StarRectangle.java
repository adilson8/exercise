package programmers.lv1;

import java.util.Scanner;

public class StarRectangle {
	
	//https://school.programmers.co.kr/learn/courses/30/lessons/12969
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String line = "";        
        for (int j = 1; j <= a; j++){
        	line += "*";        		
        }        
        
        for (int i = 1; i <= b; i++){
        	System.out.println(line);
        }
    }

}
