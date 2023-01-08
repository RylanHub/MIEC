package CS210_Lab;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Date: 2023/1/2 (Revised)
 * @Author: RuiLin
 * @Description: Merge two arrays by satisfying given constraints
                 * Input:
                 * X[] = { 0,2,0,3,0,5,6,0,0 } 【0 represents a vacant cell】
                 * Y[] = { 1,8,9,10,15 }
                 * Output: X[] = { 1,2,3,5,6,8,9,10,15 }
 */

public class P13_MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tempX = sc.nextLine();
        String tempY = sc.nextLine();
        int[] X = pares(tempX);
        int[] Y = pares(tempY);
        merge(X, Y);
        System.out.println(Arrays.toString(X));
    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static void merge(int[] X, int[] Y) {

        //将X非0的数字全部填到前面的格子
        int i = 0; // 计算空格的数量
        for (int value : X) {
            if (value != 0) {
                X[i++] = value;
            }
        }

        int m = i - 1;
        int n = Y.length - 1;
        int j = m + n + 1; // 即X.length-1

        while (m >= 0 && n >= 0) {
            if (X[m] > Y[n]) {
                X[j--] = X[m--];
            } else {
                X[j--] = Y[n--];
            }
        }

        while (n >= 0) {
            X[j--] = Y[n--];
        }
    }

}
