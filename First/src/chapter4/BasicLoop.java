package chapter4;

public class BasicLoop {
	// 반복문 예제 1
	public static void main(String[] args) {
		/*	1부터 10까지 더하기
		 * */
		int i = 1, num = 11, sum = 0;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
	}

}
