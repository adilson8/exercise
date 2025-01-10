package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class RotatingBracket {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/76502
	public static void main (String[] args){
		// answer = 2;
		String s = "}]()[{";
		
		// answer = 0;
//		String s = "[)(]";
		
		// answer = 0;
//		String s = "}}}";
		
		// answer = 3;
//		String s = "[](){}";
		
		// answer = 2;
//		String s = "()(()(()())())";
		
		
		int answer = 0;
		for (int i = 0; i < s.length(); i++){
			s = rotateS(s); 
			boolean isValid = checkVaildBracket(s);
			
			if (isValid){
				answer++;
			}
		}
		
		System.out.println(answer);
	}

	private static String rotateS(String s) {		
//		String rotatedS = s.split("\\" + String.valueOf(s.charAt(0)))[1] + String.valueOf(s.charAt(0));
		
		String rotatedS = "";
		char sFirstChar = s.charAt(0);
		char[] sCharArr = s.toCharArray();
		for (int i = 1; i < sCharArr.length; i++) {
			rotatedS += String.valueOf(sCharArr[i]);
		}
		rotatedS += String.valueOf(sFirstChar);
		
		System.out.println( "변경전 s : " + s);		
		System.out.println( "변경후 s : " + rotatedS);
		
		return rotatedS;
	}
	
	private static boolean checkVaildBracket(String s) {
		boolean isValid = true;
		
		// ], }, ) 로 시작하거나 반대로 끝나면 무조건 X		
		if (s.startsWith("]") || s.startsWith("}")  || s.startsWith(")") ) {
			System.out.println("], }, ) 로 시작하니까 X 입니당.");
			System.out.println("/////////////////////////////////////");
			isValid = false;
			return isValid;
		} else if (s.endsWith("[") || s.endsWith("{")  || s.endsWith("(") ) {
			System.out.println("[, {, ( 로 끝나니까 X 입니당.");
			System.out.println("/////////////////////////////////////");
			isValid = false;
			return isValid;
		}
		
		List<String> sList = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			sList.add(String.valueOf(s.charAt(i)));
		}
		
		int i = 0;
		Loop1 :
		while (sList.size()!=0) {
			if (sList.get(i).equals("[")) {				
				sList.remove(i);
				Loop2 :
				for (int j = 0; j < sList.size(); j++) {					
					if (sList.get(j).equals("]")) {
						sList.remove(j);
						break Loop2;
					};
				}
			} else if (sList.get(i).equals("{")) {
				sList.remove(i);
				Loop2 :
				for (int j = 0; j < sList.size(); j++) {
					if (sList.get(j).equals("}")) {
						sList.remove(j);
						break Loop2;
					};
				}
			} else if (sList.get(i).equals("(")) {
				sList.remove(i);
				Loop2 :
				for (int j =0; j < sList.size(); j++) {
					if (sList.get(j).equals(")")) {
						sList.remove(j);
						break Loop2;
					};
				}				
			} else if (sList.get(i).equals("]") || sList.get(i).equals("}") || sList.get(i).equals(")")) {
				isValid = false;
				break Loop1;
			}
			
			for(String sl : sList) {
				System.out.print(sl);
			}
			System.out.println();
				
		}		
		
		
		System.out.println("유효한 괄호 여부 : " + isValid);
		System.out.println("/////////////////////////////////////");
				
		return isValid;
	}

}
