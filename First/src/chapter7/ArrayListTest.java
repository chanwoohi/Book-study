package chapter7;

import java.util.ArrayList;

public class ArrayListTest {
	//ArrayList 클래스 사용하기

	public static void main(String[] args) {
		//ArrayList  선언
		ArrayList<Book> library = new ArrayList<Book>();
		
		//add() 메서드로 요소 값 추가
		library.add(new Book ("태백산맥", "조정래"));
		library.add(new Book ("노인과 바다", "해밍웨이"));
		library.add(new Book ("어떻게 살 것인가 ", "유시민"));
		library.add(new Book ("토지", "박경리"));

		// 배열에 추가된 요소 개수만큼 출력
		for(int i = 0 ; i < library.size() ; i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for 문 사용 ===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
