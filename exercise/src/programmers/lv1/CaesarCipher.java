package programmers.lv1;

public class CaesarCipher {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12926
	public String solution(String s, int n) {
        String answer = "";

        String[] arr = s.split("");

        for (String e : arr){
            int code = (int) e.charAt(0);
            char temp;

            if (code == 32) { // 공백일 경우
                temp = ' ';
            } else if (97 <= code && (int) code <= 122) { // 소문자일 경우
                int m = code + n;

                if (m>122){
                    m = m - 26;
                }

                temp = (char) m;
            } else { // 대문자일 경우
                int m = code + n;

                if (m>90){
                    m = m - 26;
                }

                temp = (char) m;
            };

            answer += Character.toString(temp);
        }

        return answer;
    }

}
