package chapter7;

public class ArrayWithFemi {

    public int sum(int[] numbers) {
        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }
        return sum;
    }

    public int multiply(int[] numbers) {
        int product = 1;
        for (int index = 0; index < numbers.length; index++){
            product *= numbers[index];
        }
        return product;
    }

    public double average(int[] numbers) {
        return sum(numbers)/(double)numbers.length;
    }

    public int[] swap(int[] numbers) {
        int temp = 0;
        for (int index = 0; index < numbers.length ; index++){
            if(index < numbers.length-3){
                temp = numbers[index];
                numbers[index] = numbers[index + 2];
                numbers[index + 2] = temp;
            }

        }
        return numbers;
    }

}
