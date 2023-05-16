package programmers.lv1;

public class NumberPlay {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/81301
	public static void main (String[] args){
		String s = "one4seveneight";
		
		String zeroS = "";
		if (s.contains("zero")){
			String[] arr = s.split("zero", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "0";
			newArr[2] = arr[1];
			for (String e  :newArr){
				zeroS += e; 
			}
			s = zeroS;
		}
		
		String oneS = "";
		if (s.contains("one")){
			String[] arr = s.split("one", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "1";
			newArr[2] = arr[1];
			for (String e  :newArr){
				oneS += e; 
			}			
			s = oneS;
		}
		
		String twoS = "";
		if (s.contains("two")){
			String[] arr = s.split("two", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "2";
			newArr[2] = arr[1];
			for (String e  :newArr){
				twoS += e; 
			}		
			s = twoS;
		}
		
		String threeS = "";
		if (s.contains("three")){
			String[] arr = s.split("three", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "3";
			newArr[2] = arr[1];
			for (String e  :newArr){
				threeS += e; 
			}			
			s = threeS;
		}
		
		String fourS = "";
		if (s.contains("four")){
			String[] arr = s.split("four", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "4";
			newArr[2] = arr[1];
			for (String e  :newArr){
				fourS += e; 
			}			
			s = fourS;
		}
		
		String fiveS = "";
		if (s.contains("five")){
			String[] arr = s.split("five", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "5";
			newArr[2] = arr[1];
			for (String e  :newArr){
				fiveS += e; 
			}			
			s = fiveS;
		}
		
		String sixS = "";
		if (s.contains("six")){
			String[] arr = s.split("six", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "6";
			newArr[2] = arr[1];
			for (String e  :newArr){
				sixS += e; 
			}			
			s = sixS;
		}
		
		String sevenS = "";
		if (s.contains("seven")){
			String[] arr = s.split("seven", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "7";
			newArr[2] = arr[1];
			for (String e  :newArr){
				sevenS += e; 
			}			
			s = sevenS;
		}
		
		String eightS = "";
		if (s.contains("eight")){
			String[] arr = s.split("eight", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "8";
			newArr[2] = arr[1];
			for (String e  :newArr){
				eightS += e; 
			}			
			s = eightS;
		}
		
		String nineS = "";
		if (s.contains("nine")){
			String[] arr = s.split("nine", -1);
			String[] newArr = new String[arr.length+1];
			newArr[0] = arr[0];
			newArr[1] = "9";
			newArr[2] = arr[1];
			for (String e  :newArr){
				nineS += e; 
			}			
			s = nineS;
		}
		
		System.out.println(s);
		
		int answer = Integer.parseInt(s);
		System.out.println(answer);
	}

}
