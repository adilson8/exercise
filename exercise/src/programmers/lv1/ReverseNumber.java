package programmers.lv1;

public class ReverseNumber {
	
	public int[] solution(long n) {
        String stringN = Long.toString(n);
        String[] arrN = stringN.split("");

        int[] answer = new int[arrN.length];
        for(int i = 0; i < arrN.length; i++){
            answer[arrN.length - (i+1)] = Integer.parseInt(arrN[i]);
        }

        return answer;
    }

}
