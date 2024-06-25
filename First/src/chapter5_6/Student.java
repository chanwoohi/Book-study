package chapter5_6;

public class Student {
	//Student 클래스 만들기
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/*public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}*/
	
	public String getStudentName() {
		return studentName;
	}
	
	/*public void setStudentName(String name) {
		studentName = name;
	}*/
	public static void main(String[] args) {
		Student studentAhn = new Student( );
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
