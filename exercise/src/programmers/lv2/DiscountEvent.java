package programmers.lv2;

import java.util.LinkedHashMap;
import java.util.Map;

public class DiscountEvent {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/131127
	public static void discountEvent (String[] want, int[] number, String[] discount){
		
		int answer = 0;		
		
		Map<String, Integer> wantNumber = new LinkedHashMap<>();
		for (int i = 0; i < discount.length-10 + 1; i++) {
			// wantNumber 초기화
			for (int j = 0; j < want.length; j++){
				wantNumber.put(want[j], number[j]);
			}
			
			for (int j = 0; j < 10; j++ ){
				try {
					wantNumber.replace(discount[i+j], wantNumber.get(discount[i+j])-1);
				} catch (NullPointerException npe) {
					break;
				}
			}
			
			boolean flag = true;
			
			// 다 0이면 성공
			for (Integer value : wantNumber.values()) {
	            if (value == null || value != 0) {
	            	flag = false;
	            }
	        }
			
			if (flag){
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}

}
