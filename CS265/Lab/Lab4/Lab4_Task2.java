package Lab4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Lab4_Task2 {
	Lab4_Program2_Fix P2=new Lab4_Program2_Fix();
	@DisplayName("Task2")
	@ParameterizedTest()
	@MethodSource("ParameterDataProvider")	
	void task(int exam,int course,String grade) {
			assertEquals(grade,P2.grade(exam, course));
			
		}
	
	private static Stream<Arguments> ParameterDataProvider(){
		return Stream.of(
				Arguments.of(0,0,"Fail"),
				Arguments.of(50,60,"Pass,C"),
				Arguments.of(60,60,"Pass,B"),
				Arguments.of(70,70,"Pass,A"),
				Arguments.of(101,101,"Marks out of range"));
	
	}

}


