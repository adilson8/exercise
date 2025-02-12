package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Process {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42587
	public static int main (int[] priorities, int location) {
		int answer = 1;
		
		Queue<Integer> pQueue  = new LinkedList<>();
		Queue<Integer> idxQueue = new LinkedList<>();
		int maxNum = 0;
		
		for (int i = 0; i < priorities.length; i++) {
            pQueue.add(priorities[i]);
            idxQueue.add(i);
            maxNum = Math.max(maxNum, priorities[i]);
        }
		
		while (pQueue.size()!=0) {
			if (pQueue.peek()<maxNum) {
				pQueue.add(pQueue.peek());
				pQueue.poll();
				
				// idxQueue 처리
				idxQueue.add(idxQueue.peek());
				idxQueue.poll();
			} else {
				pQueue.poll();
				
				if (idxQueue.peek()==location){
					break;
				} else {
					// idxQueue 처리
					idxQueue.poll();
					answer++;
				}
				
				maxNum = 0;
				for (int a : pQueue) {
					maxNum = Math.max(maxNum, a);
				}
			}
		}
			
		return answer;
		
	}

}
