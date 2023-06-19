package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class FruitShop {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/135808
	public int solution(int k, int m, int[] score) {
        Integer[] scoreWrapper = new Integer[score.length];
        for (int i = 0; i < scoreWrapper.length; i++){
            scoreWrapper[i] = score[i];
        }

        Arrays.sort(scoreWrapper, Collections.reverseOrder());

        int boxes = scoreWrapper.length / m;

        int answer = 0;
        for(int i = 0; i < boxes; i++){
            Integer[] box = new Integer[m];
            for (int j = 0; j < m; j++){
                box[j] = scoreWrapper[i*m + j];
            }
            int price = box[m-1] * m;
            answer = answer + price;
        }

        return answer;
    }

}
