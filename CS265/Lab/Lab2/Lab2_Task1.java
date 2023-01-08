package Lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class Lab2_Task1 {
	Lab2_Program1_Fix lab2 = new Lab2_Program1_Fix();

	@DisplayName("Task1")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void task1(int purchase, double discount) {
		assertEquals(lab2.discount(purchase),discount);
	}
	
	private static Stream<Arguments> parameterDataProvider() {
		return Stream.of(
				Arguments.of(Integer.MIN_VALUE, 0), 
				Arguments.of(0, 0), 
				Arguments.of(1, 0),
				Arguments.of(50, 0), 
				Arguments.of(51, 0.05), 
				Arguments.of(200, 0.05), 
				Arguments.of(201, 0.1),
				Arguments.of(500, 0.1), 
				Arguments.of(501, 0.15), 
				Arguments.of(Integer.MAX_VALUE, 0.15));
	}

}
