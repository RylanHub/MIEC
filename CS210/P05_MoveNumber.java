package CS210_Lab;

//Given an array of integers and a specific number, move all specific numbers to the end of this array.
//The output of this array should maintain the relative order of items in the array.
//The array and number to be moved will be separate input from console to your program.

import java.util.ArrayList;
import java.util.Scanner;

public class P05_MoveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input an array:");
        String str = sc.nextLine();
        System.out.println("input a number:");
        int flag = sc.nextInt();
        sc.close();

        String[] spl = str.split(",");// 将字符串分割
        ArrayList<Integer> nums = new ArrayList<>(); // 转为整数数组
        for (int i = 0; i < spl.length; i++) {
            nums.add(Integer.parseInt(spl[i]));
        }

        System.out.println(moveNum(nums, flag));
    }

    //法一
    public static ArrayList<Integer> moveNum(ArrayList<Integer> nums, int flag) {
        int count = 0;

//        for(int n:nums){
//            if(n==flag){
//                count++;
////                nums.remove(n);
//            }
//        }    //ArrayList在迭代的时候如果同时对其进行修改，容易抛出java.util.ConcurrentModificationException异常


        //修改法一
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == flag) {
                count++;
                nums.remove(i);
                i--; //不使用foreach迭代，且一定要有这行（remove后位置更改）
            }
        }

        //修改法二
//        Iterator<Integer> iterator = nums.iterator();
//        while(iterator.hasNext()){
//            Integer value = iterator.next();
//            if(value==flag){
//                count++;
//                iterator.remove();
//            }
//        }

        for (int i = 0; i < count; i++) {
            nums.add(flag);
        }
        return nums;
    }

    //法二（不使用list)
//    public static int[] moveNum2(int[] nums, int flag) {
//        int left = 0;
//
//        for (int right = 0; right < nums.length; right++) {
//            if (nums[right] != flag) {
//                nums[left] = nums[right];
//                left++; //位置前移
//            }
//        }
//        for (int i = left; i < nums.length; i++) {
//            nums[i] = flag;
//        }
//        return nums;
//    }

}

