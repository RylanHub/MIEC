package Lab5;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: Apr 17, 2022 1:23:05 AM	*/

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String sub = sc.next();
		int x = sc.nextInt();
		System.out.println(checkForSub(word, sub, x));
		sc.close();

	}

	public static boolean checkForSub(String word, String sub, int x) {

		if (x == 0) {
			return true;
		}

		// System.out.println(word.indexOf(sub));

		if (word.indexOf(sub) != -1) {
			return checkForSub(word.substring(sub.length() + 1), sub, x - 1);
		} else {
			return false;
		}

	}

}
