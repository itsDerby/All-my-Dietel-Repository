package ChibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardFacilitatorTest {

    @Test
    public void testThatCardDetailsIsWithin13and16() {
        boolean digitsOfNumber = CreditCardFacilitator.cardLengthNumber("1234567890125");
        assertTrue(digitsOfNumber);

    }
//    public void testToKnowTheTypeOfCard(){
//        String card = HappyBirthdaySnack.cardType("VISA");
//    }
}