package programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clothes {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42578
	public static int main (String[][] clothes) {		
		int answer = 1;
		
		Map<String, List<String>> clothesMap = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			if (clothesMap.containsKey(clothes[i][1])) {
				clothesMap.get(clothes[i][1]).add(clothes[i][0]);
			} else {
				List<String> list = new ArrayList<>();
				list.add(clothes[i][0]);
				clothesMap.put(clothes[i][1], list);
			}
		}
		
		if (clothesMap.size() == 1) {
//			answer = clothesMap.get(clothesMap.keySet().iterator().next()).size();
			answer = clothesMap.entrySet().iterator().next().getValue().size();
		} else {
			for (String key : clothesMap.keySet()) {
				answer *= (clothesMap.get(key).size()+1);
			}
			answer -= 1;
		}
		
		return answer;
	}

}
