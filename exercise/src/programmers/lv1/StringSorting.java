package programmers.lv1;

import java.util.Arrays;

public class StringSorting {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12915
	public static void main (String[] args){
		
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 1;
		
		for (int i =0; i < strings.length; i++){
			int[] ints = new int[strings.length];
			for (int k =0; k < strings.length; k++){
				String e = strings[k];
				char a  = e.toCharArray()[n];
				ints[k] = (int) a;
			}
			
			for (int j =0; j < strings.length; j++){
				String temp = "";
				try {
					if (ints[j] > ints[j+1]){
						temp = strings[j];
						strings[j] = strings[j+1];
						strings[j+1] = temp;
					} else if (ints[j] == ints[j+1]){
						// 조졌다 여기서 이제 사전식배열? 해야한다
						for (int l = n; l < strings[j].length(); l++){
							
						}
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					break;
				}			
			}			
		}
		
		System.out.println(Arrays.toString(strings));
		
	}

}
