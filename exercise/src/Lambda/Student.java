package Lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor

public class Student {
	// 필드
	private String name;
	private int englishScore;
	private int mathScore;
	
	// 생성자
//	public Student(String name, int englishScore, int mathScore) {
//		this.name = name;
//		this.englishScore = englishScore;
//		this.mathScore = mathScore;
//	} // @AllargsConstrunctor로 만들자
	
	// 메소드
//	public String getName() { return name; } // @Getter로 만들자
//	public int getEnglishScore() { return englishScore; } // @Getter로 만들자
//	public int getMathScore() { return mathScore; } // @Getter로 만들자

} // end class
