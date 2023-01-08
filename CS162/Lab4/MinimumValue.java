package Lab4;

import java.util.Scanner;

public class MinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] R = fillArray();

	//这样写相当于fillArray需要调用两次，sc.close()则会报错；
//		System.out.println("Iterative: " +  q1Iterative(fillArray()));
//		System.out.println("Recursive: " + q1Recursive(fillArray(), 0));
		
		System.out.println(q1Iterative(R));
		System.out.println(q1Recursive(R, 0));

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

	public static int q1Iterative(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}


	public static int q1Recursive(int[] a, int start) {
		if (start == a.length - 1) {
			return a[start];
		}
		return Math.max(a[start], q1Recursive(a, start + 1));
	}

}