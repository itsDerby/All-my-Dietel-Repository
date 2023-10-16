package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySwapTest {

    @Test
    public void testThatTheNumberInAnArrayCanBeSwap(){
        int[] arrayNo = ArraySwap.swap((new int[]{1, 2, 3, 4, 5}), 0, 2);
        int [] givenNos = {1, 2, 3, 4, 5};

    }

}