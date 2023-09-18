package ChibuzoAssignment;

import ChibuzoAssignment.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FunctionTest {

    @Test
    public void testThatTheAccountExists(){
        Function function = new Function();
        assertNotNull(function);
    }
    @Test
    public void testThatTheCollectionRateIsLessThan50(){
        Function function = new Function();
        double salary = function.collectionRate(50);
        assertEquals(15000, salary);

    }
    @Test
    public void testThatTheCollectionRateisWithin50and59(){
        Function function = new Function();
        double salary = function.collectionRate(50);
        assertEquals(15000, salary);
    }
    @Test
    public void testThatTheCollectionRateIsWithin60And69(){
        Function function = new Function();
        double salary = function.collectionRate(60);
        assertEquals(20000, salary);
    }
    @Test
    public void testThatTheCollectionRateIsAbove70(){
        Function function = new Function();
        double salary = function.collectionRate(70);
        assertEquals(40000, salary);

    }
    @Test
    public void testForNegativeValue(){
        Function function = new Function();
        double salary = function.collectionRate(-5);
        assertEquals(0, salary);
    }

}
