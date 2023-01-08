package Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*  @Author: LinRui
	@Time: Sep 18, 2022 3:12:45 PM	*/

public class Lab1_Task2 {
	Lab1_Program2 P2 = new Lab1_Program2();

	@Test
	void test2_1() {
		assertEquals(P2.grade(-1, -1), "Marks out of range");
	}

	@Test
	void test2_2() {
		assertEquals(P2.grade(45, 45), "Fail");
	}

	@Test
	void test2_3() {
		assertEquals(P2.grade(55, 55), "Pass,C");
	}

	@Test
	void test2_4() {
		assertEquals(P2.grade(65, 65), "Pass,B");
	}

	@Test
	void test2_5() {
		assertEquals(P2.grade(70, 70), "Pass,A");
	}

	@Test
	void test2_6() {
		assertEquals(P2.grade(101, 101), "Marks out of range");
	}

}
