package programmers.lv1;

import java.util.Stack;

public class CraneClawGame {

	// https://school.programmers.co.kr/learn/courses/30/lessons/64061
	public static void main(int[][] board, int[] moves) {
		int answer = 0;
		
		Stack<Integer> dolls = new Stack<>();
		
		for (int i = 0; moves.length > i; i++){
			for (int j = 0; board.length > j; j++){
				int move = moves[i]-1;
				System.out.println("move : " + move);
				
				System.out.println("board[" + j + "][" + move + "] = " + board[j][move]);
				if (board[j][move] != 0){
					if (dolls.size() != 0 && dolls.lastElement() == board[j][move]){
						dolls.pop();
						answer++;
						answer++;
					} else {
						dolls.push(board[j][move]);						
					}
					
					board[j][move] = 0;
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
