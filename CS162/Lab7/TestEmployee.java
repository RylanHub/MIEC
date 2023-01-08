package Lab7;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: May 15, 2022 2:08:22 AM	*/

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Tom Daly","Teacher",30000, 1001);
		Employee employee2 = new Employee("Mary Murphy","Developer",45000, 1002);
		Employee employee3 = new Employee();
				
		
		System.out.println("Employee 2 is called "+ employee2.getName()+
				"\nThey are a " +employee2.getJobTitle()+ 
				"\nTheir salary is " + employee2.getSalary()+ 
				"\nTheir Employee ID number is " + employee2.getEmployeeID());
		
		
		Scanner TE = new Scanner(System.in);
		String nameValue = TE.nextLine(); //"Michael Higgins"
		String jobTitleValue = TE.nextLine(); //"President"
		float salaryValue = TE.nextFloat(); //10000f
		TE.close();
		
		
		employee3.setName(nameValue);
		employee3.setJobTitle(jobTitleValue);
		employee3.setSalary(salaryValue);
		
		
		employee1.showEmp();		
		employee2.showEmp();		
		employee3.showEmp();
	
		
		System.out.println(employee1.toString());
		

	}
	
	


}
