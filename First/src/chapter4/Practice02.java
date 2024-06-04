package chapter4;

public class Practice02 {
	// 연습문제 2
	public static void main(String[] args) {
		//	구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요.
		int i, j, result;
		for( i = 1 ; i <= 9 ; i++ ) {
			if( i % 2 == 0 ) {
				for( j = 1 ; j <= 9 ; j++ ) {
					result = i * j;
					System.out.println( i + " X " + j + " = " + result );
				}
			}
			else {
				continue;
			}
		}

	}

}
