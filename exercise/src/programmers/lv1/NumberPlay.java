package programmers.lv1;

public class NumberPlay {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/81301
	public int solution(String s) {
        String newS = s.replaceAll("zero", "0")
		.replaceAll("one", "1")
		.replaceAll("two", "2")
		.replaceAll("three", "3")
		.replaceAll("four", "4")
		.replaceAll("five", "5")
		.replaceAll("six", "6")
		.replaceAll("seven", "7")
		.replaceAll("eight", "8")
		.replaceAll("nine", "9");
		
		int answer = Integer.parseInt(newS);
        return answer;
    }
}
