package CS210_Lab;

/**
 * @Date: 2023/1/1
 * @Author: RuiLin
 * @Description: Find minimum cost to reach last cell of the M*M matrix from its first cell
 */

import java.util.Scanner;

public class P20_ReachCellOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        System.out.println(findCost(pares(temp)));
    }

    public static int[][] pares(String input) {
        String[] spl = input.split(",");
        int M = (int) Math.sqrt(spl.length);
        int[][] nums = new int[M][M];
        int index = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                nums[i][j] = Integer.parseInt(spl[index]);
                index++;
            }
        }
        return nums;
    }

    public static int findCost(int[][] arr) {
        int[][] minCost = new int[arr.length][arr.length];
        minCost[0][0] = arr[0][0];

        // fill the first row
        for (int i = 1; i < arr.length; i++) {
            minCost[0][i] = arr[0][i] + minCost[0][i - 1];
        }

        // fill the first column
        for (int i = 1; i < arr.length; i++) {
            minCost[i][0] = arr[i][0] + minCost[i - 1][0];
        }

        // path will be either from top or left, choose which ever is minimum
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                minCost[i][j] = arr[i][j] + Math.min(minCost[i - 1][j], minCost[i][j - 1]);
            }
        }
        return minCost[arr.length - 1][arr.length - 1];
    }
}
