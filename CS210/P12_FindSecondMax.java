package CS210_Lab;

import java.util.Scanner;

// 法二：排序完找到倒数第二个数字（太麻烦）

public class P12_FindSecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int arr[] = pares(temp);
        findSecond(arr);
    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static void findSecond(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : arr) {
            if (i > secondMax && i < max) {
                secondMax = i;
            }
        }

        if (secondMax == max) {
            System.out.println("No second largest number found in the given array");
        } else{
            System.out.println(secondMax);
        }

    }
}

