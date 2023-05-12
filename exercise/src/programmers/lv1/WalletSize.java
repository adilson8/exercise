package programmers.lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WalletSize {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/86491
	public int solution(int[][] sizes) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int i =0; i < sizes.length; i++){
			int temp = 0; 
			
			if (sizes[i][0] < sizes[i][1]){
				temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}			
			
			list1.add(sizes[i][0]);
			list2.add(sizes[i][1]);
		}
		
		list1.sort(Comparator.reverseOrder());
		list2.sort(Comparator.reverseOrder());
		
		int answer = list1.get(0) * list2.get(0);
        return answer;
    }

}
