package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.setName("Bajaj");
        myBike.setOn(true);


        System.out.printf("My bike name is %s%s%s" , myBike.getName() , " and it is " ,  myBike.getOn() ? "on" : "off" );

    }
}