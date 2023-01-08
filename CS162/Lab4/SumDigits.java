package Lab4;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {

		Scanner SR = new Scanner(System.in);
		String R = SR.nextLine();
		SR.close();
		System.out.println(recursiveSum(R, 0));

	}

	public static int recursiveSum(String R, int a) {
		int sum = 0;

		if (a == R.length()) {
			return sum;
		}

		int d = R.charAt(a) - '0';
		sum = sum + d;
		return d + recursiveSum(R, a + 1);
	}
}
