package Lab4;

import java.util.Scanner;

public class ArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkArray(fillArray(), 0));
	}

	public static int[] fillArray() {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int[] filledArray = new int[x];

		for (int i = 0; i < filledArray.length; i++) {
			filledArray[i] = scan.nextInt();
		}
		scan.close();

		return filledArray;

	}

	public static boolean checkArray(int[] CA, int index) {

		// base case
		if (index == CA.length - 1) {
			return false;
		}

		if (CA[index] * 10 == CA[index + 1]) {
			return true;
		} else {
			return checkArray(CA, index + 1);
		}

	}

}
