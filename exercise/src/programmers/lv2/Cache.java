package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Cache {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/17680
	public static void main (String[] args) {
		
//		 cachesize가 2고 cache = ['NewYork', 'Seoul'] <- 캐시에 이미 두 개의 도시가 들어가 있으며 
//		 새롭게 'Jeju' 라는 도시명이 추가(append)될 때 가장 오래된 'NewYork'을 지우고 'Jeju'를 넣어 
//		 LRU 알고리즘에 따른 결과는 cache = ['Seoul', 'Jeju'] 가 된다.
//		 그리고 cache에 없는 도시명이 추가될 때 cache miss이고 실행시간은 5이다.
//		 
//		 cache = ['NewYork', 'Seoul'] 에 'newyork'이 추가 된다면 캐시는 대소문자를 구분하지 않기 때문에 
//		 cache hit이고 실행시간은 1이 되며 NewYork은 최신화가 되어 우선순위로 당겨진다(cache = ['Seoul', 'NewYork'])
		
//		// answer = 50;
//		int cacheSize = 3; 
//		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//		
//		// answer = 21;
//		int cacheSize = 3; 
//		String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//		
//		// answer = 60;
//		int cacheSize = 2; 
//		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
//		
//		// answer = 52;
//		int cacheSize = 5; 
//		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
//		
//		// answer = 16;
//		int cacheSize = 2; 
//		String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
//		
//		// answer = 25;
//		int cacheSize = 0; 
//		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//		
		// answer = 22;
		int cacheSize = 3; 
		String[] cities = {"a", "b", "a", "c", "d", "a"};
		
		int answer = 0;
		
		if (cacheSize == 0){
			answer = cities.length * 5;
		} else {
			Queue<String> cache = new LinkedList<>();
			for (int i = 0; i < cities.length; i++) {
				if (!cache.contains(cities[i].toUpperCase())) {
					if (i >= cacheSize) {
						cache.poll();							
					}
					cache.add(cities[i].toUpperCase());
					answer += 5;
				} else {
					cache.poll();
					cache.add(cities[i].toUpperCase());
					answer += 1;
				}		
			}			
		}
		
		System.out.println(answer);

	}

}
