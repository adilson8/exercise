package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {

	// https://school.programmers.co.kr/learn/courses/30/lessons/17677
	public static void main(String[] args) {
		// answer = 16384;
//		String str1 = "FRANCE"; 
//		String str2 = "french";
		
		// answer = 65536;
//		String str1 = "handshake"; 
//		String str2 = "shake hands";
		
		// answer = 43690;
//		String str1 = "aa1+aa2"; 
//		String str2 = "AAAA12"; 
		
		// answer = 65536;
//		String str1 = "E=M*C^2"; 
//		String str2 = "e=m*c^2";
		
		// answer = 43690;
		String str1 = "ABABAB"; 
		String str2 = "BABABA";
		
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
		
		// 이제 합집합 교집합 만들어야함
		// 합집합 만들기
		List<String> sumList = new ArrayList<>();		
		if (list1.size() > list2.size()) {
			for (String l1 : list1) {
				sumList.add(l1);
			}
			
			for (String l2 : list2) {
				if (!sumList.contains(l2)) {
					sumList.add(l2);
				}
			}
		} else {
			for (String l2 : list2) {
				sumList.add(l2);
			}
			
			for (String l1 : list1) {
				if (!sumList.contains(l1)) {
					sumList.add(l1);
				}
			}
		}
		
		// 교집합 만들기
		List<String> minusList = new ArrayList<>();
		if (list1.size() > list2.size()) {
			for (String l2 : list2){
				if(list1.contains(l2)) {
					minusList.add(l2);
				}
			} 
			
		} else {
			for (String l1 : list1){
				if(list2.contains(l1)) {
					minusList.add(l1);
				}
			}
			
		}
		
		// 자카드 계산
		double jaccard = (double) minusList.size() / (double) sumList.size();
		answer = (int) Math.floor(jaccard* 65536);
		
		// 합집합 교집합 둘다 길이 0일때 처리해야함
		if (answer == 0) {
			answer = 65536;
		}
		
		System.out.println(answer);
		
		
	}

}
