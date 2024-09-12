package programmers.lv2;

public class JadenCase {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12951
	public static String main (String s){

		String answer = ""; 
		String[] splitS = s.split(" ");
		
		for(int i = 0; i < splitS.length; i++){
			String[] splitSplitS= splitS[i].split("");
			
			for (int j = 0; j < splitSplitS.length; j++) {
				if (j==0) {
					answer += splitSplitS[j].toUpperCase();
				} else {
					answer += splitSplitS[j].toLowerCase();
				}
			};
			
			if (i != splitS.length-1){
				answer += " ";				
			}
		}
		
		if(s.length() != answer.length()){
			for (int i =0; i <= s.length() - answer.length(); i++){
				answer += " ";				
			}
		}
		
		return answer;
	}

}
