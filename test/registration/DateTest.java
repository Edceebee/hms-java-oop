package registration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    void testDateArgsConstructorIsNotNull(){
        Date date = new Date(2,3,2012);
        assertNotNull(date);
    }

    @Test
    void testDayMonthAndYearIsNotInvalid(){
        Exception exception;
        exception = assertThrows(IllegalArgumentException.class, () ->{
            Date date = new Date(32,3,2012);
        });
        assertEquals("Invalid day of the month", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () ->{
            Date date = new Date(2,32,2012);
        });
        assertEquals("Month does not exist", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () ->{
            Date date = new Date(2,3,1899);
        });
        assertEquals("Invalid year", exception.getMessage());
    }

    @Test
    void testForCorrectDateFormat(){
        Date date = new Date(2,3,1899);
        assertEquals("2/3/1899", date.getDate());
    }
}