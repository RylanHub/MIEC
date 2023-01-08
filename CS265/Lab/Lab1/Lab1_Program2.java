package Lab1;

/*  @Author: LinRui
	@Time: Sep 18, 2022 2:14:48 PM	*/

public class Lab1_Program2 {

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
			} else if (average >= 70) {
				result = "Pass,A";
			} else {
				result = "Pass,B";
			}
		}

		return result;

	}

}