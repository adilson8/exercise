package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberPair {

	// https://school.programmers.co.kr/learn/courses/30/lessons/131128
	public static void main(String[] args) {
		
		// 문제점 1 : 시간초과
		// 문제점 2 : 수가 기하급수적으로 커지면 숫자가 이상해짐
				
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
				
		List<Integer> listX = new ArrayList<>();
		List<Integer> listY = new ArrayList<>();
		List<Integer> commonNum = new ArrayList<>();
		
		for (int i = 0; i < X.length(); i++) {
			listX.add(Character.getNumericValue(X.charAt(i)));
		}
				
		for (int i = 0; i < Y.length(); i++) {
			listY.add(Character.getNumericValue(Y.charAt(i)));
		}
				
		// 공통숫자 찾기
		for (int i = 0; i < listX.size(); i++){
			for (int j = 0; j < listY.size(); j++){
				if(listX.get(i) == listY.get(j)){
					commonNum.add(listY.get(j));
					listY.set(j, -1);
					break;
				}				
			}
		}
				
		for(Integer num : commonNum){
			System.out.println(num);
		}
				
		// 짝궁이 존재하지 않으면 짝궁은 -1
		if (commonNum.isEmpty()){
			answer = "-1";
			System.out.println(answer);
		}
				
		// 공통숫자가 0만 있으면 짝궁은 0
		Set<Integer> set = new HashSet<>(commonNum);
		if (set.size() == 1 && set.contains(0)){
			answer = "0";
			System.out.println(answer);
		}
				
		// 짝궁 계산
		Collections.sort(commonNum, Collections.reverseOrder());
		int answerNum = 0;
		for (int i = 0; i < commonNum.size(); i++){
			answerNum += commonNum.get(i) * Math.pow(10, commonNum.size()-1-i);
		}
		answer = String.valueOf(answerNum);
		System.out.println(answer);
	}
}
