package programmers.lv1;

public class HarshadNumber {
	
	public boolean solution(int x) {
        boolean answer = true;

		int sum = 0;
		String[] arrX  = Integer.toString(x).split("");
		for (String element : arrX) {
			sum = sum + Integer.parseInt(element);			
		}
		
		if ( x % sum == 0 ){
			answer = true;
		} else {
			answer = false;
		}
        
        return answer;
    }

}
