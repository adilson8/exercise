package programmers.lv1;

public class FindPrimeNumber {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12921
	public static void main(String[] args) {
		int n = 10;
		
		// 2는 소수이기 때문에 초기값 1로 선언
        int answer = 1;
        
        // 3부터 n까지 반복하여 소수의 개수 찾기
        for (int i = 3; i <= n; i++) {
        	boolean isPrime = true;
        	
        	// 해당 숫자 소수 판별로직
        	for (int j = 2; j <= (int)Math.sqrt(i); j++){
        		if (i % j == 0){
        			isPrime = false;
        			break;
        		}
        	}
        	
        	if (isPrime){
        		answer++;
        	}
        	
        }
        
        System.out.println(answer);
	}

}
