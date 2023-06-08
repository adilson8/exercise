package programmers.lv1;

import java.util.Arrays;

public class HallOfFame {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/138477
	public static void main (String[] args){
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		System.out.println(Arrays.toString(score));
		
		int[] hallOfFame = {2001, 2001, 2001};
		int[] answer = new int [score.length];
		for (int i = 0; i < score.length; i++){
			if (i < 3) {
				hallOfFame[i] = score[i];
				Arrays.sort(hallOfFame);
			} else {
				for (int j = 0; j < hallOfFame.length; j++){
					
				}
			}
			
			System.out.println(Arrays.toString(hallOfFame));
			answer[i] = hallOfFame[0];
		}
		
		
		System.out.println(Arrays.toString(answer));
	}
}
