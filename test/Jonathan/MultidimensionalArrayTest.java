package Jonathan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MultidimensionalArrayTest {

    @Test
    void canExtractDataFromSet(){
        MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
        int [][] dataSet = {
                {4, 2, 4 ,1},
                {6 ,8 ,3 ,6},
                {2 ,6 ,8 ,2},
                {5 ,8 ,2 ,6}
        };
        int row = 2;
        int startPosition = 2;
        int endPosition = 4;

        int [] result = multidimensionalArray.extract(dataSet, row, startPosition, endPosition);

        int[] expected = {8,3,6};
        assertEquals(expected, result);
        assertEquals(8, result[0]);
        assertEquals(3, result[1]);
        assertEquals(6, result[2]);
        assertEquals(3, result.length);


    }
    @Test
    void canExtractDataFromSetGivenTheColumn(){
        MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
        int [][] dataSet = {
                {4, 2, 4 ,1},
                {6 ,8 ,3 ,6},
                {2 ,6 ,8 ,2},
                {5 ,8 ,2 ,6}
        };
        int specifiedCcolumn = 2;
        int startPosition = 2;
        int endPosition = 4;
        for (int column = 0; column < dataSet.length ; column++) {
            System.out.println("I am here "+ dataSet[column][2]);
            if (column == 2) {
                for (int row = 0; row < dataSet[column].length; row++) {

                    System.out.println(dataSet[column][row]);
                }
//                System.out.println("I am here "+ dataSet[column][2]);
            }

        }

//        int [] result = multidimensionalArray.extractByColumn(dataSet, column, startPosition, endPosition){
//
//        }
    }

}