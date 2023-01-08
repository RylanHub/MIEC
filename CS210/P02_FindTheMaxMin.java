package Lab;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: Oct 9, 2022 2:35:06 AM	*/

public class P02_FindTheMaxMin {
	/*
	 * Given an input string of a sequence of integers from the console (e.g., using
	 * Scanner), read the string and parse it as an unsorted array of integers, then
	 * find the maximum and minimum elements of this array.
	 */

	public static void main(String[] args) {

		Scanner rScanner = new Scanner(System.in);
		String rString = rScanner.nextLine();
		rScanner.close();

		String[] str = rString.split(",");// 将字符串分割
		int[] num = new int[str.length]; // 转为整数数组
		for (int i = 0; i < str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}

		// --------------------------------------------- //

		int max = num[0];
		int min = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);

	}

}
