package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class RemoveLowNum {
	
	public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        } else {
            int minNum = arr[0];
            for (int i = 0; i < arr.length-1; i++){
                if (minNum > arr [i+1]){
                    minNum = arr[i+1];
                }
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i] != minNum) {
                    list.add(arr[i]);
                }
            }

            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }       

            return answer;
        }
    }

}
