package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SloppyKeyboard {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/160586
	public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
		List<Integer> idxList = new ArrayList<>();
		int lowestIdx = 0;
		int count = 0;
		boolean isPossible = true;
		
		for (int i = 0; i < targets.length; i++) {
			char[] targetCharArr = targets[i].toCharArray();
			
			for (int j = 0; j < targetCharArr.length; j++){
				
				for (int k = 0; k < keymap.length; k++){
					int idx = keymap[k].indexOf(targetCharArr[j]);
					if (idx != -1) {
						idxList.add(idx);			
					}
				}
				
				if(idxList.size() == 0){
					isPossible = false;
					break;
				} else {
					Collections.sort(idxList);
					lowestIdx = idxList.get(0);
				}
				
				count += lowestIdx +1;
				idxList.clear();
			}
			
			if (!isPossible) {
				answer[i] = -1;
				isPossible = true;
			} else {
				answer[i] = count;
			}
			
			count = 0;
		}
        
        return answer;
    }

}
