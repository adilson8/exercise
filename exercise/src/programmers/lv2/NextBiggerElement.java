package programmers.lv2;

import java.util.Stack;

public class NextBiggerElement {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/154539
	public static int[] main (int[] numbers){
		
		int[] answer = new int[numbers.length];
		
		Stack<Integer> stack = new Stack<>();
		for (int i = numbers.length-1; i >= 0; i--){
			while (!stack.isEmpty()){
				if (numbers[i] < stack.peek()){
					answer[i] = stack.peek();
					break;
				} else {
					stack.pop();
				}
			}
			
			if (answer[i] == 0){
				answer[i] = -1;
			}
			
			stack.add(numbers[i]);
		}

		return answer;
	}

}
