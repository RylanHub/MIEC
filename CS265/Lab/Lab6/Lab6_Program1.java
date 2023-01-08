package Lab6;

public class Lab6_Program1 {
	public boolean engineService(int miles, int months, int runHours) {
		boolean serviceNeeded = false;
		if (miles <= 0 || months <= 0 || runHours <= 0) {
			serviceNeeded = false;
		} else {
			if (miles > 20000) {
				serviceNeeded = true;
			} else if (months > 12) {
				serviceNeeded = true;
				System.out.println(months);
			} else if (runHours > 1000 && miles > 15000) {
				serviceNeeded = true;
			}
		}
		return serviceNeeded;
	}
}
