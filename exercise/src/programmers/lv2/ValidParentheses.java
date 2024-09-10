package programmers.lv2;

import java.util.Stack;

public class ValidParentheses {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12909
	public static void main (String[] args){
		
		// answer = false;
//		String s = ")()(";		
		
		String s = "())";		
		
		
		boolean answer;
		String[] arrS = s.split("");
		Stack<String> stackS = new Stack<>();
		String tmp = arrS[0];
		
		if (s.length()%2 !=0 || tmp.equals(")")){
			answer = false;
		} else {
			for (String as : arrS){
				if(as.equals(tmp)){
					tmp = as;
					stackS.push(as);
				} else {
					stackS.pop();
				}
			}
			
			if(stackS.size() == 0){
				answer = true;
			} else {
				answer = false;
			}
		}
		
		System.out.println(answer);
	}

}
