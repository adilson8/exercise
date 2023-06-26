package programmers.lv1;

public class FindPrimeNumber {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12921
	public static void main(String[] args) {
		int n = 10;
		
		int noPrime = 1;

		for (int i = 3; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					noPrime++;
					break;
				}
			}
		}
		
		int answer = n - noPrime;
		
		System.out.println(answer);
		
		// 시간초과, 메서드로 빼서 다시 해보자
		
	}

}
