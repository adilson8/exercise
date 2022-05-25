package CollectionFramework;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // 다형성1
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		System.out.println(list);
		

		int size = list.size();
		System.out.println("총 객체수: " + size);		
		
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		

		for(int i=0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		} // for
		
		
		for ( String str : list) {
			System.out.println(str);
		}// enhanced for (인덱스 번호 필요 없을 경우에 이거 쓰자)

		
		list.remove(2);			 // 2번 인덱스 Database 삭제
		list.remove(2);			 // 당겨진 2번 인덱스 Servlet/JSP 삭제
		list.remove("iBATIS");	 
		System.out.println(list);
		
		for(int i=0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		} // for
		
		// List 다 쓰면 자원 해제 시키자
		list.clear();
		list = null;
	
	} // main

} // end class

