package programmers.lv1;

public class StringToNaturalNum {
	
	public int solution(String s) {
        int answer = 0;
		
		String[] arrS = s.split("");
		
		int i = 1;
		for (String s2 : arrS) {
			if(!s2.equals("-") && !s2.equals("+")){				
				answer = answer + (Integer.parseInt(s2) * (int) Math.pow(10, arrS.length - i)); // Math.pow() 거듭제곱 구하는 메소드
				i++;
			} else {				
				i++; // 부호 포함시 자릿수 맞춰주기 위함
			}
		}
		
		if(arrS[0].equals("-")){
			answer = answer * -1;
		}
        return answer;
    }

}
