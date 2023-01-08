package CS210_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P17_MaxSumPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        getPath(pares(temp));
    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(2, i);
        }
        return sum;
    }

    public static void getPath(int[] tree) {
        // 计算树的层数
        int depth = 0;
        int layer = tree.length + 1;
        while (layer != 1) {
            layer /= 2;
            depth++;
        }

        // 验证二叉树是全充满才能用使用路径汇总方法
        if (tree.length != getSum(depth)) {
            depth++;
        }
        int[] fullTree = Arrays.copyOf(tree, getSum(depth));

        // ----------------关键-----------------
        // 将所有路径汇总
        int pathNum = (int) (Math.pow(depth, 2) - Math.pow(depth - 1, 2) + 1);
        int[][] path = new int[pathNum][depth];
        for (int i = 0; i < pathNum; i++) {
            int index = (int) (Math.pow(2, depth - 1) + i);
            for (int j = depth - 1; j >= 0; j--) {
                path[i][j] = fullTree[index - 1];
                index /= 2;
            }
        }
        // ----------------关键-----------------

        // 计算不同路径的数值
        int[] sum = new int[pathNum];
        for (int i = 0; i < pathNum; i++) {
            for (int j = 0; j < depth; j++) {
                sum[i] += path[i][j];
            }
        }

        // 选出最大的路径值
        int max = sum[0];
        int num = 0;
        for (int i = 0; i < pathNum; i++) {
            if (sum[i] > max) {
                max = sum[i];
                num = i;
            }
        }

        System.out.println("Max sum is " + max + ", with a path " + Arrays.toString(path[num]));
    }

}
