package programmers.lv2;

public class Bracket {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12985
	public static void bracket (int n, int a, int b){
		int answer = 0;
		
		while (n > 1){
			if ((a % 2 == 0 && a - b == 1) || (b % 2 == 0 && b - a == 1)) {
	            answer++;
	            break;
	        }

	        answer++;
			
			if (a%2 == 0) {
				a = a/2;
			} else {
				a = (a+1)/2;				
			}
			
			if (b%2 == 0) {
				b = b/2;
			} else {
				b = (b+1)/2;				
			}			
			
			n = n/2;
		}
		
		System.out.println(answer);
	}

}
