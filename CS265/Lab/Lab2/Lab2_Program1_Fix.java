package Lab2;

public class Lab2_Program1_Fix {

	public double discount(int purchase) {

		double dc;

		if (purchase <= 0)
			dc = 0.0;

		// A Fault to use "||" and change it to "&&"
		else if ((purchase >= 1) && (purchase <= 50))
			dc = 0.0;

		// The domain is incomplete
		else if ((purchase > 50) && (purchase <= 200))
			dc = 0.05;

		else if ((purchase > 200) && (purchase <= 500))
			dc = 0.1;
		else
			dc = 0.15;

		return dc;
	}

}
