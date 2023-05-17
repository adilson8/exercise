package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawTwoNums {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/68644
	public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++){
			for (int j = i+1; j < numbers.length; j++){
				try {
					int plus = numbers[i] + numbers[j];
					list.add(plus);
				} catch (ArrayIndexOutOfBoundsException e) {
					
				}
			}
		}
		Collections.sort(list);		
		
		List<Integer> newList = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			
			if (i == 0) {
				newList.add(list.get(i));
			} else {
				int element = list.get(i-1);				
				
				if (element != list.get(i)){
					newList.add(list.get(i));
				}				
			}
			
		}
		
		
		int[] answer = new int[newList.size()];
		for (int i = 0; i < newList.size(); i++){
			answer[i] = newList.get(i);
		}
        
        return answer;
    }

}
