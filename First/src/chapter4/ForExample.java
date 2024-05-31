package chapter4;

import java.util.Scanner;

public class ForExample {
	// for 문 예제 1
	public static void main(String[] args) {
		/* for 문을 이용해서 1부터 num까지의 합 구하기
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int sum = 0; 
		for(int i = 1; i <= num ; i++ ) {
		    sum	+= i;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
	}

}
