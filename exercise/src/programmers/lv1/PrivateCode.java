package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class PrivateCode {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/155652
	public String solution(String s, String skip, int index) {
		String answer = "";
		
		char[] sArray = s.toCharArray();
		char[] skipArray = skip.toCharArray();
		List<Character> skipList = new ArrayList<>();
		for (int i = 0; i < skip.length(); i++){
			skipList.add(skipArray[i]);
		}
		
		for (int i = 0; i < index; i++){
			for (int j = 0; j < sArray.length; j++){
				// 일단 하나 밀기
				sArray[j] = (char) (
						((int)sArray[j]+1 > 122) ?
								(int)sArray[j]+1-26 : (int)sArray[j]+1
						);
				
				// skip에 없을 때까지 하나 밀기
				while(skipList.contains(sArray[j])){
					skipList.set(skipList.indexOf(sArray[j]), ' ');
					
					sArray[j] = (char) (
							((int)sArray[j]+1 > 122) ?
									(int)sArray[j]+1-26 : (int)sArray[j]+1
							);
				}
				
				// skip 초기화
				for (int k = 0; k < skip.length(); k++){
					skipList.add(skipArray[k]);
				}
			}
		}
		
		// sArray 배열을 answer로 변환
		for (int i = 0; i < sArray.length; i++) {
			answer+= Character.toString(sArray[i]);
		}
        
        return answer;
    }

}
