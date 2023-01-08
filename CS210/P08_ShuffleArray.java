package CS210_Lab;

//Given an array of distinct integers, shuffle it according to the given order of elements.
/* Input:
        1,2,3,4,5     // your 1st input string with a sequence of integers from console
        3,2,4,1,0     // your 2nd input string with a sequence of position integers from console
   Output:
        4,3,5,2,1 */

import java.util.Arrays;
import java.util.Scanner;

public class P08_ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int[] arr = pares(a);
        int[] pos = pares(b);
        System.out.println(Arrays.toString(sufffle(arr, pos)));

    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static int[] sufffle(int[] arr, int[] pos) {
        int[] suff = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            suff[i] = arr[pos[i]];
        }
        return suff;
    }


}
