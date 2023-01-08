package CS210_Lab;

//Given an array of integers and a specific number.
//Find a subarray with the maximum length which its sum is equal to this given number.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_FindSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input an array:");
        String str = sc.nextLine();
        System.out.println("input a number:");
        int sum = sc.nextInt();
        sc.close();

        String[] spl = str.split(",");// 将字符串分割
        int[] nums = new int[spl.length]; // 转为整数数组
        for (int i = 0; i < spl.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }

//        System.out.println(findSub(nums));
//        System.out.println(findSum(findSub(nums), sum));
        System.out.println(findAllSub(nums));

        ArrayList ans = findmax(findSum(findSub(nums), sum));
        if(ans.isEmpty()){
            System.out.println("Not found");
        }else{
            System.out.println(ans);
            System.out.println(ans.size());
        }

    }



    //寻找所有子数组
    public static List<ArrayList<Integer>> findAllSub(int[] nums) {
        List<ArrayList<Integer>> allSub = new ArrayList<>();
//      for (int i = 0; i < Math.pow(2, nums.length); i++) {
        for (int i = 0; i < (1 << nums.length); i++) {
            ArrayList<Integer> sub = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    sub.add(nums[j]);
                }
            }
            allSub.add(sub);
        }
        return allSub;
    }

    //寻找连续子数组
    public static List<ArrayList<Integer>> findSub(int[] nums) {
        List<ArrayList<Integer>> sub = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                ArrayList<Integer> subList = new ArrayList<>();
                sub.add(subList);
                for (int k = i; k <= j; k++) {
                    subList.add(nums[k]);
                }
            }
        }
        return sub;
    }


    //寻找满足输入sum的子数组
    public static List<ArrayList<Integer>> findSum(List<ArrayList<Integer>> allSub, int sum) {
        List<ArrayList<Integer>> sumArr = new ArrayList<>();
        for (ArrayList<Integer> sub : allSub) {
            int ans = 0;
            for (int i : sub) {
                ans += i;
            }
            if (ans == sum) {
                sumArr.add(sub);
            }
        }
        return sumArr;
    }

    //寻找最大长度的sum子数组
    public static ArrayList<Integer> findmax(List<ArrayList<Integer>> sumArr) {
        int max = 0;
        int temp = 0;
        int index = 0;

        ArrayList<Integer> notFound = new ArrayList<>();
        if(sumArr.isEmpty()){
            return notFound;
        }

        for (int i = 0; i < sumArr.size(); i++) {
            temp = sumArr.get(i).size();
            if (temp > max) {
                max = temp;
                index = i;
            }
        }
        return sumArr.get(index);
    }

}








