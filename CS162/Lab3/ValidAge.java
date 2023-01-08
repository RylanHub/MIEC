package Lab3;

import java.util.Scanner;

public class ValidAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Your age: ");
		Scanner Rylan = new Scanner(System.in);
		String r = Rylan.next();
		age(r);
	}
	
	public static void age(String r) {
		if(r.matches("[0-9]|[0-9][0-9]|1[0-4][0-9]|150")) {
			System.out.println("Age is valid");		
		}else System.out.println("Age is NOT valid");
		
	}

}
