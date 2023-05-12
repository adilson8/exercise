package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class Substring {

	// https://school.programmers.co.kr/learn/courses/30/lessons/147355
	public int solution(String t, String p) {
        List<String> list = new ArrayList<>();
		for(int i = 0; i < t.length() - p.length() + 1; i++){
			String a = t.substring(i, p.length()+i);
			list.add(a);
		}
		
		int answer = 0;
		for (String e : list){			
			if (Long.parseLong(e) <= Long.parseLong(p)){
				answer++;
			}
		}
        return answer;
    }
}
