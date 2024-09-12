package programmers.lv2;

public class JadenCase {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12951
	public static void main (String[] args){

		// answer = "3people Unfollowed Me"
		String s = "3people unFollowed me";
		
		// answer = "For The Last Week"
//		String s = "for the last week";
		
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
		
		System.out.println(answer);

	}

}
