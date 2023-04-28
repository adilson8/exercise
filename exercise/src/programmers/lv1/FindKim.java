package programmers.lv1;

public class FindKim {
	
	public String solution(String[] seoul) {
        String answer = "";

        int idx = 0;
        for (String name  : seoul) {
            if (name.equals("Kim")){
                break;
            }
            idx++;
        }

        answer = "김서방은 " + Integer.toString(idx) + "에 있다";

        return answer;
    }

}
