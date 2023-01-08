package Lab6;

import java.util.Arrays;

/*  @Author: LinRui
	@Time: May 8, 2022 1:09:20 PM	*/

public class Task2_SortString {
	
	public static void main(String[] args) {
		String[] arr1 = { "Ajeet", "Steve", "Rick", "Becky", "Mohan" };
		iterative(arr1);
		System.out.println(Arrays.toString(arr1));

		String[] arr2 = { "Ajeet", "Steve", "Rick", "Becky", "Mohan" };
		recursive(arr2, 1, arr2.length - 1);
		System.out.println(Arrays.toString(arr2));
	}

	public static String[] iterative(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) { //字典序从小到大
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void recursive(String[] array, int start, int end) {
		if (end > 0) {
			if (array[start].compareTo(array[start - 1]) < 0) {
				String temp = array[start];
				array[start] = array[start - 1];
				array[start - 1] = temp;
			}

			if (start >= end) {
				recursive(array, 1, end - 1);
			} else {
				recursive(array, start + 1, end);
			}
		}
	}

}
