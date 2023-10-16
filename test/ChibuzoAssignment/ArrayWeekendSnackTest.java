package ChibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWeekendSnackTest {

    @Test
    void testThatAnArrayReturnsLargestElement(){
        int [] array = {2,4,7,8,9,1,1};
        assertEquals(9, ArrayWeekendSnack.largestNumber(array));
    }
    @Test
    void testThatTheArrayReverses(){
        int [] array = {2,4,7,8,9,1,1};
        int [] reverseList ={1,1,9,8,7,4,2};
        int [] result = ArrayWeekendSnack.reverseArray(array);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
        assertEquals(9, result[2]);
        assertEquals(8, result[3]);
        assertEquals(7, result[4]);
        assertEquals(4, result[5]);

    }

}