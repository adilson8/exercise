package programmers.lv1;

import java.util.Arrays;

public class SortDesc {
	
	public long solution(long n) {
        long answer = 0;
				
        String[] strArrN = Long.toString(n).split("");
		Arrays.sort(strArrN);
		
		StringBuffer sb = new StringBuffer();
		for (String element : strArrN){
			sb.append(element);
		}
			
		answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}
