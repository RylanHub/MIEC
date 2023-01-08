package Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*  @Author: LinRui
	@Time: Sep 18, 2022 3:32:53 PM	*/

public class Lab1_Task3 {
	Lab1_Program3 P3 = new Lab1_Program3();
	
	@Test
	 void test3_1() {
		 assertEquals(P3.carInsurance(8, 'M', false), 0); 
	 }
	
	@Test
	 void test3_2() {
		 assertEquals(P3.carInsurance(50, 'F', true), 200); 
	 }
	
	@Test
	 void test3_3() {
		 assertEquals(P3.carInsurance(30, 'M', true), 300); 
	 }
	
	@Test
	 void test3_4() {
		 assertEquals(P3.carInsurance(50, 'M', false), 400); 
	 }
	
	@Test
	 void test3_5() {
		 assertEquals(P3.carInsurance(35, 'M',false), 500); 
	 }
	
	@Test
	 void test3_6() {
		 assertEquals(P3.carInsurance(20, 'M', false), 2000); 
	 }
	
	@Test
	 void test3_7() {
		 assertEquals(P3.carInsurance(70, 'X', false), 0); 
	 }
	
	

}
