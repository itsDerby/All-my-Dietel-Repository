package ChibuzoAssignment;

import ChibuzoAssignment.BackToSender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackToSenderTest {
    @Test
    public void receivesSuccessfuldelivery(){
        int result = BackToSender.rateValue(85);
        assertEquals(47500, result);
    }

}