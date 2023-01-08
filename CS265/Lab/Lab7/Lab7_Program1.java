package Lab7;

public class Lab7_Program1 {
	public String orderScreening(int quantity, boolean credit, int inventory) {
		String output = null;
		if ((quantity <= 1000) && credit)
			if (quantity <= inventory)
				output = "Accept";
			else
				output = "Defer";
		else
			output = "Reject";
		return output;
	}
}
