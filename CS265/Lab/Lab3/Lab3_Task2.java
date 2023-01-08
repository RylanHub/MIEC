package Lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/*  @Author: LinRui
	@Time: Oct 30, 2022 4:07:36 PM	*/

public class Lab3_Task2 {
	Lab3_Program2_Fix P2 = new Lab3_Program2_Fix();

	@DisplayName("Lab3_Task2")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void task(int purchase, double discount) {
		assertEquals(discount, P2.discount(purchase), 1.0E-6);
	}

	private static Stream<Arguments>parameterDataProvider() {
		return Stream.of(
				Arguments.of(0,0),
				Arguments.of(1,0), 
				Arguments.of(51,0.05),
				Arguments.of(201,0.1),
				Arguments.of(501,0.15)
		);
	}

}
