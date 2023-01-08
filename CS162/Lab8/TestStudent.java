package Lab8;

import java.util.Scanner;

import Lab8.Student;

/*  @Author: LinRui
	@Time: May 22, 2022 9:40:22 AM	*/

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner TS = new Scanner(System.in);
			
		Student[] student = new Student[3];
		
		for(int i = 0; i<student.length;i++) {
			System.out.print("Name: ");
			String name = TS.nextLine();
			System.out.print("Course: ");
			String course = TS.nextLine();
			System.out.print("studentID: ");
			int studentID = Integer.parseInt(TS.nextLine());
			student[i] = new Student(name,course,studentID);
		}
		
		TS.close();
		
		for(int i = 0; i<student.length;i++) {
			student[i].showStudent();
		}
		
		student[0].setCourse("CSSE");
		student[0].showStudent();
		
		student[2].setName("Louise Johnson");
		System.out.println(student[2].getName());
		
	}

}
