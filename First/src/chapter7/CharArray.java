package chapter7;

public class CharArray {

	public static void main(String[] args) {
		// 알파벳 문자와 아스키 코드 값 출력하기
		char [] alphabet = new char [26];
		char ch = 'A';
		
		for( int i = 0 ; i < alphabet.length ; i++, ch++ ) {
			alphabet[i] = ch;
		}
		
		for( int i = 0 ; i < alphabet.length ; i++) {
			System.out.println(alphabet[i] + ", " + (int)alphabet[i]);
		}

	}

}
