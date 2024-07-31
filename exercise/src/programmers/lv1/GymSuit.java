package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class GymSuit {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/42862
	public int solution(int n, int[] lost, int[] reserve) {
        // 여벌 가져온 학생이 도난당한 경우 처리
        // 리스트로 변환
        ArrayList<Integer> lostList = new ArrayList<>();
        ArrayList<Integer> reserveList = new ArrayList<>();
        for (int l : lost) lostList.add(l);     
        for (int r : reserve) reserveList.add(r);

        // 리스트 정렬
        Collections.sort(lostList);
        Collections.sort(reserveList);

        // 겹치는 숫자들을 제외
        ArrayList<Integer> newLostList = new ArrayList<>(lostList);
        ArrayList<Integer> newReserveList = new ArrayList<>(reserveList);
        newLostList.removeAll(reserveList);
        newReserveList.removeAll(lostList);

        // 새로운 배열로 변환
        int[] newLost = newLostList.stream().mapToInt(i -> i).toArray();
        int[] newReserve = newReserveList.stream().mapToInt(i -> i).toArray();

        // 여벌 가져온 학생이 도난당한 경우는 케이스에서 제외하고 count 시작
        int answer = n;
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < newLost.length; i++){
            for (int j = 0; j < newReserve.length; j++){
                if(newLost[i] == newReserve[j]-1
                        || newLost[i] == newReserve[j]+1){
                    // 빌려주기 성공
                    newReserve[j] = -1;
                    flag = true;
                    break;
                }
            }

            if(flag){
                // 빌리기 성공
                newLost[i] = -1;
                flag = false;
            }
        }

        for (int l : newLost){
            if (l != -1){
                // 못 빌린 경우 count
                count++;
            }
        }

        answer -= count;

        return answer;
    }

}
