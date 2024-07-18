package programmers.lv1;

public class WeaponOfKnights {

	// https://school.programmers.co.kr/learn/courses/30/lessons/136798
	public int solution(int number, int limit, int power) {
        int answer	= 0;		
				
		for(int i = 1; i <= number; i++){
			int countDivisor = countDivisor(i);
			
			if (countDivisor > limit){
				answer += power;				
			} else {
				answer += countDivisor;
			}
		}
        
        return answer;
    }
    
    public static int countDivisor(int num){
		int count = 0;
		
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i ==0){
				if (i == Math.sqrt(num)){
					count += 1;					
				} else {					
					count += 2;
				}
			}
		}
		
		return count;
	}

}
