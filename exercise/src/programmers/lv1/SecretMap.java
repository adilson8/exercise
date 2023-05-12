package programmers.lv1;

public class SecretMap {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/17681
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr3 = new String[n];
		String[] arr4 = new String[n];
		
		for (int i = 0; i < n; i++) {
			String a = Integer.toBinaryString(arr1[i]);
			String b = Integer.toBinaryString(arr2[i]);
			if (a.length() != n){
				int r = n - a.length();
				for (int m = 0; m < r; m++){
					a = "0" + a;					
				}
			}
			arr3[i] = a;
			
			if (b.length() != n){
				int r = n - b.length();
				for (int m = 0; m < r; m++){		
					b = "0" + b;
				}
			}
			arr4[i] = b;
		}
		
		String[] answer = new String[n];
		for (int i = 0; i < n; i++){
			String element = "";
			char[] charArr = arr3[i].toCharArray();
			char[] charArr2 = arr4[i].toCharArray();
			for (int m = 0; m < n; m++) {
				if (charArr[m]=='0' && charArr2[m]=='0'){
					element += " "; 
				} else {
					element += "#";
				}
				System.out.println(element);
				answer[i] = element;
			}
		}
        
        return answer;
    }

}
