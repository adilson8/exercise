package programmers.lv1;

public class PlusMissingNum {
	
	public int solution(int[] numbers) {
		 int sum = 0;
	     for (int num : numbers){
	    	 sum = sum + num;
	     }
	     
	     int answer = 45 - sum;	     
	     return answer;	     
    }
}
