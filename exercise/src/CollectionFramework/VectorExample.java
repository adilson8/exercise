package CollectionFramework;

import java.util.List;
import java.util.Vector;

import lombok.Cleanup;

public class VectorExample {
	
	public static void main(String[] args) {
		@Cleanup("clear")
		List<Board> list = new Vector<Board>();
	
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		System.out.println(list);
		
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		} // for
		
		// 자원객체 썼으면 닫자 -> try-with-resources로 닫아도 된다
		// try-with-resources은 자원객체가 AutoCloseable 인터페이스를 구현하고 있어야한다.
		// 속 편하게 @Cleanup으로 닫자
		// @Cleanup("clear")
		//list.clear();
		//list = null;
		
	} // main
	
} // end class

