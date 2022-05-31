package CollectionFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("forever");		
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		// 범위검색 (Range Scan) 수행
		System.out.println("[cherry ~ forever 사이의 단어 검색]");
		
		NavigableSet<String> rangeSet = treeSet.subSet("cherry", true, "forever", true);
		
		for(String word : rangeSet) {
			System.out.println(word);
		} // for
	} // main
	
} // end class
