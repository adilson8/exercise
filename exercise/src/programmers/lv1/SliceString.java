package programmers.lv1;

public class SliceString {

	// https://school.programmers.co.kr/learn/courses/30/lessons/140108
	public int solution(String s) {
        int answer = 1;
		
		while (retrieveSliceIdx(s)!=0){
			int sliceIdx = retrieveSliceIdx(s);
			s = s.substring(sliceIdx+1);	
			answer ++;
		}
        
        return answer;
    }
    
    public static int retrieveSliceIdx(String s){
		char[] sArray = s.toCharArray();		
		char firstChar = sArray[0];

		int sameCount = 1;		
		int diffCount = 0;
		
		for (int i = 1; i < sArray.length-1; i++){
			if (sArray[i] == firstChar){
				sameCount++;
			} else {
				diffCount++;
			}
			
			if (sameCount == diffCount) {
				return i;
			}	
		}
		
		return 0;	
	}
}
