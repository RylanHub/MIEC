package Lab1;

/*  @Author: LinRui
	@Time: Sep 18, 2022 2:14:21 PM	*/

public class Lab1_Program1_Fix {
	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 5;
		if (sportsEquipment || musicEquipment)
			fee = 10;
		if (sportsEquipment && musicEquipment)
			fee = 20;
		return fee;
	}

}