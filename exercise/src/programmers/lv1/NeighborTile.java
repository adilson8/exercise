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
		
		String target = board[h][w];
		String left = board[h][w-1];
		String right = board[h][w+1];
		String up = board[h-1][w];
		String down = board[h+1][w];
		
		List<String> neighbors = new ArrayList<>(); 
		
		System.out.println(target);
		System.out.println(left);
		System.out.println(right);
		System.out.println(up);
		System.out.println(down);
		

	}

}
