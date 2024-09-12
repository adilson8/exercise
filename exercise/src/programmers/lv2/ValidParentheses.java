package programmers.lv2;

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12909
	public static boolean main (String s){
		
		boolean answer = false;
		String[] arrS = s.split("");
		Stack<String> stackS = new Stack<>();
		
		if(arrS[0].equals(")") || s.length()%2 !=0){
			answer = false;
			return answer;
		} else {
			for (String as : arrS){
				if (as.equals("(")){
					stackS.push(as);
				} else {
					try {
						stackS.pop();						
					} catch (EmptyStackException ese){
						answer = false;
						return answer;
					}
				}
			}
			
			if(stackS.isEmpty()){
				answer = true;
			} else {
				answer = false;
			}
		}
		
        return answer;
	}

}
