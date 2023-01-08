package Lab7;

/*  @Author: LinRui
	@Time: May 15, 2022 12:57:37 AM	*/

public class BasicCircle {
	
	//Attributes 
	private int radius;


	//Default Constructor	
	public BasicCircle(){
		radius = 1;		
	}
	
	//General Constructor
	public BasicCircle(int radius) {
		this.radius = radius;
		
	}
	
	//Functionality
	public double getCircumference() {	
		double circumference = Math.PI*2*radius;
		circumference =Math.round(circumference * 100.0) / 100.0;
		return circumference;
	}
	
	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		area = Math.round(area* 100.0) / 100.0;
		return area;

	}
	
	

}
