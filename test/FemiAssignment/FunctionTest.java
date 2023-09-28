package FemiAssignment;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionTest {
   @Test
    public void testThatAFunctionTakesTwoNumber(){
       int multiply = Function.multiplyNumber(-4,4);
       assertEquals(-16,multiply);
   }

}