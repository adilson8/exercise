package programmers.lv2;

public class Fibonacci {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12945
	public static int main (int n) {
        return fibonacci(n);
    }

    private static int fibonacci(int n) {

        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;           
        }

        int a = 0;
        int b = 1;
        int fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = (a + b) % 1234567;;
            a = b;
            b = fibonacci;
        }

        return fibonacci;
    }

}
