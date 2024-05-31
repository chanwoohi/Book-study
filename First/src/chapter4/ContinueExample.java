package chapter4;

import java.util.Scanner;

public class ContinueExample {
	//continue 예제 1
	public static void main(String[] args) {
		/* continue 이용하여 1부터 num까지의 홀수 합 구하기 
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 홀수들의 합 : " + sum);
		
		

	}

}
