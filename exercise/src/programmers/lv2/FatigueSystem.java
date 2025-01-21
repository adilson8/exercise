package programmers.lv2;

public class FatigueSystem {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/87946
	public static void main (String[] args) {
		
		// answer = 3;
		int k = 80;
		int[][] dungeons = {{80,20}, {50,40}, {30,10}};
		
		int answer = 0;
		int tmp = k;
		
		boolean[] visited = new boolean[dungeons.length];
		
		for (int i = 0; i < dungeons.length; i++) {
			if (k >= dungeons[i][0]) {			
				visited[i] = true;
				k -= dungeons[i][1];
			} else {
				visited[i] = false;
			}
		}
		
		for (boolean v : visited) {
			System.out.println(v);
		}
		
	}

}
