package Lab2;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gF = new Scanner(System.in);
		int m = gF.nextInt();
		int n = gF.nextInt();
		gF.close();
		
		if(m>0 && n>0) {
		getFactorial(m, n);
		}
		else{
			System.out.println("Not a valid entry!");
		}
	}

	public static void getFactorial(int m, int n) {
		for (int i = m; i <= n; i++) {
			int F = 1;
			for (int j = m; j >= 1; j--) {
				F = F * j;
			}
			System.out.println(F);
			m++;
		}

	}

}
