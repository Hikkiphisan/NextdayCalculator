import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Test Next day")
    public void findNextDay() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        int day = 1;
        int month = 1;
        int year = 2024;
        String expected = "2/1/2024";
        String result = nextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Next Day")
    public void findNextDay31_1_2024() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        int day = 31;
        int month = 1;
        int year = 2024;
        String expected = "1/2/2024";
        String result = nextDayCalculator.getNextDayforMaxDay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("findNextDay30_4_2024")
    public void findNextDay30_4_2024() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        int day = 30;
        int month = 4;
        int year = 2024;
        String expected = "1/5/2024";
        String result = nextDayCalculator.getNextDayforMaxDay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Next Day")
    public void findNextDay31_12_2024() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        int day = 31;
        int month = 12;
        int year = 2024;
        String expected = "1/1/2025";
        String result = nextDayCalculator.getNextDayforMaxDay(day,month,year);
        assertEquals(expected,result);
    }
}