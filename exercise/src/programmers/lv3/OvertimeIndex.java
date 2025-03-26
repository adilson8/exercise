package programmers.lv3;

import java.util.Collections;
import java.util.PriorityQueue;

public class OvertimeIndex {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12927s
	public static void main (String[] args){
		
		// answer = 12
		int[] works = {4, 3, 3};
		int n = 4;
		
		// answer = 6
//		int[] works = {2, 1, 2};
//		int n = 1;
		
		// answer = 0
//		int[] works = {1, 1};
//		int n = 3;
		
		long answer = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int w : works){
			pq.add(w);
		}
		
		System.out.println(pq.peek());
		

//		for(int i = 0; i < n; i++){
//			Arrays.sort(works);
//			works[works.length-1] -= 1;
//			
//			if (works[works.length-1] < 0){
//				System.out.println("여기서 리턴 0" );
//			}
//		}	
//		
//		for (int w : works){
//			answer += w*w;
//		}
		
		System.out.println(answer);
		
	}

}
