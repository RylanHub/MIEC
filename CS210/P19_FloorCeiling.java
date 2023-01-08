package CS210_Lab;

/**
 * @Date: 2023/1/1
 * @Author: RuiLin
 * @Description: Find Floor and Ceil of a number in a sorted array
                 * Time complexity must be O(log(k))
 */

import java.util.Scanner;

public class P19_FloorCeiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int n = sc.nextInt();
        System.out.print(binarySearchFloor(pares(temp), n) + ",");
        System.out.print(binarySearchCeiling(pares(temp), n));
    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static int binarySearchFloor(int[] arr, int searchKey) {
        int floor = -999;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchKey) {
                return arr[mid];
            } else if (arr[mid] < searchKey) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }

    public static int binarySearchCeiling(int[] arr, int searchKey) {
        int ceiling = -999;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchKey) {
                return arr[mid];
            } else if (arr[mid] > searchKey) {
                ceiling = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceiling;
    }
}
