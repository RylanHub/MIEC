package Lab5;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: Apr 17, 2022 4:25:46 AM	*/

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(GCD(m, n));
		sc.close();
	}

	public static int GCD(int m, int n) {

		if (m % n == 0) {
			return n; 
		} else {
			return GCD(n, m % n); 
		}

	}

}
