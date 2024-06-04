package chapter4;

import java.util.Scanner;

//연습문제 1
public class Practice01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Operator를 입력하세요 : ");
		char operator = scan.next().charAt(0);
		int sum;
		
		if(operator == '+' ) {
			sum = num1 + num2;
		}
		else if(operator == '-' ) {
			sum = num1 - num2;
		}
		else if(operator == '*' ) {
			sum = num1 * num2;
		}
		else {
			sum = num1 / num2;
		}
		System.out.println( "" + num1 +" "+ operator + " " + num2 + " = " + sum);
		
		System.out.println();
		
		// switch-case 문 이용하기
		switch(operator){
		case '+' :
			sum = num1 + num2;
			break;
		case '-' :
			sum = num1 - num2;
			break;
		case '*' :
			sum = num1 * num2;
			break;
		default :
			sum = num1 / num2;
		}
		System.out.println( "" + num1 +" "+ operator + " " + num2 + " = " + sum);

	}
}
