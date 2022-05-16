package exercise;

public interface UserInterface {
	
	// 아래 4가지를 람다로 구현하세요 (최대한 생략해서)
	
	// 1. 덧셈 결과를 콘솔로 출력 
	public abstract int add(int num1, int num2);
	
	// 2. 곱셈 결과를 콘솔로 출력
	public abstract void mul(int num1, int num2);

	// 3. 뺄셈 결과를 콘솔로 출력
	public abstract void sub(int num1, int num2);
	
	// 4. 주어진 정수가 소수인지 판별하라
	// 소수란 1과 자기자신의 숫자로만 나누어 떨어지는 수 (나머지가 0) 
	// %의 결과값이 0이면 나누어 떨어진다는 의미 for loop돌리면 됨
	public abstract boolean isPrimeNumber(int number);

} // end interface
