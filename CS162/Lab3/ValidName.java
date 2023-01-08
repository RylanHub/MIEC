package Lab3;

import java.util.Scanner;

public class ValidName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Your name: ");
		Scanner Rylan = new Scanner(System.in);
		String r = Rylan.next();
		name(r);
	}
	
	public static void name(String r) {
		if(r.matches("[A-Z][a-z]{1,24}")) {
			System.out.println("Name is valid");		
		}else System.out.println("Name is NOT valid");
		
	}
}
