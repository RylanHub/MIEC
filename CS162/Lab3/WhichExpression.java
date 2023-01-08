package Lab3;

import java.util.Scanner;

public class WhichExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input:");
		Scanner Rylan = new Scanner(System.in);
		String r = Rylan.next();
		WE(r);
	
	}
	
	public static void WE(String r) {
		boolean flag = false;
		
		if(r.matches("a(b|a)b")) {
			System.out.println("1");
			flag = true;
		}
		if(r.matches("(ab)*b")) {
			System.out.println("2");
			flag = true;
		}
		if(r.matches("a(b|a)*")) {
			System.out.println("3");
			flag = true;
		}
		if(r.matches("((a|b)a)*")) {
			System.out.println("4");
			flag = true;
		}
		if(flag) {
			System.out.println("Not in the language");
		}
		
	}

}
