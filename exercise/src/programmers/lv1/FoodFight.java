package programmers.lv1;

public class FoodFight {

	// https://school.programmers.co.kr/learn/courses/30/lessons/134240
	public static void main (String[] args){
		int[] food = {1, 3, 4, 6};
		String answer = "0";		
		
		for(int i = 1; i <= food.length; i++){
			if(food[food.length-i] % 2 == 0){
				// 짝수면 그냥 쓴다
				System.out.println("나는 짝수야" + food[food.length-i] );
				System.out.println(food.length-i + "를" + food[food.length-i]/2 + "번 추가할 수 있다." );
				for (int j = 0; j < food[food.length-i]/2; j++){
					answer = Integer.toString(food.length-i) + answer;
					answer = answer + Integer.toString(food.length-i);
				}
			} else {
				// 홀수면 나머지는 버리고 쓴다
				System.out.println("나는 홀수야" + food[food.length-i]);
				if (food[food.length-i]/2 >= 1){
					System.out.println(food.length-i + "를" + food[food.length-i]/2 + "번 추가할 수 있다.");
					for (int j = 0; j < food[food.length-i]/2; j++){
						answer = Integer.toString(food.length-i) + answer;
						answer = answer + Integer.toString(food.length-i);
					}
				} else {
					// 아무것도 못함
					System.out.println(food.length-i + "를" + food[food.length-i]/2 + "번 추가할 수 있다.");
				}
			}
			System.out.println(answer);
			System.out.println("========");
		}
	}
}
