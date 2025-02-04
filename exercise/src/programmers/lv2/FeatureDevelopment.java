package programmers.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FeatureDevelopment {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42586
	public static int[] main (int[] progresses, int[] speeds){
		List<Integer> answerList = new ArrayList<>();
		
		// 최대 남은 기간 계산
		int maxRemainingProgress = 0;
		for (int i = 0; i < progresses.length; i++) {
			int remainingProgress = 100 - progresses[i];
			int requiredDays = remainingProgress/speeds[i];
			if (remainingProgress%speeds[i] !=0 ) {
				requiredDays++;
			}
			maxRemainingProgress = (requiredDays >= maxRemainingProgress) ? requiredDays: maxRemainingProgress;
		}
		
		// 배포 내역 계산
		int tmp = 0;
		for (int i = 0; i < maxRemainingProgress; i++) {
			Queue<Integer> pQueue = new LinkedList<>();
			
			for (int j = tmp; j < progresses.length; j++) {
				progresses[j] += speeds[j];
				pQueue.add(progresses[j]);
			}
			
			int answerElement = 0;
			while (pQueue.size() != 0 && pQueue.peek() >= 100) {
				pQueue.poll();
				answerElement++;
				tmp++;
			}
			
			if (answerElement != 0) {
				answerList.add(answerElement);
			}
		}
		
		// answer 반환
		int answer[] = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}
	
}
