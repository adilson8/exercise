package sec06.exam01_stack;

import java.util.Stack;

public class StackExample {

	// LIFO (후입선출) 형식의 자료구조 테스트
	public static void main(String[] args) {
		// 스택에 저장할 요소의 구체타입으로 Coin 타입 지정
		Stack<Coin> coinBox = new Stack<>();
		
		// 스택에 새로운 요소객체(Coin) 추가
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 스택에 모든 요소를 하나씩 끄집어내면서 (pop) 
		// 스택이 빌 떄까지 동전을 꺼내기 (isEmpty getter 이용)
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();// pop 메소드로 꺼낸 동전 요소
			
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		} // while
	} // main

} // end class
 