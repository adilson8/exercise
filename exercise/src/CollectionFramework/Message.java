package CollectionFramework;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Message {
	public String command;
	public String to;
	
//	public Message(String command, String to) {
//		this.command = command;
//		this.to = to;
//	} // @AllArgsConstructor

} // end class
