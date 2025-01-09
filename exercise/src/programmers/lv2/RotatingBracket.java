package programmers.lv2;

import java.util.Collection;

public class RotatingBracket {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/76502
	public static void main (String[] args){
		// answer = 2;
//		String s = "}]()[{";
		
		// answer = 0;
//		String s = "[)(]";
		
		// answer = 0;
//		String s = "}}}";
		
		// answer = 3;
		String s = "[](){}";
		
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
		String rotatedS = s.split("\\" + String.valueOf(s.charAt(0)))[1] + String.valueOf(s.charAt(0));
		
		System.out.println( "변경전 s : " + s);		
		System.out.println( "변경후 s : " + rotatedS);
		
		return rotatedS;
	}
	
	private static boolean checkVaildBracket(String s) {
		boolean isValid = true;
		
		// ], }, ) 로 시작하면 무조건 X		
		if (s.startsWith("]") || s.startsWith("}")  || s.startsWith(")") ) {
			System.out.println("], }, ) 로 시작하니까 X 입니당.");
			System.out.println("/////////////////////////////////////");
			isValid = false;
			return isValid;
		}
		
		// 여기서 유효한 괄호인지 체크하는 코드 작성		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length() - i+1; j++) {
				
			}
		}		
		
		System.out.println("/////////////////////////////////////");
				
		return isValid;
	}

}
