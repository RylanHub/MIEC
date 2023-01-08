package Lab2;

public class Lab2_Program3_Fix {

	public int carInsurance(int age, char gender, boolean married) {

		int premium;
		// the value of premium is error
		if ((age < 16) || (age > 65) || (gender != 'M' && gender != 'F'))
			premium = 0;
		else {
			premium = 500;
			// change || to &&
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

