package Lab7;

/*  @Author: LinRui
	@Time: May 15, 2022 2:08:00 AM	*/

public class Employee {
	
	private String name;
	private String jobTitle;
	private float salary;
	private int employeeID;
	
	//Default Constructor	
	public Employee() {
		name = "Michael Higgins"; 
		jobTitle = "President";
		salary = 19000.0f;
		employeeID =  1003;	
	}
	
	//General Constructor
	public Employee(String name, String jobTitle, float salary, int employeeID) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.employeeID = employeeID;
	
	}
	
	public String getName() {
		return name;		
	}
	
	public String getJobTitle() {
		return jobTitle;	
	}
	
	
	public float getSalary() {
		return salary;	
	}
	
	public int getEmployeeID() {
		return employeeID;	
	}
	
	public void setName(String myName) {
		name = myName;
		
	}
	
	public void setJobTitle(String myTitle) {
		jobTitle = myTitle;
		
	}
	
	public void setSalary(Float mySalary) {
		if(mySalary>=19000) {
		salary = mySalary;
		}else {
			System.out.println("Entered salary of " + mySalary +" is too low. "
					+ "Salary set at minimum wage of ву19000.0");
		}
	}
	
		
	
	public void showEmp() {
		System.out.println("EMPLOYEE RECORD");
		System.out.println("NAME: " + name);
		System.out.println("JOB TITLE: " + jobTitle);
		System.out.println("CURRENT SALARY: " + salary);
		System.out.println("EMPLOYEE ID: " + employeeID);
		
	}
	
	public String toString() {	
		String details = "NAME: "+ name;
		details += "\nJOB TITLE: " + jobTitle;
		details += "\nCURRENT SALARY: " + salary;
		details += "\nEMPLOYEE ID: " + employeeID;
		return details;		
	}
	
	
	
	
	
	

}
