package programmers.lv2;

import java.util.HashSet;
import java.util.Set;

public class CircularSubsequence {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/131701
	public static int main (int[] elements){
		
		int answer = 0;
		Set<Integer> sumList = new HashSet<>();
		
		int tmp = 0;
		for (int i = 1; i < elements.length+1; i++) {
			if (i == 1) { 
				// 길이가 1인 경우
				for (int e : elements) {
					sumList.add(e);
				}
			} else if (i == elements.length) {
				// 길이가 최대인 경우
				tmp = 0;
				for (int e : elements) {
					tmp += e;
				}
				sumList.add(tmp);
			} else {
				// 일반 케이스인 경우
				// i는 길이, j는 배열 원소의 시작 인덱스
				for (int j = 0; j < elements.length; j++) {
					tmp = 0;
					for (int k = 0; k < i; k++) {
						try {
							tmp += elements[j+k];						
						} catch (ArrayIndexOutOfBoundsException aioobe) {
							tmp += elements[j+k-elements.length];
						}
					}
					sumList.add(tmp);
				}
								
			}
		}
		
		answer = sumList.size();
		return answer;
	}

}
