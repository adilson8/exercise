package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextBigNum {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12911
	public static void main (String[] args){
		
		// answer : 83
		int n = 78;
		
		// answer : 23
//		int n = 15;

		int answer = 0;
		int tmp = n;
		int nCnt = 0;
		int tmpCnt = 0;
		boolean flag = true;
		
		String binaryN = binaryConverter(n);
		for (char c : binaryN.toCharArray()){
			if (c == '1'){
				nCnt++;
			}
		}
		
		while (flag){
			tmp += 1;
			String binaryTmp = binaryConverter(tmp);
			for (char c : binaryTmp.toCharArray()){
				if (c == '1'){
					tmpCnt++;
				}
			}
			
			if (tmpCnt==nCnt){
				answer = tmp;
				flag = false;
				break;		
			}
		}
		
		
		System.out.println(answer);

	}
	
	public static String binaryConverter(int n){
		String binary = "";
		List<Integer> list = new ArrayList<>();
		
		while(n>0){
			list.add(n%2);
			n = n/2;
		}
		
		Collections.reverse(list);
		
		for (int l : list){
			binary += l;
		}
		
		return binary;
	}

}
