package programmers.lv1;

public class ThreeMusketeers {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/131705
	public int solution(int[] number) {
        int num1, num2, num3;
		int answer = 0;
        
		for (int i = 0; i < number.length; i++){
			num1 = number[i];
			for (int n = i+1; n < number.length; n++){
				num2 = number[n];
				for (int m = n+1; m < number.length; m++){
					num3 = number[m];
					if (num1 + num2 + num3 == 0){
						answer++;
					}
				}
			}
		}
        return answer;
    }

}
