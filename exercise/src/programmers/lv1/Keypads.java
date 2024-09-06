package programmers.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Keypads {

	// https://school.programmers.co.kr/learn/courses/30/lessons/67256
	public static void main(String[] args) {
		
		// 무조건 왼쪽    : 1, 4, 7
		// 무조건 오른쪽 : 3, 6, 9
		// 가까운 손       : 2, 5, 8, 0
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		
		int[][] keypad = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9},
			    {-1, 0, -2} // '*'은 -1, '#'은 -2로 대체
		};
		
		Map<Integer, int[]> keypadAndaddress = new HashMap<>();
		int[] address = new int[2]; 
		for (int i = -2; i < 10; i++){
			
			// -1, 0, -2 처리 (얘네도 포문으로 만들면 될거 같은데)
			if (i == -1) {
				address[0] = 2;
				address[1] = 0;
			} else if (i == 0) {
				address[0] = 2;
				address[1] = 1;
			} else if (i == -2) {
				address[0] = 2;
				address[1] = 2;
			} else {
				// 여기에 이제 1부터 9까지 주소값 저장하게 포문을 만들던지 하고...
			}
		}
		
		String hand = "right";
		
		int leftPosition = -1; 
		int rightPosition = -2;
		
		String tmp = "";
		
		List<String> pressedList = new ArrayList<>();
		
		for (int num : numbers) {
			if (num == 1 || num == 4 || num == 7) {
				leftPosition = num;
				pressedList.add("L");
			} else if (num == 3 || num == 6 || num == 9) {
				rightPosition = num;
				pressedList.add("R");
			} else {
				// 여기서 인제 계산하는 메서드 태우기
				tmp = findPressFinger(hand, num, leftPosition, rightPosition);
				
				if (tmp.equals("L")){
					leftPosition = num;
					pressedList.add("L");
				} else if (tmp.equals("R")) {
					rightPosition = num;
					pressedList.add("R");
				}
			}
		}
		
		for (String press : pressedList){
			System.out.print(press);
		}
		
	}
	
	public static String findPressFinger (String hand, int num, int leftPosition, int rightPosition){
		
		// 여기서 이제 num, leftPosition, rightPosition을 키로 주소값을 꺼내서,
		// num 0번째 요소랑 leftPosition, rightPosition 0번째 요소를 빼서 절대값으로 바꾸고
		// num 1번째 요소랑 leftPosition, rightPosition 1번째 요소를 빼고 절대값으로 바꾸고
		// 절대값으로 뺸거 두개를 더해주면 거리가 나옴.
		
		return null;
	}

}
