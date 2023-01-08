package Lab3;

/*  @Author: LinRui
	@Time: Oct 30, 2022 4:05:29 PM	*/

public class Lab3_Program1_Fix {
	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 5;

		if (sportsEquipment && musicEquipment)
			fee = 20;
		else if (sportsEquipment || musicEquipment)
			fee = 10;

		return fee;
	}
}
