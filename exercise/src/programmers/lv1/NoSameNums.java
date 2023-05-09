package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class NoSameNums {
	
	public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
 
		int n = 1;
		for(int i = 1; i < arr.length; i++){
			if (list.get(i-n) != arr[i]) {
				// 같지 않으면 추가
				list.add(arr[i]);
			} else {		
				// 같으면 pass
				n++;
			}
		}
		
		// list 배열로 변환
		int[] answer = new int[list.size()];
		int i = 0;
		for(int element : list) {
			answer[i] = element;
			i++;
		}

        return answer;
    }

}
