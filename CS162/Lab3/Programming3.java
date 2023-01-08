package Lab3;

//Enter Student number here

//Do Not Remove these
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
//Do Not remove above

import java.util.Scanner;
import java.util.regex.Matcher;

public class Programming3 {
	public static void main(String[] args) {

		/*
		 * This line will use the methods provided below to get all the words from the
		 * dictionary.txt file that is >= 8 Characters long. It will then return a word
		 * from that List to wordToGuess as your word for the game.
		 */
		String wordToGuess = getRandomWord();
//		System.out.println(wordToGuess);

		Scanner sc = new Scanner(System.in);
		int lives = 7;

		ArrayList<String> word = new ArrayList<String>(wordToGuess.length());
		for (int j = 0; j < wordToGuess.length(); j++) {
			word.add("_");
		}

		while (lives > 0) {

			for (int i = 0; i < lives; i++) {
				String HM = sc.nextLine();

				int a = wordToGuess.indexOf(HM);
				while (a != -1) {
					word.remove(a);
					word.add(a, HM);
					a = wordToGuess.indexOf(HM, a + 1);
				}

				if (wordToGuess.contains(HM) == false) {
					lives--;
					System.out.println("Fail");
				}

				System.out.println(word);

				if (lives == 0) {
					System.out.println("You die.");
					;
				}
			}

		}
	}

	/** --------------------------------------- **/
	/** DO NOT CHANGE ANYTHING IN THESE METHODS **/
	/** --------------------------------------- **/
	public static String[] wordsReader() {
		// Path to file to read in
		String myfile = "D:\\Programming\\Java\\eclipse\\workspace\\Rylan\\CS162\\src\\Lab3\\dictionary.txt";
		// Create an ArrayList (a dynamic type of Array)
		ArrayList<String> lines = new ArrayList<String>();
		try {
			// try to read in the File
			BufferedReader abc = new BufferedReader(new FileReader(myfile));

			String line;
			while ((line = abc.readLine()) != null) {
				// If words length greater than 8 keep it otherwise discard it
				if (line.length() > 8) {
					lines.add(line);
				}
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

	public static String getRandomWord() {
		// Return a random word from the list
		String[] words = wordsReader();
		int len = words.length;
		Random rand = new Random();
		int x = rand.nextInt(len);
		return words[x];
	}
	/** ------------------------------------------ **/
	/** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
	/** ------------------------------------------ **/
}