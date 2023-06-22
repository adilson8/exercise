package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockExam {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42840
	public static void main (String[] args){

		int[] answers = {1,2,3,4,5};
		
		List<Integer> supo1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));		
		List<Integer> supo2 = new ArrayList<>(Arrays.asList(2,1,2,3,2,4,2,5));		
		List<Integer> supo3 = new ArrayList<>(Arrays.asList(3,3,1,1,2,2,4,4,5,5));
		
		List<Integer> supo1long = new ArrayList<>();		
		List<Integer> supo2long = new ArrayList<>();		
		List<Integer> supo3long = new ArrayList<>();		
		
		for (int i = 0; i < 10000/5; i++) {
			supo1long.addAll(supo1);
		}
		
		for (int i = 0; i < 10000/8; i++) {
			supo2long.addAll(supo2);
		}
		
		for (int i = 0; i < 10000/10; i++) {
			supo3long.addAll(supo3);
		}
		
		int supo1score = 0;
		int supo2score = 0;
		int supo3score = 0;
		
		for (int i = 0; i < answers.length; i++){
				if (answers[i] == supo1long.get(i)) { supo1score++; }				
				if (answers[i] == supo2long.get(i)) { supo2score++; }				
				if (answers[i] == supo3long.get(i)) { supo3score++; }
 		}
		
		Map<Integer, Integer> map1 = new HashMap<>();
		map1.put(1, supo1score);
		Map<Integer, Integer> map2 = new HashMap<>();
		map2.put(2, supo2score);
		Map<Integer, Integer> map3 = new HashMap<>();
		map3.put(3, supo3score);
		
		System.out.println(map1.toString());
		System.out.println(map2.toString());
		System.out.println(map3.toString());
		
		List<Map<Integer, Integer>> test = new ArrayList<>();
		test.add(map1);
		test.add(map2);
		test.add(map3);
		
		System.out.println(test.toString());

		
		
		//		int[] answer = {};
//        System.out.println(answer);
        
	}

}
