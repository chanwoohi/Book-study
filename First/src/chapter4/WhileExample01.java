package chapter4;

import java.util.Scanner;

public class WhileExample01 {
		//while 문 예제 1
	public static void main(String[] args) {
		/* while 문 활용하여 1부터 10까지 더하기
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int i = 1;
		int sum = 0;
		int num = scan.nextInt();
	
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("1부터 "+ num + "까지의 합 : " + sum);
		

	}

}
