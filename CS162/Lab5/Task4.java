package Lab5;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: Apr 17, 2022 2:11:14 AM	*/

public class Task4 {

	public static void main(String[] args) {
		Scanner pT = new Scanner(System.in);
		int base = pT.nextInt();
		int power = pT.nextInt();
		System.out.println(powerTo(base, power));
		pT.close();

	}

	public static int powerTo(int base, int power) {
		
//		x^y=(x^2)^(y/2)

		if (power == 1) {
			return base;
		}
		if (power % 2 == 1) {
			return base * powerTo(base * base, power / 2);
		}
		return powerTo(base * base, power / 2);
	}

}
