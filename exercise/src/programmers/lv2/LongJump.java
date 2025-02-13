package programmers.lv2;

public class LongJump {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12914
	public static long main (int n){
		long answer = 0;
        long n1 = 1;
        long n2 = 2;

        if (n == 1) {
            return n1;
        }

        if (n == 2) {
            return n2;
        }

        for (int i = 3; i < n+1; i++) {
            answer = (n1 + n2) % 1234567;
            n1 = n2;
            n2 = answer;
        };

       return answer;
	}

}
