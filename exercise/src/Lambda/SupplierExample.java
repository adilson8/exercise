package Lambda;

import java.util.function.IntSupplier;

public class SupplierExample {
	
	public static void main(String[] args) {
		// int getAsInt();
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		}; // 람다식을 이용한 익명구현객체 생성 (다형성1)
		
		int num = intSupplier.getAsInt(); // 추상메소드 호출 (다형성2)
		System.out.println("눈의 수: " + num); 
	} // main

} // end class
