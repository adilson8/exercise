package programmers.lv2;

public class Fibonacci {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12945
	public static void main (String[] args){

		// answer : 2
//		int n = 3; 
		
		// answer : 5
		int n = 5;
		
		int fibonacci = fibonacci(n);
		int answer = fibonacci % 1234567;
		System.out.println(answer);
	}

	private static int fibonacci(int n) {
		
		if (n == 0){
			return 0;
		} else if (n == 1){
			return 1;			
		} else {
			return fibonacci(n-2) + fibonacci(n-1); 
		}
	}

}
