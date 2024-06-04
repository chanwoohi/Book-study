package chapter4;

public class Practice04 {
	//연습문제 4
	public static void main(String[] args) {
		// 별찍기
		int j ;
		for( int i = 1 ; i <= 4 ; i++) {
			for( j = 1 ; j <= 4 - i ; j++ ) {
				System.out.print(" ");
			}
			for( j = 1 ; j <= 2 * i - 1 ; j ++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
