package Lab7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Lab7_Task1 {
	Lab7_Program1 P = new Lab7_Program1();

	@DisplayName("Lab7_Task1")
	@ParameterizedTest()
	@MethodSource("ParameterDataProvider")
	void task(int quantity, boolean credit, int inventory, String output) {
		assertEquals(output, P.orderScreening(quantity, credit, inventory));

	}

	private static Stream<Arguments> ParameterDataProvider() {
		return Stream.of(
				Arguments.of(1000, true, 1000, "Accept"), 
				Arguments.of(1000, true, 999, "Defer"), 
				Arguments.of(1000, false, 1000, "Reject")
				);
	}	

}
