package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakingMinValue {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12941
	public static int main (int[] A, int[] B){
		
		int answer = 0;
		List<Integer> listA = new ArrayList<>();
		List<Integer> listB = new ArrayList<>();
		
		for (int i =0; i < A.length; i++){
			listA.add(A[i]);
			listB.add(B[i]);
		}
		
		Collections.sort(listA);
		Collections.sort(listB, Collections.reverseOrder());
		
		for(int i =0; i < listA.size(); i++){
			answer += listA.get(i) * listB.get(i);
		}
		
		return answer;
	}

}
