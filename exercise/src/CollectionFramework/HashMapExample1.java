package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import lombok.Cleanup;

public class HashMapExample1 {
	public static void main(String[] args) {
//		@Cleanup("clear")
		// 1. Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 2. 요소 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 얘로 변경됨
		System.out.println("총 Entry 수: " + map.size());
		System.out.println(map);
		
		// 3. 원하는 요소 객체 찾기		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 4. 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		
//		while(keyIterator.hasNext()) {
//		  String key = keyIterator.next();
//		  Integer value = map.get(key);
//		  System.out.println("\t" + key + " : " + value);
//		} // while -> enhanced for로 바꿔보자		
		
		for ( String key : keySet ) {
			int value = map.get(key);
			System.out.println("(" + key + "," + value + ")");
		} // enhanced for
		System.out.println();	
		
		// 5. 요소 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		// 6. 요소 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
//		while(entryIterator.hasNext()) {
//		  Map.Entry<String, Integer> entry = entryIterator.next();
//		  String key = entry.getKey();
//		  Integer value = entry.getValue();
//		  System.out.println("\t" + key + " : " + value);
//		} // while -> enhanced for
		
		for ( Map.Entry<String, Integer> entry : entrySet ) {
			String key = entry.getKey();
			int val = entry.getValue();
			System.out.println("(" + key + "," + val + ")");
		} // enhanced for
		System.out.println();
		
		// 7. 요소 객체 전체 삭제
//		map.clear(); -> @Cleanup("clear")
		System.out.println("총 Entry 수: " + map.size());
		
		// 8. 요소객체의 값만 반환 받아서 출력
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		for ( int value : values) {
			System.out.println(value);
		} // enhanced for
		
	} // main
	
} // end class

