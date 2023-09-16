package ChibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnack2Test {
    @Test
    public void testCopies(){
    int copyPrice = WeekendSnack2.testDrillerUtme(5);
    assertEquals(9000, copyPrice);
    }

}