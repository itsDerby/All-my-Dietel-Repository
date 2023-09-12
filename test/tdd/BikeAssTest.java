package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeAssTest {
    @Test
    public void testThatIHaveABikeAndItIsOn() {
        BikeAss mybike = new BikeAss();
        mybike.key();
        assertTrue(mybike.getIsOn());
    }

    @Test
    public void testThatIhaveABikeAndItIsOff() {
        BikeAss myBike = new BikeAss();
        myBike.key();
        myBike.key();
        assertFalse(myBike.getIsOn());
    }

    @Test
    public void testThatMyBikeIsOnGearOne() {
        BikeAss myBike = new BikeAss();
        myBike.getIsOn();
        myBike.accelerate();
        myBike.accelerate();
        assertEquals(2,myBike.getSpeed());
        assertEquals(1, myBike.getGear());
    }


        @Test
        public void testThatMyBikeisOnGearTwo () {
            BikeAss myBike = new BikeAss();

            for(int speed = 1; speed <= 20; speed++){

                myBike.accelerate();
            }
            //myBike.accelerate();
            assertEquals(20, myBike.getSpeed());
            assertEquals(1, myBike.getGear());

        }
        @Test
        public void testThatMyBikeIsOnGearThree() {
            BikeAss myBike = new BikeAss();
            for (int speed = 1; speed <= 30; speed++) {
                myBike.accelerate();


            }
            assertEquals(46, myBike.getSpeed());
            assertEquals(4, myBike.getGear());

            myBike.decelerate();
            assertEquals(42,myBike.getSpeed());
        }
        @Test
        public void testThatMyBikeIsOnGearOneAndItDeceleratesByOne(){
        BikeAss myBike = new BikeAss();
        for (int speed = 1; speed <=19; speed++){
            myBike.accelerate();
        }
        assertEquals(1, myBike.getSpeed());
        assertEquals(19, myBike.getGear());
        myBike.decelerate();
        assertEquals(19, myBike.getGear());

    }
    }
