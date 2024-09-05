package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NumberPair {

	// https://school.programmers.co.kr/learn/courses/30/lessons/131128
	public static void main(String[] args) {
		
		// 문제점 1 : 시간초과
				
		// answer : 321
//		String X = "12321";
//		String Y = "42531";
				
		// answer : -1
//		String X = "100";
//		String Y = "2345";
				
		// answer : 0
//		String X = "100";
//		String Y = "203045";
				
		// answer : 9999999999999999
		String X = "9999999999999999";
		String Y = "9999999999999999";
		
		String answer = "";
		
		Map<String, Integer> mapX = new HashMap<>(); 
		Map<String, Integer> mapY = new HashMap<>();
		List<String> commonNum = new ArrayList<>();
		
		char[] charX = X.toCharArray();
		char[] charY = Y.toCharArray();
		
		for (char x : charX){
			if (mapX.get(String.valueOf(x)) == null){
				mapX.put(String.valueOf(x), 1);
			} else {
				mapX.put(String.valueOf(x), mapX.get(String.valueOf(x))+1);
			}
		}
		
		// 공통 숫자 찾기
		for (Character y : charY){
			String stringY = String.valueOf(y);
			
			if (mapX.get(stringY) != null && mapX.get(stringY) != 0){
				commonNum.add(stringY);
				mapX.put(stringY, mapX.get(stringY)-1);
			}
		}
		
		for(String num : commonNum){
			System.out.println(num);
		}
		
		// 짝궁이 존재하지 않으면 짝궁은 -1
		if (commonNum.isEmpty()){
			answer = "-1";
			System.out.println(answer);
		}
		
		// 공통숫자가 0만 있으면 짝궁은 0
		Set<String> set = new HashSet<>(commonNum);
		if (set.size() == 1 && set.contains("0")){
			answer = "0";
			System.out.println(answer);
		}
		
		// 짝궁 계산
		Collections.sort(commonNum, Collections.reverseOrder());
		for (String c : commonNum){
			answer += c;
		}
		
		System.out.println(answer);
	}
}
