package programmers.lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42577
	public static void main (String[] args){
		
		// answer = false
//		String[] phone_book = {"119", "97674223", "1195524421"};
		
		// answer = true
		String[] phone_book = {"123","456","789"};
		
		// answer = false
//		String[] phone_book = {"12","123","1235","567","88"};
		
		boolean answer = true;
		
		Arrays.sort(phone_book);
		Map<String, String> phoneHash = new HashMap<>();
//		for 배열돌기
//		if phoneHash.get(phoneNum)==null 이면 넣고(value에는 가라값 넣어도되나), 아니면 false
		
		
//		Arrays.sort(phone_book);
//		Loop1 :
//		for(int i = 0; i < phone_book.length; i++){
//			String compare = phone_book[i];
//			Loop2 :
//			for (int j = i+1; j < phone_book.length; j++) {
//				String compare2 = phone_book[j];
//				if (compare2.length() >= compare.length() && compare2.startsWith(compare)) {
//					answer = false;
//					break Loop1;
//				}
//			}
//		}
		
		System.out.println(answer);		
	}
	
}
