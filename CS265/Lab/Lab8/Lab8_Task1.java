package Lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class Lab8_Task1 {
	Lab8_Program1 P = new Lab8_Program1();

	@DisplayName("Lab7_Task1")
	@ParameterizedTest()
	@MethodSource("ParameterDataProvider")
	void task(char type, Integer scheme, int fee) {
		assertEquals(fee, P.memberFee(type, scheme));

	}

	private static Stream<Arguments> ParameterDataProvider() {
		return Stream.of(
				Arguments.of('X', 3, 0), 
				Arguments.of('A', 1, 450), 
				Arguments.of('A', 2, 850),
				Arguments.of('A', 4, 1000),
				Arguments.of('S', 1, 300),
				Arguments.of('S', 2, 0)
				);
	}	

}
