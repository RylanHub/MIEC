package Lab7;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: May 15, 2022 12:47:36 AM	*/

public class TestBasicCircle {

	public static void main(String[] args) {
		
		Scanner TBC = new Scanner(System.in);
		int c1 = TBC.nextInt();
		int c2 = TBC.nextInt();
		int c3 = TBC.nextInt();
		TBC.close();
		
		BasicCircle Circle1 = new BasicCircle(c1);
		BasicCircle Circle2 = new BasicCircle(c2);
		BasicCircle Circle3 = new BasicCircle(c3);
		
		System.out.println("Circle 1 has a radius of "+c1);
		System.out.println("Circle 2 has a radius of "+c2);
		System.out.println("Circle 3 has a radius of "+c3);
		
		System.out.println("Circle 1 has a circumference of "+ Circle1.getCircumference());
		System.out.println("Circle 2 has a circumference of "+ Circle2.getCircumference());
		System.out.println("Circle 3 has a circumference of "+ Circle3.getCircumference());
		
		System.out.println("Circle 1 has an area of "+ Circle1.getArea());
		System.out.println("Circle 2 has an area of "+ Circle2.getArea());
		System.out.println("Circle 3 has an area of "+ Circle3.getArea());
	}

}
