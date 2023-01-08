package Lab8;

/*  @Author: LinRui
	@Time: May 22, 2022 12:28:17 PM	*/

public class Tester {

	public static void main(String[] args) {
		
		SUV suv1 = new SUV();
		SUV suv2 = new SUV(2,"Nissan","4");
		Car car1 = new Car(3,"Ford",true);
		
		suv1.setBrand("BMW");
		suv1.setDrive("rear");
		suv1.setNoOfDoors(5);
		suv1.printDetails();
		System.out.println(suv1.getDrive());
		
		car1.setNoOfDoors(5);
		car1.printDetails();
		System.out.println(car1.isSportsModel());
	}
}
