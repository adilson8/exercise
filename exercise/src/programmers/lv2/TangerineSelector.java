package programmers.lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TangerineSelector {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/138476
	public static void main (String[] args) {
		
//		제한사항
//		1 ≤ k ≤ tangerine의 길이 ≤ 100,000
//		1 ≤ tangerine의 원소 ≤ 10,000,000
		
//		입출력 예
//		k	tangerine	result
//		6	[1, 3, 2, 5, 4, 5, 2, 3]	3
//		4	[1, 3, 2, 5, 4, 5, 2, 3]	2
//		2	[1, 1, 1, 1, 2, 2, 2, 3]	1
		
		// answer = 3;
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		
		// answer = 2;
//		int k = 4;
//		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		
		// answer = 1;
//		int k = 2;
//		int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
		
		int answer = 0;
		
		Map<Integer, Integer> tMap = new HashMap<>();
		
		Set<Integer> forSale = new HashSet<>();
		for(int i = 0; i < tangerine.length; i++){
			forSale.add(tangerine[i]);
		}

		for (int fs :forSale){
			tMap.put(fs, 0);
		}
		
		for (int t : tangerine){
			tMap.replace(t, tMap.get(t)+1);
		}

		// 여기서 밸류값 높은 순서대로 뽑아서 넘기면 되긴 될텐데 이거 100% 효율성에서 뻗어버림 (길이가 천만임...)
		// 일단 여기 있는 테스트케이스 넘어가게 작성하고 효율성 검토 고고고
		
		System.out.println(answer);
	
	}
	
}
