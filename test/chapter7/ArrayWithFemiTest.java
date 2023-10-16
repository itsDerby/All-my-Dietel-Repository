package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithFemiTest {
    @Test
    public void testCalculateSum(){
        ArrayWithFemi arrayWithFemi = new ArrayWithFemi();
        int [] numbers = {1, 2, 3, 4, 5, 10};
        int sum = arrayWithFemi.sum(numbers);
        assertEquals(25, sum);
    }
    @Test
    public void testCalculateProduct(){
        ArrayWithFemi arrayWithFemi = new ArrayWithFemi();
        int[] numbers = {2, 4,6};
        int product = arrayWithFemi.multiply(numbers);
        assertEquals(48, product);
    }
    public void testCalculateAverage(){
        ArrayWithFemi arrayWithFemi = new ArrayWithFemi();
        int [] numbers = {2, 4, 6};
        double average = arrayWithFemi.average(numbers);
        assertEquals(12, average);
    }
    @Test
    public void testSwapElements(){
        ArrayWithFemi arrayWithFemi = new ArrayWithFemi();
        int [] numbers = {1, 2, 3, 4, 5, 6, 7};

        int [] result = arrayWithFemi.swap(numbers);
        int[]expected = {7, 6, 5, 3, 2, 1};
        assertArrayEquals(expected, result);
    }

}