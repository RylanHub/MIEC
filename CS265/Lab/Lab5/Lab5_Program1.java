package Lab5;

public class Lab5_Program1 {

	public int taxRelief(int age, boolean single) {
		int taxRelief;
		if (age < 18)
			taxRelief = 0;
		else if (single) {
			if (age <= 55)
				taxRelief = 800;
			else
				taxRelief = 1600;
		} else {
			if (age > 55)
				taxRelief = 1600;
			else
				taxRelief = 3200;
		}
		return taxRelief;
	}

}
