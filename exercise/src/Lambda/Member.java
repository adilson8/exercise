package Lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Member {
	private String name;
	private String id;
	private Address address;
	
//	public Member(String name, String id, Address address) {
//		this.name = name;
//		this.id = id;
//		this.address = address;
//	} // @AllArgsConstructor

//	public String getName() { return name; }         // @Getter
//	public String getId() { return id; }             // @Getter
//	public Address getAddress() { return address; }  // @Getter

}  // end class
