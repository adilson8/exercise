package CollectionFramework;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		
		for(String name: list1) {
			System.out.println(name);
		} // enhanced for
		
		// 기본타입의 값을 List 컬렉션으로 관리하려면 Wrapper Type 사용하자
		List<Integer> list2 = Arrays.asList(1, 2, 3);  // auto-boxing
		
		for(int value : list2) {
			System.out.println(value);
		} // enhanced for
	} // main

} // end class

