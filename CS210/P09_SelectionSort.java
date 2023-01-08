package CS210_Lab;

//Given an array of distinct integers, using selection sort to sort it.
//And print out each step of your code.

import java.util.Arrays;
import java.util.Scanner;

public class P09_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int arr[] = pares(a);

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            System.out.println("Step "+i+": arr =  "+Arrays.toString(arr)+", and min_position = "+min);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Step "+(arr.length-1)+": arr =  "+Arrays.toString(arr)+", and min_position = "+(arr.length-1));


    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

}
