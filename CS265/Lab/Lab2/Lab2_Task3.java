package Lab2;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Lab2_Task3 {
	Lab2_Program3_Fix P3 = new Lab2_Program3_Fix();

    @DisplayName("Task3")
    @ParameterizedTest
    @MethodSource("parameterDataProvider")
    void task3(int age, char gender, boolean married, int premium){
        assertEquals(P3.carInsurance(age,gender,married),premium);
    }
    
    private static Stream<Arguments> parameterDataProvider() {
        return Stream.of(
                Arguments.of(15, 'F', false, 0),
                Arguments.of(16, 'F', false,300),
                Arguments.of(66, 'F', true, 0),
                Arguments.of(45, 'F', false, 200),
                Arguments.of(65, 'F', false, 200),
                Arguments.of(44, 'F', false, 300),
                Arguments.of(44, 'M', true, 300),
                Arguments.of(45, 'M', false, 400),
                Arguments.of(65, 'M', false, 400),
                Arguments.of(25, 'M', false, 500),
                Arguments.of(24, 'M', false, 2000),
                Arguments.of(24, 'X', false, 0)
        );
    }
}

	
	
	
