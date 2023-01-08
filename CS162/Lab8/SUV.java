package Lab8;

/*  @Author: LinRui
	@Time: May 22, 2022 12:27:49 PM	*/

public class SUV extends Vehicle {

	private String wheelDrive;
	
	public SUV() {
		super();
	}

	public SUV(int noOfDoors, String brand, String wheelDrive) {
		super(noOfDoors, brand);
		this.wheelDrive = wheelDrive;
	}

	public String getDrive() {
		return wheelDrive;
	}

	public void setDrive(String wheelDrive) {
		this.wheelDrive = wheelDrive;
	}
	


}
