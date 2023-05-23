package programmers.lv1;

public class CloestSameChar {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/142086
	public int[] solution(String s) {
        char[] arrS = s.toCharArray();
		
		int[] answer = new int[arrS.length];
		for(int i = 0; i < arrS.length; i++){
			if (i == 0){
				answer[i] = -1;
			} else {
				for (int j = 0; j < i; j++){
					if (arrS[i] == arrS[j]){
						answer[i] = (j-i)*-1;
					} 
				}
				
				if(answer[i] == 0){
					answer[i] = -1;
				}
			}
		}
        return answer;
    }
	
}
