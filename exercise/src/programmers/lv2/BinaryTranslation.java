package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTranslation {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/70129
	public static int[] main(String s){
		int zeroCnt = 0;
		int loopCnt = 0;
		
		while (!s.equals("1")){
			loopCnt++;
			
			String[] noZeroSAndZeroCnt = removeZero(s);
			s = noZeroSAndZeroCnt[0];
			zeroCnt += Integer.valueOf(noZeroSAndZeroCnt[1]);
			
			s = binaryTranslator(s);
		}
		
		int[] answer = {loopCnt, zeroCnt};
		
		return answer;
	}
	
	public static String[] removeZero(String s){
		
		String noZeroS = "";
		int zeroCnt = 0;
		char[] charArrS = s.toCharArray();
		for (char charS : charArrS){
			if(charS != '0'){
				noZeroS += charS;
			} else {
				zeroCnt++;
			}
		}
		
		String[] noZeroSAndZeroCnt = {noZeroS, String.valueOf(zeroCnt)};
		return noZeroSAndZeroCnt;
	}
	
	public static String binaryTranslator(String s){
		
		int sLength = s.length();
		List<String> list = new ArrayList<>();
		String binary = "";
		
		while (sLength > 0){
			list.add(String.valueOf(sLength%2));
			sLength = sLength/2;
		}
		
		Collections.reverse(list);
		
		for (String l:list){
			binary += l;
		}
		
		return binary;
	}

}
