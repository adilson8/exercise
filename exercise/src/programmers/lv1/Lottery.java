package programmers.lv1;

public class Lottery {

	// https://school.programmers.co.kr/learn/courses/30/lessons/77484
	public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
		int countZero = 0;
		int[] answer = new int[2];
		
		// 0. 일단 맞는거 세기
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0){
				countZero++;
			} else {
				for (int j = 0; j < win_nums.length; j++) {
					if (lottos[i] == win_nums[j]){
						count++;
					}
				}
			}
		}
		
		// 1. 최고등수 (다 맞는다고 가정하기)
		int maxCount = count + countZero;
		
		// 2. 최저등수 (다 틀린다고 가정하기)
		int minCount = count;
		
		answer[0] = retreiveRanking(maxCount); 
		answer[1] = retreiveRanking(minCount);
        
        return answer;
    }
    
    public static int retreiveRanking(int count){
		int rangking = 0;
		
		switch (count){
			case 6:  rangking = 1; break;
			case 5:  rangking = 2; break;
			case 4:  rangking = 3; break;
			case 3:  rangking = 4; break;
			case 2:  rangking = 5; break;
			case 1:  rangking = 6; break;
            case 0:  rangking = 6; break;
		}
		
		return rangking;
	}
}
