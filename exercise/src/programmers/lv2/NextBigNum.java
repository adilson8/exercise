package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextBigNum {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12911
	public static void main (String[] args){
		
		// answer : 83
//		int n = 78;
		
		// answer : 23
		int n = 15;

		int answer = 0;
		int tmp = n;
		int nCnt = 0;
		int tmpCnt = 0;
		
		String binaryN = binaryConverter(n);
		char[] binaryNArr = binaryN.toCharArray();
		char[] newArrBinaryN = new char[binaryNArr.length + 1];
		for (char c : binaryNArr){
			if (c == '1'){
				nCnt++;
			}
		}
		
		while (true){
			
			char[] nextBinaryNArr;
			
			if (newArrBinaryN[0]!='1'){
				nextBinaryNArr = nextBinaryValue(binaryNArr, newArrBinaryN);
			}else {
				nextBinaryNArr = nextBinaryValue(newArrBinaryN, newArrBinaryN);
			}
			
			for (char c : nextBinaryNArr){
				if (c == '1'){
					tmpCnt++;
				}
			}
			
			tmp++;
			
			if (tmpCnt==nCnt){
				answer = tmp;
				break;		
			}
			
			tmpCnt = 0;
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
		
//		Collections.reverse(list);
//		
//		for (int l : list){
//			binary += l;
//		}
		
		for (int i = list.size()-1; i >= 0; i--){
			binary += list.get(i);
		}
		
		return binary;
	}
	
	private static char[] nextBinaryValue(char[] binaryNArr, char[] newArrBinaryN) {
		
		boolean hasDigitIncreased = true;
		
		int i = binaryNArr.length-1;
		for (; i >= 0; i--){
			if (binaryNArr[i]=='0'){
				binaryNArr[i] = '1';
				hasDigitIncreased = false;
				break;
			}
		}
		
		if (!hasDigitIncreased){
			for (int j = i+1; j < binaryNArr.length; j++){
				binaryNArr[j] = '0';
			}
			return binaryNArr;
			
		} else {
			newArrBinaryN[0] = '1';
			for (int k = 1; k < newArrBinaryN.length; k++){
				newArrBinaryN[k] = '0';
			}
			return newArrBinaryN;	
		}
	}
	
}
