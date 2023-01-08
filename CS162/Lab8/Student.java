package Lab8;

/*  @Author: LinRui
	@Time: May 22, 2022 9:29:32 AM	*/

public class Student {
	private String name;
	private String course;
	private int studentID;
	
	public Student() {
		name = "Andrew Trimble";
		course = "Media Studies";
		studentID = 1001;		
	}
	
	public Student(String name,String course, int studentID) {
		this.name = name;
		this.course = course;
		this.studentID = studentID;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getStudentID() {
		return studentID;
	}

	public void showStudent() {
		System.out.println("Name: " + name);
		System.out.println("Course: " + course);
		System.out.println("StudentID: " + studentID);
		System.out.println("---");
		
		
		
	}
	
	
}
