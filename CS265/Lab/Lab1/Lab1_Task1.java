package Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*  @Author: LinRui
	@Time: Sep 18, 2022 2:10:16 PM	*/

public class Lab1_Task1 {
	 Lab1_Program1 P1 = new Lab1_Program1();
	 
	 @Test
	 void test1_1() {//EC-1, 3, 7
		 assertEquals(P1.calcInsurance(true, true), 20); 
	 }
	 
	 @Test
	 void test1_2() {//EC-2, [3], 6
		 assertEquals(P1.calcInsurance(false, true), 10); 
	 }
	 
	 @Test
	 void test1_3() {//EC-[2], 4, 5
		 assertEquals(P1.calcInsurance(false, false), 5); 
	 }

	 
	 

}
