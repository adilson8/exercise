package programmers.lv1;

public class CollatzConjecture {
	public int solution(int num) {
        int answer = 0;        
        boolean a = true;

        if (num == 1){
            a = false;
        }

        long longNum = (long) num;

        while(a){           
            if (longNum % 2 == 0){
                longNum = longNum / 2;
                answer++;
            } else {
                longNum = (longNum * 3) + 1;
                answer++;
            }           

            if (longNum == 1) {
                break;
            }

            if (answer == 500){
                answer = -1;
                break;
            }           
        }   

        return answer;
    }
}
