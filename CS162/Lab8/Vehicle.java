package Lab8;

/*  @Author: LinRui
	@Time: May 22, 2022 11:56:52 AM	*/

public class Vehicle {

	private int noOfDoors;
	private String brand;

	public Vehicle() {
		System.out.println("Defalut Constructor of Vehicle called");
	}

	public Vehicle(int noOfDoors, String brand) {
		System.out.println("General Constructor of Vehicle called");
		this.noOfDoors = noOfDoors;
		this.brand = brand;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void printDetails() {
		System.out.println(noOfDoors);
		System.out.println(brand);
	}

}
