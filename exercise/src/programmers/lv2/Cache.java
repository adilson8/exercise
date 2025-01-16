package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Cache {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/17680
	public static int cache (int cacheSize, String[] cities) {
		
		int answer = 0;
		
		if (cacheSize == 0){
			answer = cities.length * 5;
		} else {
			Queue<String> cache = new LinkedList<>();
			for (int i = 0; i < cities.length; i++) {
				// 분기처리해서 중복코드 정리하자				
				if (i == 0) {
					cache.add(cities[i].toUpperCase());
					answer += 5;
				} else if (cache.size() < cacheSize) {
					if (!cache.contains(cities[i].toUpperCase())) {
						if (cache.peek().equals(cities[i].toUpperCase())) {
							cache.poll();
						}
						cache.add(cities[i].toUpperCase());
						answer += 5;
					} else {
						cache.add(cities[i].toUpperCase());
						answer += 1;
					}
				} else {
					if (!cache.contains(cities[i].toUpperCase())) {
						cache.poll();
						cache.add(cities[i].toUpperCase());
						answer += 5;
					} else {
						Object[] cacheArr = cache.toArray();
						cache.clear();
						for (Object ca :cacheArr) {
							if (!cities[i].toUpperCase().equals(String.valueOf(ca))) {
								cache.add(String.valueOf(ca));
							}
						}
						cache.add(cities[i].toUpperCase());
						answer += 1;
					}
				}
			}
		}
		
		return answer;
	}

}
