package programmers.lv1;

import java.util.Stack;

public class MakingBurgers {

	public static void main(int[] ingredient) {
		int answer = 0;
		Stack<Integer> tmp = new Stack<>();
		
		for (int i : ingredient){
			tmp.push(i);
			
			if (tmp.size() >= 4){
				if (tmp.get(tmp.size()-1) == 1 
				 && tmp.get(tmp.size()-2) == 3
				 && tmp.get(tmp.size()-3) == 2
				 && tmp.get(tmp.size()-4) == 1 ){
					tmp.pop();
					tmp.pop();
					tmp.pop();
					tmp.pop();
					answer++;
				}				
			}
		}
		
		System.out.println(answer);
	}

}
