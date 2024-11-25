package programmers.lv2;

public class JumpAndTeleport {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12980
	public static int main (int n){
		int answer = 0;
		
		while (n>0) {
			if (n%2 == 0) {
				n = n/2;
			} else {
				n = n/2;
				answer++;
			}
		}

        return answer;
	}

}
