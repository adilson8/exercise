package Lambda;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	
	public static void main(String[] args) {
		// void accept(T t);
		Consumer<Member> consumerA = m -> System.out.println("consumerA: " + m.getName()); 
		Consumer<Member> consumerB = m -> System.out.println("consumerB: " + m.getId()); 

		// Consumer<Member> java.util.function.Consumer.andThen(Consumer<? super Member> after)
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
//		Member member = new Member("홍길동", "hong", null);
//		consumerAB.accept(member);
	} // main
	
} // end class

