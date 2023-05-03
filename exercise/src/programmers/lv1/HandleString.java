package programmers.lv1;

public class HandleString {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12918/solution_groups?language=java&type=my
	
	public boolean solution(String s) {
		
        boolean answer = false;

        char[] arrS = s.toCharArray();
        if (s.length() == 4 || s.length() == 6){
            for (int i = 0; i < s.length(); i++) {
                if(arrS[i] == '0' || arrS[i] == '1'
                || arrS[i] == '2' || arrS[i] == '3'
                || arrS[i] == '4' || arrS[i] == '5'
                || arrS[i] == '6' || arrS[i] == '7'
                || arrS[i] == '8' || arrS[i] == '9'){
                    answer = true;                  
                } else {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }

}
