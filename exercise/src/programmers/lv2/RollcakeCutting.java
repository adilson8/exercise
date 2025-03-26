package programmers.lv2;

import java.util.HashSet;
import java.util.Set;

public class RollcakeCutting {
	
	public static void main(String[] args){
		
		// answer = 2
//		int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
		
		// answer = 0
		int[] topping = {1, 2, 3, 1, 4};
		
		int answer = 0;
		
		for(int i = 1; i < topping.length; i++){
			
			Set<Integer> sliceA = new HashSet<>();
			Set<Integer> sliceB = new HashSet<>();			

			// sliceA
			for(int j = 0; j < i; j++){
				sliceA.add(topping[j]);
			}
			
			// sliceB
			for(int j = i; j < topping.length; j++){
				sliceB.add(topping[j]);				
			}
			
			if (sliceA.size() == sliceB.size()){
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
