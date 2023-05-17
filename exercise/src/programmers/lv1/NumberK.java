package programmers.lv1;

import java.util.Arrays;

public class NumberK {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42748
	public static void main (String[] args){
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
				
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i ++){
			String arrString = "";
			
			for (int e : array){
				arrString += Integer.toString(e);
			}
			
			System.out.println(arrString);
			char[] charArr = arrString.substring(commands[i][0]-1, commands[i][1]).toCharArray();
			Arrays.sort(charArr);
			System.out.println(Arrays.toString(charArr));
			int answerE = Character.getNumericValue(charArr[commands[i][2]-1]);
			System.out.println(answerE);
			System.out.println("==========================");
			
			answer[i] = answerE;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
