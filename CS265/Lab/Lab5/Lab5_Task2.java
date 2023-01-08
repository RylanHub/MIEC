package Lab5;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Lab5_Task2 {
	Lab5_Program2_Fix P2 = new Lab5_Program2_Fix();

    @DisplayName("Lab5_Task2")
    @ParameterizedTest
    @MethodSource("parameterDataProvider")
    void task(int age, char OS, int p){
        assertEquals(p,P2.phoneInsurance(age, OS));
    }
    
    private static Stream<Arguments> parameterDataProvider() {
        return Stream.of(
                Arguments.of(15,'A',0),
                Arguments.of(24,'I',75),
                Arguments.of(63,'W',45),
                Arguments.of(50,'A',40),
                Arguments.of(50,'W',50));
    }

}
