package Lab3;

/*  @Author: LinRui
	@Time: Oct 30, 2022 3:22:41 PM	*/

public class Lab3_Program1 {
	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 25;

		if (sportsEquipment && musicEquipment)
			fee = 20;
		else if (sportsEquipment || musicEquipment)
			fee = 10;

		return fee;
	}
}
