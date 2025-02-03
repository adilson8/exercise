package programmers.lv2;

public class FatigueSystem {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/87946
	public static int main (int k, int[][] dungeons) {		
		int answer = 0;
		
		boolean[] visited = new boolean[dungeons.length];
		answer = visitDungeon(k, dungeons, visited, 0);
		
		return answer;
	}
	
	public static int visitDungeon(int k, int[][]dungeons, boolean[] visited, int count) {
		int maxCount = count;
		
		for (int i = 0; i < dungeons.length; i++) {
			if (!visited[i] && k >= dungeons[i][0]) {			
				visited[i] = true;
				int nextCount = visitDungeon(k - dungeons[i][1], dungeons, visited, count+1);
                maxCount = Math.max(maxCount, nextCount);
                visited[i] = false;
			}
		}
		
		return maxCount;
	}

}
