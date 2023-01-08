package Lab4;

import java.util.Scanner;

public class MathsFunction {

	public static void main(String[] args) {

		Scanner MF = new Scanner(System.in);
		int n = MF.nextInt();
		MF.close();

		System.out.println(q2Iterative(n));
		System.out.println(q2Recursive(n));

	}

	public static int q2Iterative(int n) {
		int aSum = 2;
		if (n == 1) {
			return aSum;
		} else {
			for (int i = 2; i <= n ; i++) {
				aSum = 4*aSum - 3 * i;
			}
			return aSum;
		}
	}

	public static int q2Recursive(int n) {
		int a = 2;
		if (n == 1) {
			return a;
		} else {
			return 4 * q2Recursive(n - 1) - 3 * n;
		}

	}

}
