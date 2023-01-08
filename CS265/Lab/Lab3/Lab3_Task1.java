package Lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/*  @Author: LinRui
	@Time: Oct 30, 2022 4:07:28 PM	*/

public class Lab3_Task1 {
	Lab3_Program1_Fix P1 = new Lab3_Program1_Fix();

	@DisplayName("Lab3_Task1")
	@ParameterizedTest
	@MethodSource("parameterDataProvider")
	void task(boolean sportsEquipment, boolean musicEquipment, int insurance) {
		assertEquals(insurance, P1.calcInsurance(sportsEquipment, musicEquipment));
	}

	private static Stream<Arguments>parameterDataProvider() {
		return Stream.of(
				Arguments.of(true,true,20), 
				Arguments.of(true,false,10),
				Arguments.of(false,true,10),
				Arguments.of(false,false,5)
		);
	}

}
