package CollectionFramework;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode 
@AllArgsConstructor
public class Member { // POJO : Plain Old Java Object
	public String name;
	public int age;
	
//	public Member(String name, int age) {
//		this.name = name;
//		this.age = age;
//	} //@Allargsconstructor

//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//			return member.name.equals(name) && (member.age==age) ;
//		} else {
//			return false;
//		} // if-else
//	} // @EqualsAndHashCode

//	@Override
//	public int hashCode() {
//		return name.hashCode() + age;
//	} // @EqualsAndHashCode

} // end class
