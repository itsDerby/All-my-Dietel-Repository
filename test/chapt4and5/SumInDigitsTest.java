package chapt4and5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumInDigitsTest {

    @Test
    public void testThatThreeDigitsEqualSum(){
      int sumOfDigit  = SumInDigits.returnsDigit(234);
      assertEquals(9, sumOfDigit);

    }
}