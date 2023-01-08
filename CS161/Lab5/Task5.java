package Lab5;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: Apr 17, 2022 2:38:30 AM	*/

public class Task5 {

	public static void main(String[] args) {

		Scanner MOL = new Scanner(System.in);

//		int n = MOL.nextInt(); //the number of words in the string m
		System.out.print("m: ");
		String m = MOL.nextLine();
		System.out.print("x: ");
		int x = MOL.nextInt();
		System.out.print("xl: ");
		int xl = MOL.nextInt();
		System.out.print("c: ");
		String oc = MOL.next();
		System.out.print("cl: ");
		String ocl = MOL.next(); // 为什么nextLine报错

		char c = oc.charAt(0);
		char cl = ocl.charAt(0);
		MOL.close();

		System.out.println(manipulation(m).toLowerCase());
		System.out.println(manipulation(m, c).toLowerCase());
		System.out.println(manipulation(m, x).toLowerCase());
		System.out.println(manipulation(m, x, xl).toLowerCase());
		System.out.println(manipulation(m, c, cl).toLowerCase());
		System.out.println(manipulation(m, c, x).toLowerCase());

	}

	// Remove all whitespace
	public static String manipulation(String m) {
		return m.replace(" ", "");
	}

	// Remove the given character
	public static String manipulation(String m, char c) {

		String pattern = "(?i)" + c;
		return m.replaceAll(pattern, "");
	}

	//
	public static String manipulation(String m, int x) {
		char xx = m.charAt(x);
		String pattern = "(?i)" + xx;
		return m.replaceAll(pattern, "");
	}

	// Remove characters between the given index; substring含头不含尾
	public static String manipulation(String m, int x, int xl) {
		String remove = m.substring(x + 1, xl);
		return m.replace(remove, "");
	}

	// Remove characters between the given char
	public static String manipulation(String m, char c, char cl) {
		if (m.indexOf(c) == -1) {
			m = m.toLowerCase();
		}
		int firist = m.indexOf(c);
		int ov = m.lastIndexOf(cl);
		String remove = m.substring(firist + 1, ov - 1);
		return m.replace(remove, "");
	}

	// Remove all characters from the start of the String up to the xth character
	public static String manipulation(String m, char c, int x) {

		if (m.indexOf(c) == -1) {
			m = m.toLowerCase();
		}
		int j = 0; // c出现的总共次数

		int r = m.indexOf(c); // 第一次出现的位置

		if (x == 1) {
			return m.substring(m.indexOf(c)); // 第一个出现的索引位置

		} else {
			while (j <= x) {
				if (r < m.length() - 2) {
					r = m.indexOf(c, r + 1);
					System.out.println(r);
					j++;
				}
			}
		}

		return m.substring(r);
	}

}
