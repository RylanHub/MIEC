package Lab6;

/*  @Author: LinRui
	@Time: May 8, 2022 12:04:22 PM	*/

public class Task1_SelectionSort {

	public static void main(String[] args) {
	
		int[] arr = {64,25,12,22,11};
		int[] arrS = selectionSort(arr);
        for(int i =0;i <arrS.length;i++) {
            System.out.print(arr[i] +" ");
        }	
	}
	
	public static int[] selectionSort(int[] Array) {
        for(int i =0; i <Array.length -1; i++) {
            for(int j =0; j <Array.length -1-i; j++) {
                if(Array[j] >Array[j +1]) {
                    int temp =Array[j];
                    Array[j] =Array[j +1];
                    Array[j +1] =temp; 
                }            }
        }      
        return Array;	
		
	}

}
