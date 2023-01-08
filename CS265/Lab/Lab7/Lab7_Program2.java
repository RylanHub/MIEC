package Lab7;

public class Lab7_Program2 {
	public String detectOddString(String str) {
		String output = "Invalid";
		if (str.length() > 0) {
			int oddCounter = 0, evenCounter = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) % 2 != 0) {
					oddCounter++;
				} else {
					evenCounter++;
				}
			}
			if (oddCounter > evenCounter) {
				output = "OddString";
			} else {
				output = "EvenString";
			}
		}
		return output;
	}
}
