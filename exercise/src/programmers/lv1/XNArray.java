package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class XNArray {
	
	public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++){
			list.add((long)x * i);
		}
		
		
		long[] answer = new long[list.size()];
		
		int idx = 0;
		for (long num : list) {
			answer[idx] = num;
			idx++;
		}
		
		return answer;
    }

}
