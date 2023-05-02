package programmers.lv1;

import java.util.Arrays;

public class StringDesc {
	
	public String solution(String s) {

        // 배열로 전환
        int[] arrS = new int[s.length()];
        for(int i = 0; i < arrS.length; i++){
            arrS[i] = (int) s.charAt(i);
        }

        // 순차정렬
        Arrays.sort(arrS);

        // 역순정렬
        int[] arrAnswer = new int[s.length()];
        for (int i = 0; i < arrS.length; i++){
            arrAnswer[i] = arrS[arrS.length-i-1];  
        }

        // 문자열 변환
        String answer = "";
        for (int e : arrAnswer){
            answer += Character.toString((char)e);
        }

        return answer;
    }

}
