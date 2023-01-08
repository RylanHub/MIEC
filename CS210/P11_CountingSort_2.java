package CS210_Lab;

// 法二

import java.util.Arrays;
import java.util.Scanner;

public class P11_CountingSort_2 {
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
        int step = 0;
        int max = getMax(arr);

        //计数
        int[] count = new int[max + 1];
        for (int value : arr) {
            System.out.println("Step " + (step) + ": Count = " + Arrays.toString(count));
            count[value]++;
            step++;
        }
        System.out.println("----------------");


        // 计数数组前后项叠加
        for (int i = 1; i < count.length; i++) {
            System.out.println("Step " + (step) + ": Count = " + Arrays.toString(count));
            count[i] += count[i - 1];
            step++;
        }
        System.out.println("----------------");

        // 反向填充
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Step " + (step) + ": Count = " + Arrays.toString(count));
            sortedArr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
            step++;
        }
        System.out.println("Step " + (step) + ": Count = " + Arrays.toString(count));

        return sortedArr;
    }

}
