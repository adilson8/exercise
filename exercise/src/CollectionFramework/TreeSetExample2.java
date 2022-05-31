package CollectionFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87); // auto-boxing
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 내림차순으로 정리결과를 Set으로 변환해주는 메소드(descendingSet) 호출
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		} // enhanced for
		
		System.out.println();		
		
		// 오름차순으로 정렬결과를 Set으로 반환해주는 메소드(descendingSet) 호출
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		} // enhanced for
	} // main
	
} // end class
