package programmers.lv1;

import java.util.Arrays;

public class NumberK {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42748
	public static void main (String[] args){
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i ++){
			for (int j = 0; j < commands[i].length; j++){
				
			}
			answer[i] = 0;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
