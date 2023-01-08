package Lab8;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: May 22, 2022 12:00:16 PM	*/

public class TestPerson {

	public static void main(String[] args) {
		Scanner TP = new Scanner(System.in);
		
		Person[] persons = new Person[3];
		
		for(int i = 0; i<persons.length;i++) {
			System.out.println("Name: ");
			String name = TP.nextLine();
			System.out.println("Address: ");
			String address = TP.nextLine();
			System.out.println("PPSNO: ");
			int PPSNO = Integer.parseInt(TP.nextLine());
			persons[i] = new Person(name,address,PPSNO);
		}
		
		TP.close();

		System.out.println("Person 1 is called "+persons[0].getName()+
				"\nThey live in " + persons[0].getAddress()+
				"\nTheir PPS Number is "+persons[0].getPPSNo());
			
		persons[1].setName("Paul Smyth");
		persons[1].setAddress("Dublin");
		
		
		for(int i = 0; i<persons.length;i++) {
			persons[i].showPerson();
		}
			
		System.out.println(persons[2].toString());

	}

}
