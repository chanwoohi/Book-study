package chapter7;

import java.util.ArrayList;

public class StudentArrayList {
	// 나혼자 코딩 ArrayList
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("1001", "James"));
		list.add(new Student("1002", "Tomas"));
		list.add(new Student("1003", "Edward"));

		for(Student student : list) {
			student.showStudentInfo();
		}
	}

}
