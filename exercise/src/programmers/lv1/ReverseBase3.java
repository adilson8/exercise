package programmers.lv1;

public class ReverseBase3 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/68935
	public int solution(int n) {
        // 앞뒤 반전된 3진법 수 구하기
		String reversedBase3 = "";
		boolean keepGoing = true;
		while(keepGoing){
			if (n < 3) {
				reversedBase3 = Integer.toString(n); 
				break;
			}
			
			if (n/3 >= 3){
				reversedBase3 = reversedBase3 + Integer.toString(n%3);
				n = n/3;
			} else {
				reversedBase3 = reversedBase3 + Integer.toString(n%3);
				reversedBase3 = reversedBase3 + Integer.toString(n/3);
				break;
			}
		}
		
		// 앞뒤 반전된 3진법 수 다시 반전시키기
		StringBuffer sb = new StringBuffer();
		sb.append(reversedBase3);
		String base3 = sb.reverse().toString();

		// 3진법 수를 이용해 앞뒤 반전된 3진법 수를 10진법 수로 바꾸기
		char[] base3Arr = base3.toCharArray();	
		int answer = 0; 
		int i = 1;
		for (char c : base3Arr){
			int num = Integer.parseInt(Character.toString(c));
			answer = answer + (num*i);
			i = i * 3;
		}
		
        return answer;
    }
}
