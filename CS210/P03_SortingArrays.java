package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/*  @Author: LinRui
	@Time: Oct 9, 2022 2:36:50 AM	*/

public class P03_SortingArrays {
	/*
	 * Input two sorted integer arrays (as input strings from console), which are
	 * sorted from small to large. Read those input strings as int arrays and
	 * combine those arrays being one and sorting it from small to large.
	 */

	public static void main(String[] args) {

		Scanner rScanner = new Scanner(System.in);
		String rString1 = rScanner.nextLine();
		String rString2 = rScanner.nextLine();
		rScanner.close();

		String[] str1 = rString1.split(",");// 将字符串分割
		int[] num1 = new int[str1.length]; // 转为整数数组
		for (int i = 0; i < str1.length; i++) {
			num1[i] = Integer.parseInt(str1[i]);
		}
		String[] str2 = rString2.split(",");
		int[] num2 = new int[str2.length];
		for (int i = 0; i < str2.length; i++) {
			num2[i] = Integer.parseInt(str2[i]);
		}

		// --------------------------------------------- //

		int[] num = new int[num1.length + num2.length]; // 连接两个数组
//		for(int i=0;i<num1.length;i++) {
//			num[i]=num1[i];
//		}
//		
//		for(int i=0;i<num2.length;i++) {
//			num[num1.length+i]=num2[i];
//		}

		System.arraycopy(num1, 0, num, 0, num1.length);
		System.arraycopy(num2, 0, num, num1.length, num2.length);

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}

}
