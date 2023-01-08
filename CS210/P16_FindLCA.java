package CS210_Lab;

//二叉树最近公共祖先问题

import java.util.Scanner;

public class P16_FindLCA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
//        temp = temp.replace("\\s*", "");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] tree = pares(temp);
        int nodeA = 0, nodeB = 0;
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == a) {
                nodeA = i + 1;
            }
            if (tree[i] == b) {
                nodeB = i + 1;
            }
        }

        int nodeAncestor = getLCA(nodeA, nodeB);
        System.out.println(tree[nodeAncestor - 1]);
    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static int getLCA(int a, int b) {
        while (a != b) {
            if (a > b) {
                a /= 2;
            } else {
                b /= 2;
            }
        }
        return a;
    }

}
