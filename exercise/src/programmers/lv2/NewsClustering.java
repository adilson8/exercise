package programmers.lv2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NewsClustering {

	// https://school.programmers.co.kr/learn/courses/30/lessons/17677
	public static void main(String[] args) {
		// answer = 16384;
		String str1 = "FRANCE"; 
		String str2 = "french";
		
		// answer = 65536;
//		String str1 = "handshake"; 
//		String str2 = "shake hands";
		
		// answer = 43690;
//		String str1 = "aa1+aa2"; 
//		String str2 = "AAAA12"; 
		
		// answer = 65536;
//		String str1 = "E=M*C^2"; 
//		String str2 = "e=m*c^2"; 

		int answer = 0;
		
		// 집합1 준비 (일단 특수문자는 생각x)
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < str1.length()-1; i++){
			String tmp = "";
			tmp += String.valueOf(str1.charAt(i)) + String.valueOf(str1.charAt(i+1)); 
			list1.add(tmp.toUpperCase());
		}
		
		// 집합2 준비 (일단 특수문자는 생각x)
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < str2.length()-1; i++){
			String tmp = "";
			tmp += String.valueOf(str2.charAt(i)) + String.valueOf(str2.charAt(i+1)); 
			list2.add(tmp.toUpperCase());
		}
		
		// 이제 합집합 교집합 만들어야함
		// 합집합 만들기
		Set<String> sumSet = new LinkedHashSet<>();
		for (String l1 : list1){
			sumSet.add(l1);
		}
		
		for (String l2 : list2){
			sumSet.add(l2);
		}
		
		// 교집합 만들기
		Set<String> minusSet = new LinkedHashSet<>();
		for (String l1 : list1){
			for (String l2 : list2){
				if (l1.equals(l2)){
					minusSet.add(l1);
				}
			}
		} 
		
		double jakarta = (double) minusSet.size() / (double) sumSet.size();
		answer = (int)Math.floor(jakarta*100) *65536 / 100;
		
		System.out.println(answer);
		
		
	}

}
