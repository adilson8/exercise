package programmers.lv1;

import java.util.Arrays;

public class DNF {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42576
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for (int i = 0; i < participant.length-1; i++){
			if (!participant[i].equals(completion[i])){
				answer = participant[i];
				break;
			}
		}
		
		if (answer.equals("")){
			answer = participant[participant.length-1];
		}
        
        return answer;
    }

}
