package programmers.lv1;

import java.util.Arrays;

public class HallOfFame {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/138477
	public int[] solution(int k, int[] score) {

        int[] hallOfFame = new int[k];
        for (int i = 0; i < k; i++){
            hallOfFame[i] = 2001;
        }

        int[] answer = new int [score.length];
        for (int i = 0; i < score.length; i++){
            if (i < k) {
                hallOfFame[i] = score[i];
                Arrays.sort(hallOfFame);
            } else {
                for(int j = 0; j < hallOfFame.length; j++){
                    if (hallOfFame[j]<score[i]){
                        hallOfFame[j] = score[i];
                        Arrays.sort(hallOfFame);
                        break;
                    }
                }
            }

            answer[i] = hallOfFame[0];
        }

        return answer;
    }
}