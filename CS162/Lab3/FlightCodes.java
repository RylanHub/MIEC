package Lab3;

import java.util.Scanner;

public class FlightCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Code: ");
			Scanner Rylan = new Scanner(System.in);
			String r = Rylan.next();
			code(r);
		}
		
		public static void code(String r) {
			if(r.matches("[A-Z]{2,3}[0-9]{3,4}")) {
				System.out.println("Flight code is valid");		
			}else System.out.println("Flight code is NOT valid");
			
		}

	}

