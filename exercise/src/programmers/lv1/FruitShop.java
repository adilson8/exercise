package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class FruitShop {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/135808
	public static void main (String[] args){
		int k = 4; // 사과 최상등급 점수
		int m = 3; // 한 상자에 담기는 사과 갯수
		Integer[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		
		Arrays.sort(score, Collections.reverseOrder());
		System.out.println(Arrays.toString(score));
		
		int boxes = score.length / m;
		System.out.println(boxes);
		
		int answer = 0;
		for(int i = 0; i < boxes; i++){
			Integer[] box = new Integer[m];
			for (int j = 0; j < m; j++){
				box[j] = score[i*m + j];
			}
			int price = box[m-1] * m;
			answer = answer + price;
		}
		
		System.out.println(answer);		
		
	}

}
