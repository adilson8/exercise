package programmers.lv1;

public class Coke {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/132267
	public static void main (String[] args){
		int a = 3;
		int b = 1;
		int n = 20;
		
		boolean keepGoing = true;
		int answer = 0;
		while (keepGoing) {
			int newCoke = 0;
			newCoke = n/a + n%a;
			answer += newCoke;
			System.out.println(newCoke);
			break;
		}
		
		System.out.println(answer);
	}

}
