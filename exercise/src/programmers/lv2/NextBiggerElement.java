package programmers.lv2;

public class NextBiggerElement {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/154539
	public static void main (String[] args){
		
		// answer = {3, 5, 5, -1}
		int[] numbers = {2, 3, 3, 5};
		
		// answer = {-1, 5, 6, 6, -1, -1}
//		int[] numbers = {9, 1, 5, 3, 6, 2};
		
		int[] answer = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++){
			int nowNum = numbers[i];
			
			for (int j = i+1; j < numbers.length; j++){
				int nextNum = numbers[j];
				if (nowNum < nextNum){
					answer[i] = nextNum;
					break;
				}
			}
			
			if (answer[i] == 0){
				answer[i] = -1;
			}
		}
		
		System.out.println();
	}

}
