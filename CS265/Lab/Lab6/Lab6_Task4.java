package Lab6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import Lab4.Lab4_Program2_Fix;

public class Lab6_Task4 {
	Lab6_Program1 P1 = new Lab6_Program1();

	@DisplayName("Lab6_Task4")
	@ParameterizedTest()
	@MethodSource("ParameterDataProvider")
	void task(int miles, int runHours, int months, boolean serviceNeeded) {
		assertEquals(serviceNeeded, P1.engineService(miles, months, runHours));

	}

	private static Stream<Arguments> ParameterDataProvider() {
		return Stream.of(
				Arguments.of(15001, 1001, 1, true), 
				Arguments.of(14999, 1001, 1, false), 
				Arguments.of(15001, 999, 1, false)
				);
	}
	
}
