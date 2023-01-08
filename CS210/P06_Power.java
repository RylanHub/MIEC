package CS210_Lab;

//Read two inputs - two integer numbers m and n - from console.
//Output m^n. (You can't use the function Math.pow().)

/* Input: 4, -1
   Output: 0.25 */

import java.util.Scanner;

public class P06_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextInt();
        int n = sc.nextInt();
//        System.out.println(raisingPower(m, n));
        System.out.println(pw(m, n));

    }

    // 当指数非常大（2147483647）的时候，递归方法会导致 StackOverflowError
    public static double raisingPower(double m, int n, double ans) {
        if (n == 0) {
            return ans;
        }

        if (n < 0) {
            m = 1 / m;
            n = -n;
        }
        ans *= m;
//        System.out.println(ans);
        return raisingPower(m, n - 1, ans);
    }

    // （暴力）迭代可以正常运行（但明显等了一会才出结果
    public static double raisingPower(double m, int n) {
        double ans = 1;
        if (n < 0) {
            m = 1 / m;
            n = -n;
        }
        while (n > 0) {
            ans *= m;
            n--;
        }
        return ans;
    }

    // 这种方法正常
    public static double pw(double m, int n) {
        double ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * m;
            }
            m = m * m;
            n >>= 1;
        }
        return ans;
    }


}

