package Lab5;

public class Lab5_Program2_Fix {
	public int phoneInsurance(int age, char OS) {
		int p;
		if ((age < 16) || (age > 99) || (OS != 'I' && OS != 'A' && OS != 'W'))
			p = 0;
		else {
			p = 50;
			if ((age < 25) && (OS == 'I'))
				p += 25;
			else {
				if ((age > 40) && (age <= 60) && OS == 'A')
					p -= 10;
				if ((age >= 61) && (age <= 65))
					p -= 5;
			}
		}
		return p;
	}

}
