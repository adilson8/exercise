package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DNF {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42576
	public String solution(String[] participant, String[] completion) {
        String answer = "";
		List<String> participantList = Arrays.asList(participant);
		List<String> completiontList = Arrays.asList(completion);
		
		for (String p : participant){
			for (String c : completion){
				if (p.equals(c)) {
					participantList.set(participantList.indexOf(c), " ");
					completiontList.set(completiontList.indexOf(c), " ");
				}
			}
		}
		
		Collections.sort(participantList, Collections.reverseOrder());
		
		answer = participantList.get(0);
        return answer;
    }

}
