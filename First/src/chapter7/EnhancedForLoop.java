package chapter7;

public class EnhancedForLoop {
	//향상된 for문 사용하기
	public static void main(String[] args) {
		String [] strArray = {"java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray ) {
			System.out.println(lang);
		}
		
	}

}
