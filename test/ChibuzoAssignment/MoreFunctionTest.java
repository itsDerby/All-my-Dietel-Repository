package ChibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoreFunctionTest {
    @Test
    public void testThatTheNumberIsAnEvenNumber(){
        boolean evenNumber = MoreFunction.isEven(8);
        assertTrue(evenNumber);

    }
    @Test
    public void testThatTheNumberIsAnOddNumber(){
        boolean oddNumber = MoreFunction.isEven(7);
        assertFalse(oddNumber);

    }
    @Test
    public void testThatTheNumberIsAPrimeNumber(){
        boolean primeNumber = MoreFunction.isPrime(11);
        assertTrue(primeNumber);
    }
    @Test
    public void testThatTheNumberIsNotAPrimeNumber(){
        boolean primeNumber = MoreFunction.isPrime(10);
        assertFalse(primeNumber);
    }
    @Test
    public void testThatTheNumberCanSubtract(){
        int subtract = MoreFunction.subtract(3,7);
        assertEquals(4, subtract);

    }
    @Test
    public void testThatTheNumberCanDivide(){
        double divide = MoreFunction.divide(25,0);
        assertEquals(0, divide);

    }
    @Test
    public void testThatTheNumberIsAFactorOf(){
        int factor = MoreFunction.factor(10);
        assertEquals(4,factor);

    }
    @Test
    public void testThatTheNumberIsSquare(){
        boolean square = MoreFunction.squareof(25);
        assertTrue(square);

    }
}
