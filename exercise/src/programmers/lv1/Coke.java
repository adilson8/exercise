package programmers.lv1;

public class Coke {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/132267
	public int solution(int a, int b, int n) {
        int answer = 0;
		int bottles = 0;		
		while (true) {
			if (n/a >=1) {
				bottles = (n/a)*b;
				answer += bottles;
			}
			
			if (n < a){
				break;
			} else {
				n = bottles + (n%a);
			}
		}
        return answer;
    }
}
