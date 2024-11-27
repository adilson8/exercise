package programmers.lv2;

import java.util.Stack;

public class RemovePairs {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12973
	public static int main (String s){
		
		Stack<String> stack = new Stack<>();
		char[] sArray = s.toCharArray();
		
		for (char c : sArray){
			if(stack.size() != 0){
				if (stack.lastElement()
						.equals(String.valueOf(c))){
					stack.pop();
				} else {
					stack.push(String.valueOf(c));					
				}
			} else {
				stack.push(String.valueOf(c));
			}
		}

		int i;
		
		if (stack.size() == 0){
			i = 1;
		} else {
			i = 0;
		}
		
		return i;
	}

}
