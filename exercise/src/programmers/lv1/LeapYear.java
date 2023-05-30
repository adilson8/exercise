package programmers.lv1;

public class LeapYear {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12901
	public String solution(int a, int b) {
        int date = 0;
		switch (a) {
			case 1  : date = 0 + b;   break;
			case 2  : date = 31 + b;  break;
			case 3  : date = 60 + b;  break;
			case 4  : date = 91 + b;  break;
			case 5  : date = 121 + b; break;
			case 6  : date = 152 + b; break;
			case 7  : date = 182 + b; break;
			case 8  : date = 213 + b; break;
			case 9  : date = 244 + b; break;
			case 10 : date = 274 + b; break;
			case 11 : date = 305 + b; break;
			case 12 : date = 335 + b; break;
		}
		
		int day = date % 7;
		String answer = "";
		
		switch (day) {
			case 1 : answer = "FRI"; break;
			case 2 : answer = "SAT"; break;
			case 3 : answer = "SUN"; break;
			case 4 : answer = "MON"; break;
			case 5 : answer = "TUE"; break;
			case 6 : answer = "WED"; break;
			case 0 : answer = "THU"; break;
		}
        return answer;
    }
}
