package Lab8;

public class Lab8_Program1 {

	public int memberFee(char type, int scheme) {
		int fee;
		if ((type != 'A') && (type != 'S') || ((scheme != 1) && (scheme != 2) && (scheme != 4)))
			fee = 0;
		else {
			if (type == 'A')
				if (scheme == 1)
					fee = 450;
				else if (scheme == 2)
					fee = 850;
				else
					fee = 1000;
			else {
				if (scheme == 1)
					fee = 300;
				else
					fee = 0;
			}
		}
		return fee;
	}
}
