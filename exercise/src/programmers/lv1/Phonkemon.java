package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Phonkemon {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/1845
	public int solution(int[] nums) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                list.add(nums[i]);
            } else if (list.get(list.size()-1) != nums [i]){
                list.add(nums[i]);
            }               
        }

        int answer = 0;
        if (list.size() > nums.length / 2){
            answer = nums.length / 2;
        } else {
            answer = list.size();
        }
        return answer;
    }
}
