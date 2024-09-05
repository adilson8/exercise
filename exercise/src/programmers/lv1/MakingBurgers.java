package programmers.lv1;

public class MakingBurgers {

	public static void main(String[] args) {
		// answer : 0
//		int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
		
		// answer : 2
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		
		int answer = 0;
		
		String tmp = "";
		String burger = "1231";
		for(int i = 0; ingredient.length > i; i++){
			tmp += String.valueOf(ingredient[i]);
			if (tmp.contains(burger)){
				answer++;
				
				String[] splitedTmp = tmp.split(burger);
				tmp = "";
				for (String s : splitedTmp){ 
					tmp += s;
				}				
			}
		}
		
		System.out.println(answer);
	}

}
