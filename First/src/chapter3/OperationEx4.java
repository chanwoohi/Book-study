package chapter3;

public class OperationEx4 {
		// 조건 연산자를 사용하여 부모님의 나이 비교하기
	public static void main(String[] args) {
			int fatherAge = 45;
			int motherAge = 47;
			
			String str = (motherAge > fatherAge)? "T" : "F";
				System.out.println(str);
	}

}
