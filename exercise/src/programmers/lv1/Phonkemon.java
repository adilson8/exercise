package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Phonkemon {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/1845
	public static void main (String[] args){
		int[] nums = {3,3,3,2,2,2};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i == 0){
				list.add(nums[i]);
			} else if (list.get(list.size()-1) != nums [i]){
				list.add(nums[i]);
			}				
		}
		
		System.out.println(list.toString());
		
		int answer = 0;
		if (list.size() > nums.length / 2){
			answer = nums.length / 2;
		} else {
			answer = list.size();
		}
		
		System.out.println(answer);
	}
}
