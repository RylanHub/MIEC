package Lab;

import java.util.ArrayList;
import java.util.Scanner;

/*  @Author: LinRui
	@Time: Oct 9, 2022 2:33:32 AM	*/

public class P01_TheClosestPair {
	/*
	 * P01_TheClosestPair Given an input string of a sequence of integers from the
	 * console (e.g., using Scanner) read the string and parse it as an unsorted
	 * array of integers, then find the closest pair of the adjacent elements of
	 * this array.
	 */

	public static void main(String[] args) {
		Scanner rScanner = new Scanner(System.in);
		String rString = rScanner.nextLine();
		rScanner.close();

		String[] str = rString.split(","); // 将字符串分割
		int[] num = new int[str.length]; // 转为整数数组
		for (int i = 0; i < str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}

		// --------------------------------------------- //

		int[] DV = new int[num.length - 1]; // 计算相邻差值
		for (int i = 0; i < str.length - 1; i++) {
			int d = Math.abs(num[i + 1] - num[i]);
			DV[i] = d;
		}

		int dv = DV[0];
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < DV.length; i++) { // 寻找最小差值
			if (DV[i] < dv) {
				dv = DV[i];
				index.clear();
				index.add(i);
			} else if (DV[i] == dv) {
				index.add(i);
			}
		}
		
		for (int i : index) {
			System.out.println("Pair found at index " + i + " and " + (i + 1));
		}
	}
}

