package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMin {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12939
	public static void main (String s){
		String answer = "";
		
		String[] sArr = s.split(" ");
		
		List<Integer> sList = new ArrayList<>();
		for (String sa : sArr){
			sList.add(Integer.valueOf(sa));
		}
		
		Collections.sort(sList);
		
		int min = Integer.valueOf(sList.get(0));
		int max = Integer.valueOf(sList.get(sList.size()-1));
		
		answer += min;
		answer += " ";
		answer += max;
		
		System.out.println(answer);
	}

}
