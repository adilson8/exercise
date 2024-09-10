package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class Keypads {

	// https://school.programmers.co.kr/learn/courses/30/lessons/67256
	public static void main(int[] numbers, String hand) {
		
		Map<Integer, int[]> keypadAndaddress = new HashMap<>();
		for (int i = -2; i < 10; i++){
			int[] address = new int[2];

			if (i == -2) { 			// *은 -2로 대체
				address[0] = 3;
				address[1] = 0;
			} else if (i == 0) {
				address[0] = 3;
				address[1] = 1;
			} else if (i == -1) {	// #은 -1로 대체
				address[0] = 3;
				address[1] = 2;
			} else {
				address[0] = (i - 1) / 3;
				address[1] = (i - 1) % 3;
			}

			keypadAndaddress.put(i, address);
		}
		
		int leftPosition = -2; 
		int rightPosition = -1;
		
		String tmp = "";
		String answer = "";
		
		for (int num : numbers) {
			if (num == 1 || num == 4 || num == 7) {
				leftPosition = num;
				answer += "L";
			} else if (num == 3 || num == 6 || num == 9) {
				rightPosition = num;
				answer += "R";
			} else {
				// 여기서 계산하는 메서드 태우기
				tmp = findPressFinger(hand, num, leftPosition, rightPosition, keypadAndaddress);
				
				if (tmp.equals("L")){
					leftPosition = num;
					answer += "L";
				} else if (tmp.equals("R")) {
					rightPosition = num;
					answer += "R";
				}
			}
		}
		
		System.out.println(answer);
	}
	
	public static String findPressFinger (String hand, int num, int leftPosition, int rightPosition, Map<Integer, int[]> keypadAndaddress){
		
		int leftDistance = 0;
		int rightDistance = 0;
		
		int[] numAddress = keypadAndaddress.get(num);
		int[] leftAddress = keypadAndaddress.get(leftPosition);
		int[] rightAddress = keypadAndaddress.get(rightPosition);
		
		leftDistance = Math.abs(numAddress[0] - leftAddress[0]) + Math.abs(numAddress[1] - leftAddress[1]); 
		rightDistance = Math.abs(numAddress[0] - rightAddress[0]) + Math.abs(numAddress[1] - rightAddress[1]);
		
		if(leftDistance < rightDistance){
			return "L";
		} else if (leftDistance > rightDistance) {
			return "R";
		} else {
			if (hand.equals("left")){
				return "L";
			} else {
				return "R";				
			}
		}
	}

}
