package Lab8;

import java.util.Random;

/*  @Author: LinRui
	@Time: May 22, 2022 11:08:16 AM	*/

public class Dice {
	private int sides;
	
	public Dice(int sides) {
		this.sides = sides;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
		Random r = new Random();
		return r.nextInt(sides)+1;
	}
	

}
