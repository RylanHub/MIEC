package Lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class Lab2_Task2 {
	
	Lab2_Program2_Fix P2=new Lab2_Program2_Fix();
	@DisplayName("Task2")
	@ParameterizedTest()
	@MethodSource("ParameterDataProvider")	
	void task2(int exam,int course,String grade) {
			assertEquals(P2.grade(exam, course),grade);
		}
	
	private static Stream<Arguments> ParameterDataProvider(){
		return Stream.of(
				Arguments.of(Integer.MIN_VALUE,Integer.MIN_VALUE,"Marks out of range"),
				Arguments.of(-1,-1,"Marks out of range"),
				Arguments.of(0,0,"Fail"),
				Arguments.of(0,49,"Fail"),
				Arguments.of(49,0,"Fail"),
				Arguments.of(49,50,"Fail"),
				Arguments.of(50,49,"Fail"),
				Arguments.of(50,50,"Pass,C"),
				Arguments.of(59,50,"Pass,C"),
				Arguments.of(60,50,"Pass,B"),
				Arguments.of(69,50,"Pass,B"),
				Arguments.of(69,69,"Pass,B"),
				Arguments.of(70,70,"Pass,A"),
				Arguments.of(100,100,"Pass,A"),
				Arguments.of(101,101,"Marks out of range"),
				Arguments.of(Integer.MAX_VALUE,Integer.MAX_VALUE,"Marks out of range"));
	
	}

}
