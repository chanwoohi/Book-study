package chapter7;

import java.util.ArrayList;

//Student2 클래스 구현하기
public class Student2 {
	// Student 클래스의 멤버 변수
	int StudentID;
	String studentName;
	ArrayList<Subject> subjectList; //ArrayList 선언하기
	
	//생성자
	public Student2(int studentID, String studentName) {
		this.StudentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0 ;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목"
					+ "성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
}
