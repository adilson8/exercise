package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class WordChainGame {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/12981
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<Integer> answerList = new ArrayList<>();

        char lastLetter = 0;
        char firstLetter = 0;
        char compare = 0;

        outerFor:
        for(int i = 0; i < words.length; i++){
            answerList.add(((i+1) % n) == 0 ? n : (i+1) % n);
            answerList.add((i/n) + 1);

            firstLetter = words[i].charAt(0);
            lastLetter = words[i].charAt(words[i].length()-1);

            if (i != 0){
                for (int j = 0; j < i; j++){
                    if (words[j].equals(words[i])){
                        // 중복단어
                        break outerFor;
                    }
                }               

                if (firstLetter == compare){
                    compare = lastLetter;
                } else {
                    // 끝말잇기 틀림
                    break;
                }
            } else {
                compare = lastLetter;
            }

            answerList.clear();
        }

        if (answerList.size()==0){
            answerList.add(0);
            answerList.add(0);
        }

        for (int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
