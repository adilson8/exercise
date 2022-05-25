package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// ArrayList 실험
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		} // for
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		// LinkedList 실험
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		} // for
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
		
	} // main

} // end class



