package programmers.lv2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Process {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42587
	public static void main (String[] args) {
//		int[] priorities, int location
		
		// answer = 1
		int[] priorities = {2, 1, 3, 2};
		int location = 2; // 2번쨰 인덱스가 몇번째로 실행되는지?
		
		// answer = 5
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0;
		
		int answer = 0;
		
		Queue<Integer> pQueue  = new LinkedList<>();
		Queue<Integer> idxQueue = new LinkedList<>(); // 인덱스 큐
		int maxNum = 0;
		
		for (int i = 0; i < priorities.length; i++) {
            pQueue.add(priorities[i]);
            idxQueue.add(i);
            maxNum = Math.max(maxNum, priorities[i]);
        }
		
		// 이제 location 값인 2번째 인덱스가 몇번째로 실행되는지 answer에 저장하는 로직 추가필요
		while (pQueue.size()!=0) {
			if (pQueue.peek()<maxNum) {
				pQueue.add(pQueue.peek());
				pQueue.poll();
				// 여기에 idxQueue 처리
				
			} else {
				pQueue.poll();				
				// 여기에 idxQueue 처리
				
				maxNum = 0;
				for (int a : pQueue) {
					maxNum = Math.max(maxNum, a);
				}
			}
		}
			
		System.out.println(answer);
		
	}

}
