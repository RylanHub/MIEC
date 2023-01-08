package Lab6;

/*  @Author: LinRui
	@Time: May 8, 2022 1:14:33 PM	*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Do Not remove above

public class Programming5 {
	public static void main(String[] args) {
		Scanner dict = new Scanner(System.in);
		System.out.println("Input your word: ");
		String searchKey = dict.nextLine();
		dict.close();	
		String[] words = codeReader("D:\\Projects\\eclipse\\Rylan\\CS162\\src\\Lab6\\Dictionary.txt");
		System.out.println(recursiveFind(words, 0, words.length, searchKey));

	}

	public static int recursiveFind(String[] words,int start,int end,String searchKey){
		 while(start <= end)
		 {
	         int middle = (start+end)/2;
	         if(words[middle].compareTo(searchKey) < 0)
	         {
	             start = middle + 1;
	         }else if(words[middle].compareTo(searchKey) > 0)
	         {
	             end = middle - 1;
	         }else
	         {
	             return middle+1;
	         }
	     }
		 
	     return -1;
	 } 

	/** --------------------------------------- **/
	/** DO NOT CHANGE ANYTHING IN THESE METHODS **/
	/**
	 * ---------------------------------------
	 **/
	public static String[] codeReader(String fileName) {
		// Path to file to read in
		String myfile = fileName;
		// Create an ArrayList (a dynamic type of Array)
		ArrayList<String> lines = new ArrayList<String>();
		try {
			// try to read in the File
			BufferedReader abc = new BufferedReader(new FileReader(myfile));

			String line;
			while ((line = abc.readLine()) != null) {
				lines.add(line);
				
			}
			abc.close();
		} catch (FileNotFoundException ex) {
			// If the File is not found print to screen
			System.out.println("Unable to open file '" + myfile + "'");
		} catch (IOException ex) {
			// If file is corrupted print to screen
			System.out.println("Error reading file '" + myfile + "'");
		}
		// Convert from ArrayList to Array
		return lines.toArray(new String[] {});
	}
	/** ------------------------------------------ **/
	/** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
	/** ------------------------------------------ **/
}
