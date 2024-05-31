package chapter4;

import java.util.Scanner;

public class IfExample2 {
		//if 문 예제 2
		//if-else if else 문 으로 나이에 따른 입장료 계산하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요. : ");
		int age = scan.nextInt();
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동 입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("요금은 " + charge + "원 입니다.");

	}

}
