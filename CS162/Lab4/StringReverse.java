package Lab4;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner SR = new Scanner(System.in);
		String R = SR.nextLine();
		SR.close();
		System.out.println(reverseRecursive(R, R.length() - 1));

	}

	public static String reverseRecursive(String R, int a) {

		if (a == 0) {
			return "" + R.charAt(0);
		}
		return "" + R.charAt(a) + reverseRecursive(R, a - 1);

	}

}
