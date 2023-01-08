package CS210_Lab;
// Given a binary array, find the maximum sequence of continuous 1s that can be formed by replacing at most k zeros by ones.
// Leetcode 1004 滑动窗口
// 题意转换「找出一个最长的子数组，该子数组内有 K 个 0 」

import java.util.Arrays;
import java.util.Scanner;

public class P14_continuousOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int k = sc.nextInt();
        slide(pares(temp), k);
    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static void slide(int[] binary, int k) {
        int tempLeft = 0;
        int tempRight = 0;
        int left = 0;
        int right = 0;
        int zero = 0;
        int windows = tempRight - tempLeft;

        while (tempRight < binary.length) {
            if (binary[tempRight++] == 0) { // tempRight++（先赋值）还未自增，仍是从binary[0]开始
                zero++;
            }
            while (zero > k) {
                if (binary[tempLeft++] == 0) {
                    zero--;
                }
            }

            if (tempRight - tempLeft > windows) {
                left = tempLeft;
                right = tempRight;
                windows = right - left;
            }
        }

        for (int i = left; i < right; i++) {
            binary[i] = 1;
        }

        System.out.println("The length of longest sequence is " + windows + " (from index " + left + " to index " + (right - 1) + ")");
        System.out.println(Arrays.toString(binary));
    }


}
