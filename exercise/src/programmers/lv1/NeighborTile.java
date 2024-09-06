package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class NeighborTile {

	// https://school.programmers.co.kr/learn/courses/30/lessons/250125
	public static void main(String[] args) {
		 
		// answer : 2; 
		String[][] board = {
			    {"blue", "red", "orange", "red"},
			    {"red", "red", "blue", "orange"},
			    {"blue", "orange", "red", "red"},
			    {"orange", "orange", "red", "blue"}
			};
		int h = 1;
		int w = 1;
		
		// answer : 1; 
//		String[][] board = {
//			    {"yellow", "green", "blue"},
//			    {"blue", "green", "yellow"},
//			    {"yellow", "blue", "blue"}
//			};
//		int h = 0;
//		int w = 1;
		
		int answer = 0;
		String target = board[h][w];
		
		String left = "";
		if(w > 0){
			left = board[h][w-1];			
		}
		
		String right = "";
		if (w+1 < board[h].length-1){
			right = board[h][w+1];			
		}
		
		String up = "";
		if (h > 0){
			up = board[h-1][w];			
		}
		
		String down = "";
		if (h+1 < board[w].length-1){
			down = board[h+1][w];			
		}
		
		List<String> neighbors = new ArrayList<>();
		neighbors.add(left);
		neighbors.add(right);
		neighbors.add(up);
		neighbors.add(down);
		
		for (String neighbor : neighbors){
			if (target.equals(neighbor)) {
				answer++;
			}
		}
		
		System.out.println(answer);
		

	}

}
