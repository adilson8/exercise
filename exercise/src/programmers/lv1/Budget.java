package programmers.lv1;

import java.util.Arrays;

public class Budget {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12982
	
	public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int answer = 0;
        
        for (int e : d) {
            sum += e;

            if (sum > budget) {
                break;
            }

            answer++;
        }

        return answer;
    }

}
