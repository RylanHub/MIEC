package Lab;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: Sep 25, 2022 2:06:26 PM	*/

public class P07_ReverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		try {
		int r = sc.nextInt();
		System.out.println(reverse(r));
//		} catch (Exception e) {
//			System.out.println("0");
//			System.exit(0);
//		}
	}

	public static int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
				return 0;
			}
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return rev;
	}

}
