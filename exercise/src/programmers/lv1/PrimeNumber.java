package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12977
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		
		List<Integer> sumList = new ArrayList<>();
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					sumList.add(sum);
				}
			}
		}
		
		int answer = 0;
		for (int n : sumList) {
			if (PrimeNumber.isPrimeNum(n)) {
				answer++;
			}
		}

		System.out.println(answer);
	}
	
	public static boolean isPrimeNum (int n) {
		boolean isPrimeNum = true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrimeNum = false;
				break;
			}
		}
		
		return isPrimeNum;
	}

}
