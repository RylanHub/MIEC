package Lab;

/*  @Author: LinRui
	@Time: Oct 23, 2022 2:58:16 AM	*/

import java.util.Scanner;

public class P05_MoveSpecificNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int flag = sc.nextInt();
        moveElement(st, flag);
        //move the specific int to the end of Array

        sc.close();
    }

    public static int[] toIntArr(String st) {
        String[] numString = st.split(",");
        int len = numString.length;

        if (len < 1) {
            System.out.println("Wrong Input! Return null");
            return null;
        }
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(numString[i]);
        }
        return nums;

    }

    public static void moveElement(String st, int val) {
        int [] nums = toIntArr(st);
        int n = nums.length;
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++ ;
            }
        }

        for (int i = left; i < n; i++) {
            nums[i] = val;
        }

        for (int i = 0; i < n-1; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.println(nums[n-1]);
    }

}
