package Lab8;

import java.util.Scanner;

/*  @Author: LinRui
	@Time: May 22, 2022 11:26:06 AM	*/

public class DiceGame {

	public static void main(String[] args) {

		Scanner DG = new Scanner(System.in);

		System.out.println("The sides of the dice:");
		int sides = DG.nextInt();

		System.out.println("The number of players:");
		int players = DG.nextInt();

		System.out.println("The winning score:");
		int score = DG.nextInt();

		Dice[] dices = new Dice[players];
		for (int i = 0; i < players; i++) {
			dices[i] = new Dice(sides);
		}

		int[] steps = new int[players];
		boolean flag = false;
		
		int i = 0;
		while (flag == false) {		
			int s = dices[i].roll();
			steps[i] += s;
			System.out.println("Player" + (i+1) + " gets " + s);
			System.out.println("Player" + (i+1) + " 's score: " + steps[i]+"\n");
			
			if (steps[i] >= score) {
				flag = true;
				System.out.println("Player"+ (i+1) +" win!");
			}
			
			if(i<players-1) {
				i++;
			}else {
				i = 0;
			}
		}
		DG.close();
	}

}
