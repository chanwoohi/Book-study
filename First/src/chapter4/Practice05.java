package chapter4;

public class Practice05 {
	//연습문제 5
	public static void main(String[] args) {
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
		for( int i = 2 ; i <= 4 ; i++) {
			for( j = 1 ; j >= 4 - i ; j-- ) {
				System.out.print(" ");
			}
			for( j = 1 ; j >= 2 * i - 1 ; j-- ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
// 수정 필요
	}

}
