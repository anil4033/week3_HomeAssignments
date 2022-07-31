package week3.day1HomeAsignment.org.student;

import week3.day1HomeAsignments.org.department.Department;

public class Student extends Department{
	
	//studentName(),studentDept(),studentId()
	
	public void studentName() {
		System.out.println("Anil");
	}
	
	public void studentDept() {
		System.out.println("ECE1");
	}
	
	public void studentId() {
		System.out.println("6789");
	}

	public static void main(String[] args) {
		Student st = new Student();
		
		st.studentName();
		st.studentId();
		st.studentDept();
		st.deptName();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		
	}
}
