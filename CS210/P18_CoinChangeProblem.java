package CS210_Lab;

//Leetcode 518
import java.util.Scanner;

public class P18_CoinChangeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int N = sc.nextInt();
        int[] num = pares(temp);
        System.out.println(count(num, num.length, N));
    }

    public static int[] pares(String input) {
        String[] spl = input.split(",");
        int[] nums = new int[spl.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(spl[i]);
        }
        return nums;
    }

    public static int count(int coins[], int n, int sum) {

        if (sum == 0)
            return 1;

        if (sum < 0)
            return 0;

        if (n <= 0)
            return 0;

        return count(coins, n - 1, sum)
                + count(coins, n, sum - coins[n - 1]);
    }
}
