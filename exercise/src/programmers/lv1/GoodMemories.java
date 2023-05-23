package programmers.lv1;

public class GoodMemories {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/176963
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
		for(int i = 0; i < photo.length; i++){
			for (int j = 0; j < photo[i].length; j++){
				for (int k = 0; k < name.length; k++){
					if (photo[i][j].equals(name[k])){
						answer[i] = answer[i] + yearning[k];                     
					}
				}
			}
		}
        return answer;
    }
}
