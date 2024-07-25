package programmers.lv1;

public class Babbling {

	// https://school.programmers.co.kr/learn/courses/30/lessons/133499
	public int solution(String[] babbling) {
	       int answer = 0;
			String[] wordList = {"aya", "ye", "woo", "ma"};
			
			Loop1 :
			for (int i = 0; i < babbling.length; i++) {
				String element = babbling[i];
				String element2 = babbling[i];
				String[] splitElement = {};
				String splitWord = "";
				
				// 사용 가능한 단어 for문
				Loop2 :
				for (int j = 0; j < wordList.length; j++) {
					splitWord = wordList[j];
					
					// 중복체크
					Loop3 :
					while (element2.contains(splitWord)) {
						splitElement = element2.split(splitWord, 2);			
						if (splitElement.length == 2){
							if (splitElement[1].startsWith(splitWord)) {
								System.out.println("중복제외 : " + babbling[i]);
								break Loop2;
							} else {
								element2 = splitElement[0] + " " + splitElement[1];			
							}
						}					
					}
					
					element = element.replaceAll(splitWord, " ");
				}
				
				if (element.replaceAll(" ", "").equals("")){
					System.out.println("발음성공 : " + babbling[i]);
					answer++;
				}
			}
			
			return answer;
	    }
}
