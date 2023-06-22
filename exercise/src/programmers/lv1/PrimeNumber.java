package programmers.lv1;

import java.util.Arrays;

public class PrimeNumber {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12977
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = i+2; k < nums.length; k++) {
					int[] test = new int[3];
					test[0] = nums[i];
					test[1] = nums[j];
					test[2] = nums[k];
					System.out.println(Arrays.toString(test));
				}
			}
		}
	}

}
