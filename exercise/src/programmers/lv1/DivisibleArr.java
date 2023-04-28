package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleArr {
	
	public int[] solution(int[] arr, int divisor) {        
        List<Integer> list = new ArrayList<>();             
        for (int e : arr) if (e % divisor == 0) list.add(e);        
        if (list.size() == 0) list.add(-1);

        int[] answer = new int [list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);

        Arrays.sort(answer);
        return answer;
    }

}
