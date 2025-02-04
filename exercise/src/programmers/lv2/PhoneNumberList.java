package programmers.lv2;

import java.util.Arrays;

public class PhoneNumberList {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42577
	public static void main (String[] args){
		
		// answer = false
//		String[] phone_book = {"119", "97674223", "1195524421"};
		
		// answer = true
		String[] phone_book = {"123","456","789"};
		
		// answer = false
//		String[] phone_book = {"12","123","1235","567","88"};
		
		Arrays.sort(phone_book);
		
		boolean answer = true;
		Loop1 :
		for(int i = 0; i < phone_book.length; i++){
			String compare = phone_book[i];
			Loop2 :
			for (int j = i+1; j < phone_book.length; j++) {
				String compare2 = phone_book[j];
				if (compare2.length() >= compare.length() && compare2.startsWith(compare)) {
					answer = false;
					break Loop1;
				}
			}
		}
		
		System.out.println(answer);		
	}
	
}
