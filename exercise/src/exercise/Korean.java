package exercise;


public class Korean {	
	// 1. 필드 : (1)고유속성 (2)상태 (3)부품
	String nation = "대한민국";
	String name;
	String ssn;
	
	// this 키워드 : 클래스에서 생성한 인스턴스(객체)의 주소를 저장!
	//               해당 클래스 내부에서만 사용가능!                 
	public Korean (String name, String ssn) {
		System.out.println("Korean::constructor invoked.");

		// 매개변수와 필드명 같은 경우 this 사용
		this.name = name;
		this.ssn = ssn;
		this.nation = "Korea";
	} // 생성자(매개변수가 있음) != 기본 생성자 (매개변수가 없음)

} // end class