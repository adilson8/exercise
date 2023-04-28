package programmers.lv1;

public class ReplacePhoneNum {
	
	public String solution(String phone_number) {
        String answer = "";

        String realNum = phone_number.substring(phone_number.length()-4, phone_number.length());
        String hideNum = phone_number.substring(0, phone_number.length() - realNum.length());

        String replace = "";
        for (int i = 0; i < hideNum.length(); i++){
            replace = replace + "*";
        }

        answer = replace + realNum;

        return answer;
    }

}
