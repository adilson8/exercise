package programmers.lv1;

import java.util.LinkedList;
import java.util.Queue;

public class PaintingWall {

	// https://school.programmers.co.kr/learn/courses/30/lessons/161989
	public int solution(int n, int m, int[] section) {		
		int answer = 1;
		
		int largestPaintedSector = 0;
		Queue<Integer> sectionQueue = new LinkedList<>();
		for (int i=0; i<section.length; i++){
			sectionQueue.offer(section[i]);
		}
		
		for (int i=0; i < (n/m)+1; i++) {
		
			largestPaintedSector = sectionQueue.peek() + m - 1;
			
			if (largestPaintedSector >= section[section.length-1]){
				break;
			}
			
			answer++;
			
			// 여기서 큐 삭제처리
			for (int j =0; j < section.length; j++) {
				if (sectionQueue.peek() <= largestPaintedSector){
					sectionQueue.poll();
				} else {
					break;
				}
			}
		}
        
        return answer;
    }

}
