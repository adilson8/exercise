package programmers.lv2;

public class FatigueSystem {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/87946
	public static void main (String[] args) {
		
		// answer = 3;
		int k = 80;
		int[][] dungeons = {{80,20}, {50,40}, {30,10}};
		
		int answer = 0;
//		int tmp = k;
		
		boolean[] visited = new boolean[dungeons.length];
		answer = visitDungeon(k, dungeons, visited, answer);

		System.out.println(answer);
	}
	
	public static int visitDungeon(int k, int[][]dungeons, boolean[] visited, int answer) {
		for (int i = 0; i < dungeons.length; i++) {
			if (!visited[i] && k >= dungeons[i][0]) {			
				visited[i] = true;
				answer++;
				k -= dungeons[i][1];
				visitDungeon(k, dungeons, visited, answer);
			} else if (!visited[i]) {
				visited[i] = false;
			}
		}
		
		for (boolean v : visited) {
			System.out.println(v);
		}
		
		return answer;
	}

}
