package com.studentmgmt;

public interface StudentDaoIntrf {
	public void createStudent(Student stu);
	public void showAllStudent();
	public void showStudentBasedOnId(String stuid);
	public void updateStudent(String id, String fname);
	public void deleteStudent(String id);


}
