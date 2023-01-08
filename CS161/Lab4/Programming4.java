package Lab4;

//Enter Student number here (FZU:832103316)

//Do Not Remove these
import java.io.*;
import java.util.ArrayList;
//Do Not remove above

public class Programming4 {
	public static void main(String[] args) {

		// Pass filename into the codeReader method here
		for (int i = 1; i <= 4; i++) {
			int Mark = 0, a = 0, b = 0, c = 0, d = 0, e = 0;
			String[] code = codeReader("Student" + i + ".java");
			for (int j = 0; j < code.length; j++) {

				if (code[j].matches(".*public class.*")) {
					a = 10;
				}
				if (code[j].matches(".*void main[(]String \\[\\] args[)].*")) {
					b = 10;
				}
				if (code[j].matches(".*for(.*;.*;*).")) {
					c = 10;
				}
				if (code[j].matches(".*%.*")) {
					d = 10;
				}
				if (code[j].matches(".*System\\.out\\.print.*")) {
					e = 10;
				}
				Mark = a + b + c + d + e;
			}
			System.out.println("Student " + i + ": " + Mark + " Marks");
		}
	}

	/** --------------------------------------- **/
	/** DO NOT CHANGE ANYTHING IN THESE METHODS **/
	/** --------------------------------------- **/
	public static String[] codeReader(String fileName) {
		// Path to file to read in
		String myfile = "D:\\Projects\\eclipse\\Rylan\\CS162\\src\\Lab4\\Student Code\\" + fileName;

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
		}

		catch (FileNotFoundException ex) {
			// If the File is not found print to screen
			System.out.println("Unable to open file");
		} catch (IOException ex) {
			// If file is corrupted print to screen
			System.out.println("Error reading file");
		}

		// Convert from ArrayList to Array
		return lines.toArray(new String[] {});
	}

	/** ------------------------------------------ **/
	/** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
	/** ------------------------------------------ **/
}