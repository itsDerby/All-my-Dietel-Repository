package myPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayNightTutorialTest {

    @Test
    void oddArrayPositionCanSum(){

        int [] array = {5,4,1,0,6,7,4};
        int result = 11;
        int actual = ArrayNightTutorial.sumOddPosition(array);
        assertEquals(result, actual);

    }
    @Test
    void evenArrayPositionCanSum(){
        int [] array = {5,4,1,0,6,7,9};
        int result = 11;
        int actual = ArrayNightTutorial.sumEvenPosition(array);
        assertEquals(result, actual);
    }
    @Test
    void addOddElementInArray(){
        int [] array = {5,4,1,0,6,7,9};
        int result = 21;
        int actual = ArrayNightTutorial.addOddPosition(array);
        assertEquals(result, actual);
    }
    @Test
    void testThatItCanAddOddNumber(){
        int [] array = {5,4,1,0,6,7,9};
        assertEquals(22, ArrayNightTutorial.addOddNumber(array));

    }
    @Test
    void testThatICanAddEvenNumbers(){
        int [] array = {5,4,1,0,6,7,9};
        assertEquals(10, ArrayNightTutorial.addEvenNumber(array));
    }

}