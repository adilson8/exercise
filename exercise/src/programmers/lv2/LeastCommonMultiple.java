package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeastCommonMultiple {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12953
	public static int leastCommonMultiple (int[] arr) {
		
		int answer = 0;

		List<Integer> list = new ArrayList<>(); 
		for (int e : arr){
			list.add(e);
		}
		Collections.sort(list);
		
		boolean tmp = true;
		int i = 0;
		
		while (tmp){
			i++;
			int multiple = list.get(list.size()-1) * i;
		
			for (int j = 0; j < list.size(); j++){
				if (multiple % list.get(j) == 0){
					tmp = false;
				} else {
					tmp = true;
					break;
				}
			}
		}
		
		answer = list.get(list.size()-1) * i;
		return answer;
	}

}
