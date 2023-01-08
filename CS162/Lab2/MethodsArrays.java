package Lab2;

import java.util.Scanner;

public class MethodsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			fillArray();			
	}
		
	public static void fillArray() {
//		System.out.println("The length of the array: ");
		Scanner MA = new Scanner(System.in);
		int a = MA.nextInt();
		int array[] = new int [a];
		for(int i=0;i<array.length;i++){
//			System.out.println("array["+i+"] = ");
			array[i]=MA.nextInt();
		}
		MA.close();
		
		sumArray(array);		
		avgArray(array);
		printArray(array);
		
	}
	
	public static int sumArray(int[] array){
		int sum = 0;
		for(int i=0;i<array.length;i++){
			sum += array[i];		
	}
		return sum;
	}
	 
	public static double avgArray(int[] array) {
		double avarage =  (double)sumArray(array) / (double)array.length;
		return avarage;	
	}
	
	public static void printArray(int[] array) {
		System.out.println("Sum = " + sumArray(array));
		System.out.println("Average = " + avgArray(array));
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
	
	
	
}
