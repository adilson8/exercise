package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class DartGame {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/17682
	public int solution(String dartResult) {
        int answer = 0;
		List<String> dartResultList = new ArrayList<>();
		dartResultList = dartResultSplitor(dartResult);
		answer = resultCalculator(dartResultList);
        return answer;
    }
    
    public static List<String> dartResultSplitor(String dartResult) {
		List<String> dartResultList = new ArrayList<>();
		
		if (dartResult.contains("*") || dartResult.contains("#")){
			dartResult = dartResult.replaceAll("\\*", "* ");			
			dartResult = dartResult.replaceAll("\\#", "# ");
			dartResult = dartResult.replaceAll("S", "S ");
			dartResult = dartResult.replaceAll("D", "D ");
			dartResult = dartResult.replaceAll("T", "T ");
		} else {
			dartResult = dartResult.replaceAll("S", "S ");
			dartResult = dartResult.replaceAll("D", "D ");
			dartResult = dartResult.replaceAll("T", "T ");
		}
			
		String[] dartResultArray = dartResult.split(" ");
		
		for (int i = 0; i < dartResultArray.length; i++){
			if (dartResultArray[i].equals("#") || dartResultArray[i].equals("*")){
				dartResultArray[i-1] += dartResultArray[i];
				dartResultArray[i] = "";
			}
		}
		
		for (int i = 0; i < dartResultArray.length; i++){
			if (!dartResultArray[i].equals("")){
				dartResultList.add(dartResultArray[i]);
			}
		}
		
		return dartResultList;		
	}
	
	public static int resultCalculator(List<String> dartResultList){
		int[] scores = new int[3];

		for (int i =0; i < dartResultList.size(); i ++){
			dartResultList.set(i, dartResultList.get(i).replaceAll("S", " S "));
			dartResultList.set(i, dartResultList.get(i).replaceAll("D", " D "));
			dartResultList.set(i, dartResultList.get(i).replaceAll("T", " T "));
			
			String[] result = dartResultList.get(i).split(" ");
			
			// 점수셋팅
			int score = Integer.valueOf(result[0]);
			
			// 제곱처리
			if (result[1].equals("D")){
				score = (int) Math.pow(score, 2);			
			} else if (result[1].equals("T")){
				score = (int) Math.pow(score, 3);			
			}
			
			if (result.length == 3){
				if (result[2].equals("#")){
					score = score * -1;
				} else if (result[2].equals("*")){
					score = score * 2;
					if (i > 0) {
						scores[i - 1] = scores[i - 1] * 2;
					}
				}			
			}
			
			scores[i] = score;
		}
		
		return scores[0] + scores[1] + scores[2];
	}
}
