package Lab2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner LS = new Scanner(System.in);
		int a = LS.nextInt();
		double array[] = new double[a];
		for(int i=0;i<array.length;i++){
			array[i]=LS.nextDouble();
		}
//		System.out.println("The element you search for: ");
		double element =LS.nextDouble();
		LS.close();
		
		findElement(array,element);
		if(findElement(array, element) == true) {
			System.out.println(element + " was found in the array");			
		}
		else System.out.println(element + " was NOT found in the array");
	}
	
	public static boolean findElement(double array[], double element) {		
		boolean X = false;
		for(int i=0; i<array.length;i++) {		
		if(array[i] == element) {
			X = true;
			break;				
	}
		}
	return X;
	}

}
