package entity;

import org.example.entity.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {

    // Score: 95%, Présence: 90 => Note: A
    @Test
    void testGradingWithScore95andAttendancePercentage90() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        char actual = gradingCalculator.getGrade(95,90);
        Assertions.assertEquals('A', actual);
    }

    // Score: 85%, Présence: 90 => Note: B
    @Test
    void testGradingWithScore85andAttendancePercentage90() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        char actual = gradingCalculator.getGrade(85, 90);
        Assertions.assertEquals('B', actual);
    }

    // Score: 65%, Présence: 90 => Note: C
    @Test
    void testGradingWithScore65andAttendancePercentage90() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        char actual = gradingCalculator.getGrade(65, 90);
        Assertions.assertEquals('C', actual);
    }

    // Score: 95%, Présence: 65 => Note: B
    @Test
    void testGradingWithScore95andAttendancePercentage65() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        char actual = gradingCalculator.getGrade(95, 65);
        Assertions.assertEquals('B', actual);
    }

    // Score: 95%, Présence: 55 => Note: F
    @Test
    void testGradingWithScore95andAttendancePercentage55() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        char actual = gradingCalculator.getGrade(95, 55);
        Assertions.assertEquals('F', actual);
    }

    // Score: 65%, Présence: 55 => Note: F
    @Test
    void testGradingWithScore65andAttendancePercentage55() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        char actual = gradingCalculator.getGrade(65, 55);
        Assertions.assertEquals('F', actual);
    }

    // Score: 50%, Présence: 90 => Note: F
    @Test
    void ttestGradingWithScore50andAttendancePercentage90() {
        GradingCalculator gradingCalculator = new GradingCalculator();

        char actual = gradingCalculator.getGrade(50, 90);
        Assertions.assertEquals('F', actual);
    }
}
