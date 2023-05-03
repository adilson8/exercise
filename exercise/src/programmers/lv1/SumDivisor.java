package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class SumDivisor {

	public int solution(int left, int right) {
        int cycle = right - left;
        int answer = 0;

        for (int i = 0; i <= cycle; i++){
            List<Integer> leftDivisors = new ArrayList<>();
            for (int idx = 1; idx <= left; idx++){
                if(left % idx == 0){
                    leftDivisors.add(idx);
                }               
            }

            if(leftDivisors.size() % 2 == 0){
                answer += left;
            } else {
                answer -= left;
            }

            left++;
        }

        return answer;
    }
}
