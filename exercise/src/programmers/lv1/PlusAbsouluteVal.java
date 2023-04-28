package programmers.lv1;

public class PlusAbsouluteVal {
	public int solution(int[] absolutes, boolean[] signs) {

        int[] realNums = new int[absolutes.length];
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true){
                realNums[i] = absolutes[i];
            } else {
                realNums[i] = absolutes[i] * -1;
            }
        }

        int answer = 0;
        for (int e : realNums){
            answer = answer + e;
        }

        return answer;
    }
}
