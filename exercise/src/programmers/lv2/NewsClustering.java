package programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsClustering {

	// https://school.programmers.co.kr/learn/courses/30/lessons/17677
	public static int main(String str1, String str2) {		
		int answer = 0;
		
		// 집합1 준비
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < str1.length()-1; i++){
			String tmp = "";
			tmp += String.valueOf(str1.charAt(i)) + String.valueOf(str1.charAt(i+1));
			String replaced = tmp.replaceAll("[^a-zA-Z]", "*");
			if (!replaced.contains("*")) {
				list1.add(tmp.toUpperCase());
			}
		}
		
		// 집합2 준비
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < str2.length()-1; i++){
			String tmp = "";
			tmp += String.valueOf(str2.charAt(i)) + String.valueOf(str2.charAt(i+1));
			String replaced = tmp.replaceAll("[^a-zA-Z]", "*");
			if (!replaced.contains("*")) {
				list2.add(tmp.toUpperCase());
			}
		}
		
		// 원소별 갯수 구하기
		Map<String, Integer> map1 = new HashMap<>();
		for (String l1 : list1) {
			map1.put(l1, map1.getOrDefault(l1, 0)+1);
		}
		
		Map<String, Integer> map2 = new HashMap<>();
		for (String l2 : list2) {
			map2.put(l2, map2.getOrDefault(l2, 0)+1);			
		}
		
		// 교집합 만들기
		List<String> intersectionList = new ArrayList<>();
		for (String map1Key : map1.keySet()) {
			if(map2.containsKey(map1Key)) {
				int cnt = (map1.get(map1Key) > map2.get(map1Key)) ? 
						map2.get(map1Key) : map1.get(map1Key);
				
				for (int i = 0; i < cnt; i ++) {
					intersectionList.add(map1Key);
				}
			}
		}
		
		// 합집합 만들기
		List<String> unionList = new ArrayList<>();
		for (String map1Key : map1.keySet()) {
			int cnt = 0;
			
			if (map2.containsKey(map1Key)) {
				cnt = (map1.get(map1Key) > map2.get(map1Key)) ? 
						map1.get(map1Key) : map2.get(map1Key);
			} else {
				cnt = map1.get(map1Key);
			}
			
			for (int i = 0; i < cnt; i ++) {
				unionList.add(map1Key);
			}				
		}
		
		for (String map2Key : map2.keySet()) {
			int cnt = 0;
			
			if (!map1.containsKey(map2Key)) {
				cnt = map2.get(map2Key);
			}
			
			for (int i = 0; i < cnt; i ++) {
				unionList.add(map2Key);
			}	
		}
		
		// 자카드 계산
		double jaccard = (double) intersectionList.size() / (double) unionList.size();
		answer = (int) Math.floor(jaccard * 65536);
		
		// 예외처리
		if (unionList.size() == 0 ||
				(intersectionList.size() == 0 && unionList.size() == 0)) {
			answer = 65536;
		}
		
		return answer;
	}

}
