package programmers.lv2;

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
			String rotatedS = rotateS(i);
			boolean isValid = checkVaildBracket(rotatedS);
			
			if (isValid){
				answer++;
			}
		}
		
		System.out.println(answer);
	}

	private static String rotateS(int i) {
		String rotatedS = "";
		
		// 여기서 i만큼 돌리는 코드 작성
		
		return rotatedS;
	}
	
	private static boolean checkVaildBracket(String rotatedS) {
		boolean isValid = false;
		
		// 여기서 유효한 괄호인지 체크하는 코드 작성
		
		return isValid;
	}

}
