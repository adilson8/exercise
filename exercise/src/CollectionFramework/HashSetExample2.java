package CollectionFramework;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		// 객체를 두번 생성해도 필드가 모두 같으면 같은 객체임
		// 오버라이드 한  equals()와 hashcode()로 중복은 걸러진다
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
	} // main

} // end class



