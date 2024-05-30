package chapter3;

public class OperationEx3 {
	//단락 회로 평가 실습하기
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) &&((i = i + 2) < 20);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		/* 논리 곱 ( && ) 에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i 값은 그대로
		 * 논리 합 ( || ) 에서 앞 항이 참이면 뒷 항이 실행되지 않아 i 값은 그대로
		 * */
	}

}
