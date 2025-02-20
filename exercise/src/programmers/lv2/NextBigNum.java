package programmers.lv2;

public class NextBigNum {

	// https://school.programmers.co.kr/learn/courses/30/lessons/12911
	public static int main (int n){
		
		int compare = Integer.bitCount(n);
	    int nextNum = 0;
	
	    while (true) {
	        nextNum = n+1; 
	        if (Integer.bitCount(nextNum)==compare){
	            break;
	        }
	        n++;
	    }
	
	    return nextNum;
	}	
}
