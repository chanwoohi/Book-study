package chapter4;

public class NestedLoop {
	// 중첩 반복문 예제
	public static void main(String[] args) {
		/* 중첩 반복문을 이용해 구구단 
		 * 2~9단 출력하기
		 * */
		for(int i = 2 ; i <= 9 ; i++ ) {
			for(int j = 1 ; j <= 9 ; j++ ) {
				System.out.println(i + " X " + j + " = " + (i * j ));
			}
		}

	}

}
