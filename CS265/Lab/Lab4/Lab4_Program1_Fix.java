package Lab4;

public class Lab4_Program1_Fix {

	public int carInsurance(int age, char gender, boolean married) {

		int premium;
		if ((age < 16) || (age > 65) || (gender != 'M' && gender != 'F'))
			premium = 0;
		else {
			premium = 500;
			if ((age < 25) && (gender == 'M') && (!married))
				premium += 1500;
			else {

				if (married || gender == 'F')
					premium -= 200;
				if ((age >= 45) && (age <= 65))
					premium -= 100;
			}
		}
		return premium;
	}

}
