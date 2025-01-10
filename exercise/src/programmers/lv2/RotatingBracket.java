package programmers.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RotatingBracket {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/76502
	public static int rotatingBracket (String s){		
		int answer = 0;
		
		for (int i = 0; i < s.length(); i++){
			s = rotateS(s); 
			boolean isValid = checkVaildBracket(s);
			
			if (isValid){
				answer++;
			}
		}
		
		return answer;
	}

	private static String rotateS(String s) {		
		String rotatedS = "";
		char sFirstChar = s.charAt(0);
		char[] sCharArr = s.toCharArray();
		for (int i = 1; i < sCharArr.length; i++) {
			rotatedS += String.valueOf(sCharArr[i]);
		}
		rotatedS += String.valueOf(sFirstChar);
		
		return rotatedS;
	}
	
	private static boolean checkVaildBracket(String s) {
		boolean isValid = true;
		
		// ], }, ) 로 시작하거나 반대로 끝나면 무조건 X		
		if (s.startsWith("]") || s.startsWith("}")  || s.startsWith(")") ) {
			isValid = false;
			return isValid;
		} else if (s.endsWith("[") || s.endsWith("{")  || s.endsWith("(") ) {
			isValid = false;
			return isValid;
		}
		
		List<String> sList = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			sList.add(String.valueOf(s.charAt(i)));
		}
		
		Stack<String> sStack = new Stack<>();
		for(int i = 0; i < sList.size(); i ++) {
			if (sStack.size()==0) {
				sStack.add(sList.get(i));
			} else {
				if (sStack.peek().equals("[")) {
					if (sList.get(i).equals("]")) {
						sStack.pop();
					} else {
						sStack.add(sList.get(i));						
					}
				} else if (sStack.peek().equals("{")) {
					if (sList.get(i).equals("}")) {
						sStack.pop();
					} else {
						sStack.add(sList.get(i));						
					}
				} else if (sStack.peek().equals("(")) {
					if (sList.get(i).equals(")")) {
						sStack.pop();
					} else {
						sStack.add(sList.get(i));						
					}
				} else {
					sStack.add(sList.get(i));
				}
			}
		}
		
		if (sStack.size()==0) {
			isValid = true;
		} else {
			isValid = false;
		}
				
		return isValid;
	}

}
