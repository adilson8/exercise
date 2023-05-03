package programmers.lv1;

public class RideFee {
	
	public long solution(int price, int money, int count) {
		
		// https://school.programmers.co.kr/learn/courses/30/lessons/82612
		
        long newPrice = 0;
		long totalPrice = 0;
		long answer = 0;
		
		for (int i = 1; i <= count; i++){
			newPrice = price * i;
			totalPrice += newPrice;
		}

		if (totalPrice > money) {
			answer = totalPrice - money;		
		} else {
			answer = 0;
		}

        return answer;
    }

}
