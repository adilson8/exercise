package programmers.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PlayingCards {

	// https://school.programmers.co.kr/learn/courses/30/lessons/159994
	public String solution(String[] cards1, String[] cards2, String[] goal) {		
		String answer = "Yes";
		List<String> goalList = new ArrayList<>();
		
		Stack<String> reversedCards1Stack = new Stack<>();
		Stack<String> reversedCards2Stack = new Stack<>();
		
		for (int i = (cards1.length-1); i >= 0;  i--) {
			reversedCards1Stack.add(cards1[i]);
		}
		
		for (int i = (cards2.length-1); i >= 0;  i--) {
			reversedCards2Stack.add(cards2[i]);
		}
		
		for (int i = 0; i < goal.length; i++){			
			if (reversedCards1Stack.size() !=0) {
				if (goal[i].equals(reversedCards1Stack.get(reversedCards1Stack.size()-1))){
					goalList.add(reversedCards1Stack.get(reversedCards1Stack.size()-1));
					reversedCards1Stack.pop();
				}				
			}
			
			if (reversedCards2Stack.size() !=0){
				if (goal[i].equals(reversedCards2Stack.get(reversedCards2Stack.size()-1))) {
					goalList.add(reversedCards2Stack.get(reversedCards2Stack.size()-1));
					reversedCards2Stack.pop();
				} 
			}				
		}
		
		if (reversedCards1Stack.size() ==0 && reversedCards2Stack.size() ==0){
			answer = "Yes";
		} else {
			if (goal.length != goalList.size()){
				answer = "No";
			} else {
				answer = "Yes";				
			}
		}
        
        return answer;
    }

}
