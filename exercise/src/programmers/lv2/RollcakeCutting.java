package programmers.lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollcakeCutting {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/132265?language=java
	public static int main(int[] topping){
		int answer = 0;
		
		Map<Integer, Integer> rightSlice = new HashMap<>();
		for(int t : topping){
			rightSlice.put(t, rightSlice.getOrDefault(t, 0)+1);
		}
		
		Set<Integer> leftSlice = new HashSet<>();
		for(int t : topping){
			leftSlice.add(t);

			// 여기서 제거
			rightSlice.put(t, rightSlice.get(t)-1);
			if (rightSlice.get(t) == 0){
				rightSlice.remove(t);
			}
			
			// 여기서 비교
			if (leftSlice.size() == rightSlice.size()){
				answer++;
			}
		}
		
		return answer;
	}

}
