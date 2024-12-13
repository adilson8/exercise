package programmers.lv2;

import java.util.Arrays;

public class LifeBoat {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42885
	public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int light = 0;
        int heavy = people.length-1;
        int answer = 0;

        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit){
                light++;
                heavy--;
            } else {
                heavy--;
            }
            answer++;
        }

        return answer;
    }

}
