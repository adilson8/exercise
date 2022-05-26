package CollectionFramework;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Student {
	public int sno;
	public String name;
	
//	public Student(int sno, String name) {
//		this.sno = sno;
//		this.name = name;
//	} // @AllArgsConstructor

//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			return (sno==student.sno) && (name.equals(student.name)) ;
//		} else {
//			return false;
//		}
//	} // equals -> @EqualsAndHashCode
//
//	public int hashCode() {
//		return sno + name.hashCode();
//	} // hashCode -> @EqualsAndHashCode
	
}

