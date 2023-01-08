package Lab3;

import java.util.Scanner;

public class StringAcceptance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input:");

		Scanner Rylan = new Scanner(System.in);
		String r = Rylan.next();
		if (SA(r) == true) {
			System.out.println("true");
		} else
			System.out.println("false");

	}
	
	public static boolean SA(String r) {
		if (r.matches("[01]*")) {
			return true;
		} else
			return false;

	}

}
