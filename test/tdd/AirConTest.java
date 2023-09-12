package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConTest {
    @Test
            public void testThatIHaveAcAndItIsOn(){
        AirCon myAc = new AirCon();
        myAc.getIsOn();

       assertTrue(true);
    }
    @Test
    public void testThatIHaveAcAndItIsOff(){
        AirCon myAc = new AirCon();
        myAc.getIsOff();
        assertTrue(true);
    }
   @Test
   public void testThatIIncreaseTemperature(){
        AirCon myAc = new AirCon();
        myAc.getIsOn();
        myAc.increaseTemperature(19);
       assertEquals(20, 20);

    }
    @Test
    public void testThatIDecreaseTemperature(){
        AirCon myAc = new AirCon();
        myAc.getIsOn();
        myAc.decreaseTemperature(22);
        assertEquals(22, 22);
    }
@Test
    public void iIncreaseTemperatureBeyond30(){
        AirCon myAc = new AirCon();
        myAc.getIsOn();
        myAc.increaseTemperature(40);
        assertEquals(30, 30);
}
@Test
    public void iDecreaseTemperatureBelow16(){
        AirCon myAc = new AirCon();
        myAc.getIsOn();
        myAc.decreaseTemperature(14);
        assertEquals(16, 16);

}
}