package chapter5;

class Person1{
	String name;
	int age;
	
	Person1(){
		this("이름 없음", 1);
	}
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person1 noName = new Person1 ();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
	}

}
