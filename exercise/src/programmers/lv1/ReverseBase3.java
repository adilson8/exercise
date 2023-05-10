package programmers.lv1;

public class ReverseBase3 {
	
	public static void main (String[] args){
		int n = 125;
		
		String temp = "";
		boolean keepGoing = true;
		while(keepGoing){
			if (n/3 > 3){
				temp = temp + Integer.toString(n%3);
				n = n/3;
			} else {
				temp = temp + Integer.toString(n%3);				
				temp = temp + Integer.toString(n/3);
				break;
			}
		}
		
		int n2 = Integer.parseInt(temp);
		System.out.println(n2);
		
		// 인제 밑에서 n2를 10진수로 바꾸면댐
	}
}
