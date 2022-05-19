package exercise;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		// void accept(T t);
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("Java"); // 메소드 호출
		
		// void accept(T t, U u);
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("Java", "8"); // 메소드 호출
		
		// void accept(double value);
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0); // 메소드 호출
		
		// void accept(T t, int value);
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8); // 메소드 호출
	
	} // main
	
} // end class
