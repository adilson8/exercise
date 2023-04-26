package programmers.lv1;

public class SortDesc {
	
	public long solution(long n) {
        long answer = 0;
				
		String[] arrStrN = Long.toString(n).split("");
		int[] arrN = new int[arrStrN.length];
		for(int i = 0; i < arrStrN.length; i++){
			arrN[i] = Integer.parseInt(arrStrN[i]);
		}
		
		// 2. 1의 과정을 배열 길이만큼 반복
		for(int num :arrN){
			// 1. 첫번째 요소 잡고 맨 끝으로 보냄
			for(int i =0; i < arrN.length-1; i++){
				if(arrN[i] < arrN[i+1]){
					int temp = arrN[i+1];
					arrN[i+1] = arrN[i];
					arrN[i] = temp;
				}
			}
		}
		
		String temp = "";
		for (int i = 0; i < arrN.length; i++){
			temp = temp + arrN[i];
		}		
		answer = Long.parseLong(temp);
        
        return answer;
    }
}
