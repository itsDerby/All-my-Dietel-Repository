package chapter7;

public class ArraySwap {

    public static int[] swap(int [] numbers, int index1, int index2){
        numbers[index1] = numbers[index1] + numbers[index2];
        numbers[index2] = numbers[index1] - numbers[index2];
        numbers[index1] = numbers[index1] - numbers[index2];
        return numbers;
    }
}
 