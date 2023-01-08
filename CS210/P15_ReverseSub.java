package CS210_Lab;

//分步骤逻辑比较清晰

import java.util.Arrays;
import java.util.Scanner;

public class P15_ReverseSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int m = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(Arrays.toString(subReverse(pares(temp), m, i, j)));
    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] reverse(int[] arr, int i, int j) {
        if (i >= j) { //判断条件不能是 i==j
            return arr;
        }
        swap(arr, i, j);
        return reverse(arr, i + 1, j - 1);
    }

    public static int[] subReverse(int[] arr, int m, int i, int j) {
        for (int a = 0; a < (j - i + 1) / m; a++) {
            reverse(arr, i + a * m, i + (a + 1) * m - 1);
        }
        return arr;
    }

}
