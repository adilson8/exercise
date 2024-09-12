package programmers.lv2;

public class NumberExpression {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12924s
	public static int main (int n) {
        int sum = 0;
        int answer = 1;

        for (int i = 1; i < n; i++){
            for (int j = i; j <= n; j++){
                sum += j;
                if (sum == n){
                    answer++;
                    break;
                } else if (sum > n){
                    break;
                }
            }
            sum = 0;
        }

        return answer;
    }

}
