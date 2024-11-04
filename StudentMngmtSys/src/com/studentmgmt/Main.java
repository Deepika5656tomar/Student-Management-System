package com.studentmgmt;
import java.sql.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

	public static void main(String[] args) {
		StudentDaoIntrf dao=new StudentDaoImpl();
		System.out.println("**Welcome to Student management System**\n\n");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your choice:");
			System.out.println("1. Add Student\n" +
					"2. Show all Students\n" +
					"3. Show Student based on id\n"+
					"4. Update the Student\n"+
					"5. Delete the Student\n"+
					"6. Exit from App");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				Student stu=new Student();
				System.out.println("Enter ID:");
				String id=sc.next();
				System.out.println("Enter First name:");
				String fname=sc.next();
				System.out.println("Enter Last name:");
				String lname=sc.next();
				System.out.print("Enter date of birth (yyyy-mm-dd): ");
	            String dateInput = sc.next();
	            Date sqlDate = parseDate(dateInput);	            
	            System.out.println("Enter gender:");
				String gender=sc.next();
				System.out.println("Enter email:");
				String email=sc.next();
				System.out.println("Enter phone number:");
				String phone=sc.next();
				System.out.println("Enter Marks:");
				int marks=sc.nextInt();
				stu.setSid(id);
				stu.setFirstName(fname);
				stu.setLastName(lname);
				stu.setDOB(sqlDate);
				stu.setGender(gender);
				stu.setEmail(email);
				stu.setPhoneNo(phone);
				stu.setMarks(marks);
				dao.createStudent(stu);
				break;
			case 2:
				dao.showAllStudent();
				break;
			case 3:
				System.out.println("Enter id to show the details of the student:");
				String stuid=sc.next();
				dao.showStudentBasedOnId(stuid);
				break;
			case 4:
				System.out.println("Enter id to update the details of the student:");
				String stuid1=sc.next();
				System.out.println("Enter the new firstname of the student:");
				String name1=sc.next();
				dao.updateStudent(stuid1, name1);
				break;
			case 5:
				System.out.println("Enter id to delete the details of the student:");
				String id1=sc.next();
				dao.deleteStudent(id1);
				break;
			case 6:
				System.out.println("Thank you to use the App...");
				System.exit(0);
			default:
				System.out.println("Enter valid choice!");
			}
			
		} while (true);

	}
	private static Date parseDate(String dateInput) {
        try {
            LocalDate localDate = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return Date.valueOf(localDate);  // Convert LocalDate to java.sql.Date
        } catch (DateTimeParseException e) {
            return null;  // Return null if the format is incorrect
        }
    }

}
