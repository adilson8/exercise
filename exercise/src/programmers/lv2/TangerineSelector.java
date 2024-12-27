package programmers.lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
//		int k = 6;
//		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		
		// answer = 2;
//		int k = 4;
//		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		
		// answer = 1;
		int k = 2;
		int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
		
		Map<Integer, Integer> tMap = new HashMap<>();
		
		// 중복제거
		Set<Integer> forSale = new HashSet<>();
		for(int i = 0; i < tangerine.length; i++){
			forSale.add(tangerine[i]);
		}

		// map에 key값 세팅
		for (int fs :forSale){
			tMap.put(fs, 0);
		}
		
		// value값 세팅 
		for (int t : tangerine){
			tMap.replace(t, tMap.get(t)+1);
		}
		
		// sortedtMap 출력
		tMap.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
		
		System.out.println("/////////////////////////////");
		
		// 여기서 밸류값 높은 순서대로 뽑아서 넘기면 되긴 될텐데 이거 100% 효율성에서 뻗어버림 (길이가 천만임...)
		// 일단 여기 있는 테스트케이스 넘어가게 작성하고 효율성 검토 고고고
		
		// tMap을 value가 높은대로 정렬
		Map<Integer, Integer> sortedtMap = tMap.entrySet()
	            .stream()
	            .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
	            .collect(Collectors.toMap(
            		entry -> entry.getKey(), 
            		entry -> entry.getValue(), 
            		(existingValue, newValue) -> existingValue, // 중복 키 처리 (필요하지 않지만 혹시 모르니)
            		() -> new LinkedHashMap<>()
	            ));
		
		// sortedtMap 출력
		sortedtMap.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
		
		System.out.println("/////////////////////////////");

		int sum = 0;
		int answer = 0;
		for (int sortedtMapKey : sortedtMap.keySet()){
			sum += sortedtMap.get(sortedtMapKey);			
			
			if(sum>k){
				break;
			} else {
				answer++;
			}
		}
		
		if (answer == 0){
			answer = 1;
		}
		
		System.out.println(answer);
	
	}
	
}
