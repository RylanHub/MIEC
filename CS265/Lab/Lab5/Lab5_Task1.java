package Lab5;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Lab5_Task1 {
	Lab5_Program1_Fix P1 = new Lab5_Program1_Fix();

    @DisplayName("Lab5_Task1")
    @ParameterizedTest
    @MethodSource("parameterDataProvider")
    void task(int age, boolean single, int taxRelief){
        assertEquals(taxRelief,P1.taxRelief(age, single));
    }
    
    private static Stream<Arguments> parameterDataProvider() {
        return Stream.of(
                Arguments.of(17,true,0),
                Arguments.of(18,true,800),
                Arguments.of(56,true,1600),
                Arguments.of(56,true,1600),
                Arguments.of(18,false,3200));
    }

}
