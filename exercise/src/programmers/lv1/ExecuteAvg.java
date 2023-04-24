package programmers.lv1;

public class ExecuteAvg {
	
	public double solution(int[] arr) {
        double answer = 0;
		
		for (int idx :arr) {
			answer = answer + idx;
		}	
		
		answer = answer / arr.length;
        
        return answer;
    }

}
