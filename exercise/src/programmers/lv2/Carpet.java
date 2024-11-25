package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class Carpet {

	// https://school.programmers.co.kr/learn/courses/30/lessons/42842?language=java
	public int[] main(int brown, int yellow) {
        int brownCnt = 0;

        List<int[]> yellowSizeCases = new ArrayList<>();

        int[] init = {yellow, 1};
        yellowSizeCases.add(init);

        for(int i = 2; i <= Math.sqrt(yellow); i++){
            if (yellow % i == 0){
                int[] tmp = new int[2]; 
                tmp[1] = i;
                tmp[0] = yellow/i;
                yellowSizeCases.add(tmp);
            }
        }

        for (int[] yellowSizeCase : yellowSizeCases){
            int yellowWidth = yellowSizeCase[0];
            int yellowHeight = yellowSizeCase[1];

            int brownTopBottom = (yellowWidth+2)*2;
            int brownMid = yellowHeight*2;
            brownCnt = brownTopBottom + brownMid;

            if(brownCnt == brown){
                int width = yellowWidth+2;
                int height = yellowHeight+2;
                int[] answer = {width, height}; 
                return answer;
            }
        }

        return null;
    }

}
