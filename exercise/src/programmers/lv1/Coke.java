package programmers.lv1;

public class Coke {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/132267
	public static void main (String[] args){
		int a = 5;
		int b = 3;
		int n = 21;
				
		int bottles = 0;
		while (true){
			if (n/a >= 1){
				System.out.println(((n/a)*b));
				bottles += ((n/a)*b);
			}
			
			System.out.println("n : " +n);
			System.out.println("bottles : " + bottles);
			if (n < a) {
				break;
			} else {
				n = n/a + n%a;				
			}
			
			System.out.println("==========");
		}
		System.out.println(bottles);		
	}

}
