package programmers.lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TangerineSelector {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/138476
	public int tangerineSelector(int k, int[] tangerine) {
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

        // tMap을 value가 높은대로 정렬
        Map<Integer, Integer> sortedtMap = tMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toMap(
                    entry -> entry.getKey(), 
                    entry -> entry.getValue(), 
                    (existingValue, newValue) -> existingValue,
                    () -> new LinkedHashMap<>()
                ));

        int sum = 0;
        int answer = 0;
        for (int sortedtMapKey : sortedtMap.keySet()){
            sum += sortedtMap.get(sortedtMapKey);           
            answer++;

            if(sum >= k){
                break;
            }
        }

        return answer;
    }
	
}
