package programmers.lv2;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42577
	public static boolean phoneNumberList (String[] phone_book){
		boolean answer = true;
		
		Map<String, String> phoneHash = new HashMap<>();
		for (String phoneNum : phone_book) {
			phoneHash.put(phoneNum, phoneNum);
		}
		
		Loop1:
		for (String phoneNum : phone_book) {
			for (int i = 1; i < phoneNum.length(); i++) {
				if (phoneHash.containsKey(phoneNum.substring(0, i))) {
					answer = false;
					break Loop1;
				}
			}
		}
		
		return answer;
	}
	
}
