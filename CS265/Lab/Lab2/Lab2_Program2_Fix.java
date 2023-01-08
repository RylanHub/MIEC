package Lab2;

public class Lab2_Program2_Fix {

	public static String grade(int exam, int course) {

		String result = "null";
		long average;
		average = Math.round((exam + course) / 2);

		if ((exam < 0) || (exam > 100) || (course < 0) || (course > 100))
			result = "Marks out of range";
		else {
			if ((exam < 50) || (course < 50)) {
				result = "Fail";
			} else if (exam < 60) {
				result = "Pass,C";
			//the standard of average is error
			} else if (average >= 70) {
				result = "Pass,A";
			} else {
				result = "Pass,B";
			}
		}

		return result;

	}

}
