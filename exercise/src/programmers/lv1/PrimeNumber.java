package programmers.lv1;

import java.util.Arrays;

public class PrimeNumber {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12977
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
//		for (int i = 0; i < nums.length-2; i++) {
//			for (int j = i+1; j < nums.length-1; j++) {
//				for (int k = i+2; k < nums.length; k++) {
//					int[] test = new int[3];
//					test[0] = nums[i];
//					test[1] = nums[j];
//					test[2] = nums[k];
//					System.out.println(Arrays.toString(test));
//				}
//			}
//		}

//		int test = 3;
//		boolean isPrimeNum = true;
//		for (int i = 2; i < test; i++) {
//			if (test % i == 0) {
//				System.out.println("소수가 아니야!!!!");
//				isPrimeNum = false;
//				break;
//			}
//		}
//		System.out.println( test+ "은(는) 소수인가요? : " + isPrimeNum);
		
		PrimeNumber.isPrimeNum(8);
		
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
