package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HIndex {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42747
	public static int main (int[] citations) {
		List<Integer> citationsList = new ArrayList<>();
		for (int c :citations) {
			citationsList.add(c);
		}		
		Collections.sort(citationsList, Collections.reverseOrder());
		
		int answer = 0;
		for (int i = 0; i < citationsList.size(); i++) {
			if (citationsList.get(i) >= i+1) {
				answer = i+1;
            } else {
                break;
            }			
		}
		
		return answer;
	}

}
