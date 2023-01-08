package Lab2;

public class Lab2_Program1 {

	public double discount(int purchase) {

		double dc;

		if (purchase <= 0)
			dc = 0.0;
		else if ((purchase >= 1) || (purchase <= 50))
			dc = 0.0;
		else if (purchase <= 200)
			dc = 0.05;
		else if (purchase <= 500)
			dc = 0.1;
		else
			dc = 0.15;

		return dc;
	}
}

