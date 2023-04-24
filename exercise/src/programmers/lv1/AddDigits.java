package programmers.lv1;

public class AddDigits {
    public int solution(int n) {        
        int answer = 0;
		
		String stringNum = Integer.toString(n);
		String[] arr = stringNum.split("");

		for(String num : arr) {			
			answer = answer + Integer.parseInt(num);
		} 
		
		System.out.println(answer);
        
        return answer;
    }
}
