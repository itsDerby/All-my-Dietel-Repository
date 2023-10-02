package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySnackTest {

    @Test
    public void testThatTheFunctionReturnsTheLargestElementInAList(){

        int arrayElement = ArraySnack.largestNumber(new int[]{45,89,90,7800,122,250});
        assertEquals(7800, arrayElement);

    }
    @Test
    public void testthatTheFuctionReversesAList(){
        int[] expected = {12,13,14,15};
        int[] given = {15,14,13,12};
        int[] result = ArraySnack.reverseNumber(expected);
        assertArrayEquals(result, given);
    }
    @Test
    public void testThatTheFuctionChecksWhetherElementOccursInAList(){
        int [] elements = {3, 4, 5, 6, 7};
        int integer = 7;
        boolean result = ArraySnack.existingElement(elements,integer);
        assertTrue(result);
    }
    @Test
    public void testThatTheElementPrintsAnOddPosition(){
        int [] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] odd = {2,4,6,8,10};
        int result = ArraySnack.oddNumber(odd);


    }
    }
