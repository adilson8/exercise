package programmers.lv2;

public class LongJump {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12914
	public static void main (String[] args){
		
		//answer = 5;
//		int n = 4;
		
		// answer = 3;
//		int n = 3;
		
		int n = 7;
		// n이 1 : 1가지
		// n이 2 : 2가지
		// n이 3 : 3가지
		// n이 4 : 5가지
		// n이 5 : 8가지
		// n이 6 : 13가지
		// n이 7 : 21가지
		
		long answer = 0;
		long n1 = 1;
		long n2 = 2;
		
		if (n == 1) {
			System.out.println(n1);
		}
		
		if (n == 2) {
			System.out.println(n2);
		}
		
		for (int i = 3; i < n+1; i++) {
			answer = n1 + n2;
			n1 = n2;
			n2 = answer;
		};
        
		System.out.println(answer%1234567);
	}

}
