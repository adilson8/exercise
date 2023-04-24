package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPAndY {
	
	boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
		
		int pNum = 0;
		int yNum = 0;		
		
		// 크기가 고정된 list 생성 (Array.asList(배열))
		List<String> list = Arrays.asList(s.split(""));

		// cf) 크기가 고정되지 않은 list 생성 (new ArrayList<>(리스트))
//		List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
		
		for(String a : list){
			if (a.equals("p")) {
				pNum++;
			} else if (a.equals("y")) {
				yNum++;
			}
		}
				
		if (pNum == yNum){
			answer = true;
		} else {
			answer = false;
		}

        return answer;
    }
	
}
