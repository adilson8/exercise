package programmers.lv1;

public class GetMidChar {
	
	public String solution(String s) {
        if (s.length() % 2 == 0) {
            // 짝수면 가운데 두글자
            String answer = s.substring((s.length() / 2) -1, (s.length() / 2) + 1);
            return answer;      
        } else{
            // 홀수면 가운데 한글자
            String answer = s.substring(s.length() / 2, (s.length() / 2) + 1);
            return answer;
        }
    }
	
}
