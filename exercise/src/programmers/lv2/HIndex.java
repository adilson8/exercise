package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HIndex {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42747
	public static void main (String[] args) {
		
		// answer = 3
//		int[] citations = {3, 0, 6, 1, 5};
		
		// answer = 4
		int[] citations = {5, 6, 7, 8};
				
		List<Integer> citationsList = new ArrayList<>();
		for (int c :citations) {
			citationsList.add(c);
		}
		
		Collections.sort(citationsList, Collections.reverseOrder());
		
		int answer = 0;
		for (int i = 0; i < citationsList.size(); i++) {
			if (i >= citationsList.get(i)) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		System.out.println(citationsList);
		
	}

}
