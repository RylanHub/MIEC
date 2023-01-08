package Lab4;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Lab4_Task1 {
	Lab4_Program1_Fix P1 = new Lab4_Program1_Fix();

    @DisplayName("Task1")
    @ParameterizedTest
    @MethodSource("parameterDataProvider")
    void task(int age, char gender, boolean married, int premium){
        assertEquals(premium,P1.carInsurance(age,gender,married));
    }
    
    private static Stream<Arguments> parameterDataProvider() {
        return Stream.of(
                Arguments.of(8, 'M', false, 0),
                Arguments.of(50, 'F', true,200),
                Arguments.of(30, 'M', true, 300),
                Arguments.of(50, 'M', false, 400),
                Arguments.of(35, 'M', false, 500),
                Arguments.of(20, 'M', false, 2000));    
    }
}

