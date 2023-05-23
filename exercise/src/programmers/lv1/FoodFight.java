package programmers.lv1;

public class FoodFight {

	// https://school.programmers.co.kr/learn/courses/30/lessons/134240
	public String solution(int[] food) {
        String answer = "0";		
		
		for(int i = 1; i <= food.length; i++){
			if(food[food.length-i] % 2 == 0){
				for (int j = 0; j < food[food.length-i]/2; j++){
					answer = Integer.toString(food.length-i) + answer;
					answer = answer + Integer.toString(food.length-i);
				}
			} else {
				if (food[food.length-i]/2 >= 1){
					for (int j = 0; j < food[food.length-i]/2; j++){
						answer = Integer.toString(food.length-i) + answer;
						answer = answer + Integer.toString(food.length-i);
					}
				} 
			}
		}
        return answer;
    }
}
