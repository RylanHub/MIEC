package Lab8;

/*  @Author: LinRui
	@Time: May 22, 2022 12:27:27 PM	*/

public class Car extends Vehicle {
	private boolean sportsModel;

	public Car() {
		super();
		sportsModel = false;
	}

	public Car(int noOfDoors, String brand, boolean sportsModel) {
		super(noOfDoors, brand);
		this.sportsModel = sportsModel;
	}

	public boolean isSportsModel() {
		if (sportsModel == true) {
			return true;
		} else {
			return false;
		}
	}

}
