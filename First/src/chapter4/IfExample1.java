package chapter4;

import java.util.Scanner;

public class IfExample1 {
		/*  if 문 예제 1
		 *  나이에 따라 다른 문장 출력하기
		 * */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요. : ");
		int age = scan.nextInt();
		
		
		if(age >= 8 && age <= 19) {
			System.out.println("학교에 다닙니다.");			
		}
		else {
			System.out.println("학교에 다니지 않습니다.");	
		}
		

	}

}
