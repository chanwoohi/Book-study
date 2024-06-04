package chapter4;

public class Practice03 {
	// 연습문제 3
	public static void main(String[] args) {
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
		int i, j, result;
		for( i = 1 ; i <= 9 ; i++ ) {
			for( j = 1 ; j <= 9 ; j++ ) {
				if( i >= j ) {
					result = i * j;
					System.out.println( i + " X " + j + " = " + result );
				}
			}
		}
	}

}
