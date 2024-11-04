package com.studentmgmt;
import java.util.Date;
public class Student {
	private String sid;
	private String firstName;
	private String lastName;
	private String email;
	private Date DOB;
	private String phoneNo;
	private int marks;
	private String gender;
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String sid, String firstName, String lastName, String email, Date dOB, String phoneNo, int marks,
			String gender) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DOB = dOB;
		this.phoneNo = phoneNo;
		this.marks = marks;
		this.gender = gender;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", DOB=" + DOB + ", phoneNo=" + phoneNo + ", marks=" + marks + ", gender=" + gender + "]";
	}
	
}
