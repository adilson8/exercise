package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42840
	public int[] solution(int[] answers) {
        List<Integer> supo1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));        
        List<Integer> supo2 = new ArrayList<>(Arrays.asList(2,1,2,3,2,4,2,5));      
        List<Integer> supo3 = new ArrayList<>(Arrays.asList(3,3,1,1,2,2,4,4,5,5));

        List<Integer> supo1long = new ArrayList<>();        
        List<Integer> supo2long = new ArrayList<>();        
        List<Integer> supo3long = new ArrayList<>();        

        for (int i = 0; i < 10000/5; i++) {
            supo1long.addAll(supo1);
        }

        for (int i = 0; i < 10000/8; i++) {
            supo2long.addAll(supo2);
        }

        for (int i = 0; i < 10000/10; i++) {
            supo3long.addAll(supo3);
        }

        int supo1score = 0;
        int supo2score = 0;
        int supo3score = 0;

        for (int i = 0; i < answers.length; i++){
            if (answers[i] == supo1long.get(i)) { supo1score++; }               
            if (answers[i] == supo2long.get(i)) { supo2score++; }               
            if (answers[i] == supo3long.get(i)) { supo3score++; }
        }

        List<Integer> answerList = new ArrayList<>();
        if (supo1score == supo2score && supo2score == supo3score) {
            answerList.add(1);
            answerList.add(2);
            answerList.add(3);
        } else if (supo1score == supo2score) {
            if (supo1score > supo3score) {
                answerList.add(1);
                answerList.add(2);
            } else {
                answerList.add(3);
            }
        } else if (supo1score == supo3score) {
            if (supo1score > supo2score) {
                answerList.add(1);
                answerList.add(3);
            } else {
                answerList.add(2);
            }
        } else if (supo2score == supo3score) {
            if (supo1score > supo2score) {
                answerList.add(1);
            } else {
                answerList.add(2);
                answerList.add(3);
            }
        } else {
            if (supo1score > supo2score) {
                if (supo1score > supo3score) {
                    answerList.add(1);
                } else {
                    answerList.add(3);
                }
            } else {
                if (supo2score > supo3score) {
                    answerList.add(2);
                } else {
                    answerList.add(3);
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

}
