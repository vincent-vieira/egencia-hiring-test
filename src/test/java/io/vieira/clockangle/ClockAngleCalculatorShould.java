package io.vieira.clockangle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.vieira.clockangle.ClockAngleCalculator.calculateAngle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockAngleCalculatorShould {

    @ParameterizedTest
    @CsvSource({
            "24,0,0",
            "0,0,0",
            "12,0,0"
    })
    void returnAZeroAngleWhenTimeIsMidnightOrNoon(int hours, int minutes, int expectedAngle) {
        assertEquals(expectedAngle, calculateAngle(hours, minutes));
    }

    @ParameterizedTest
    @CsvSource({
            "3,0,90",
            "9,0,90",
            "15,0,90",
            "0,30,180",
            "15,45,180",
            "3,45,180",
            "9,15,180",
            "10,55,30"
    })
    void returnTheCorrectAngleWithASpecificTime(int hours, int minutes, int expectedAngle) {
        assertEquals(expectedAngle, calculateAngle(hours, minutes));
    }
}
