package programmers.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FailureRate {

	// https://school.programmers.co.kr/learn/courses/30/lessons/42889
	public int[] solution(int N, int[] stages) {
        int users = N;
		int[] answer = new int[users];
		
		Map<Integer, Double> map = new HashMap<>();
		int challenger = 0;
		int formerNotClear = 0;
		
		for (int i = 1; i <= users; i++){
			// 총도전자수 구하기
			if (i == 1){
				challenger = stages.length;
			} else {
				challenger = challenger - formerNotClear;
			}			
			
			// notClear 구하기
			int notClear = 0;
			for (int stage :stages) {
				if (i == stage){
					notClear++;
				}
			}			
			formerNotClear = notClear;
			
			// 실패율 세팅
			double failRate = 0.0;
			if (notClear!=0) {
				failRate = (double) notClear / (double) challenger;				
			} else {
				failRate = 0;
			}
			
			// 리스트에 배열 삽입
			map.put(i, failRate);
		}
		
		// Value 값으로 내림차순 정렬
		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.sort((e1, e2) -> map.get(e2).compareTo(map.get(e1)));

		int i = 0;
        for (Integer key : keySet) {
            answer[i] = key;
            i++;
        }
        
        return answer;
    }

}
