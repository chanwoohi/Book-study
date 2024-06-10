package chapter5;

public class Person {
	//Person 클래스 만들기
		String name;
		float height;
		float weight;
		
		//디폴트 생성자
		public Person() {}
		
		public Person(String pname) {
			name = pname;
		}
		public Person(String pname, float pheight, float pweight) {
			name = pname;
			height = pheight;
			weight = pweight;
		}
}
