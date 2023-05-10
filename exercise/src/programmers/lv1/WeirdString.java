package programmers.lv1;

public class WeirdString {
	
	public String solution(String s) {
		// split(String regex)
		// 아래와 같이 작성하면 문자열 가장 뒤의 공백들이 모두 삭제됨
		// String[] arrS = s.split(" ");  
		
		// split(String regex, int limit)
		// 아래와 같이 limit 인자에 음수를 주면 길이가 0인 문자열도 배열에 포함
        String[] arrS = s.split(" ", -1);  
		
		String answer = "";
		for(int j = 0;  j < arrS.length; j++) {
			String[] arrE = arrS[j].split("");
			for(int i = 0; i < arrE.length; i++){
				if (i == 0){
					answer = answer + arrE[i].toUpperCase();
				} else if (i%2 == 0) {
					answer = answer + arrE[i].toUpperCase();					
				} else {
					answer = answer + arrE[i].toLowerCase();
				}
			}
			
			if ((j+1) != arrS.length){
				answer = answer + " ";				
			}
		}
        
        return answer;
    }
}