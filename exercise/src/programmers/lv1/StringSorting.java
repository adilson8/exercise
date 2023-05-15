package programmers.lv1;

import java.util.Arrays;

public class StringSorting {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12915
	public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);

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
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }           
            }           
        }
        return strings;
    }

}
