package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class GcdAndLcm {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12940
	
	public int[] solution(int n, int m) {
		List<Integer> nDivisors = new ArrayList<>();
		for (int i = 1; i <= n; i++){
			if(n % i == 0){
				nDivisors.add(i);
			}
		}
		
		List<Integer> mDivisors = new ArrayList<>();
		for (int i = 1; i <= m; i++){
			if(m % i == 0){
				mDivisors.add(i);
			}
		}
		
		List<Integer> commonDivisors = new ArrayList<>();
		for(int nDivisor : nDivisors) {			
			for(int i = 1; i <= mDivisors.size(); i++){
				if(nDivisor == mDivisors.get(i-1)){
					commonDivisors.add(nDivisor);
				}
			}
		}
		
		int gcd = commonDivisors.get(commonDivisors.size()-1);
		int lcm = n * m / gcd; 
		
		int[] answer = {gcd, lcm};        
        return answer;
    }

}
