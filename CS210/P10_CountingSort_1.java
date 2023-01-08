package CS210_Lab;

/*  Given an array of non-negative integers which are smaller than 10,
    print out each step of the update for the count array,
    and the sorted array at the end. */

// 法一

import java.util.Arrays;
import java.util.Scanner;

public class P10_CountingSort_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int arr[] = pares(temp);
        System.out.println(Arrays.toString(counting(arr)));
    }


    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int[] counting(int[] arr) {
        int max = getMax(arr);
        int step = 0;
        int[] count = new int[max + 1];
        for (int value : arr) {
            System.out.println("Step "+(step++)+": Count = "+ Arrays.toString(count));
            count[value]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {

            // 等于0的说明arr本身不含那个数字或者已经被全部重新放进正在排序的数组
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
        return arr;
    }

}
