package chapter7;

public class ArrayClassExercise {
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 1, 2};
        int max = 0;
        int min = 0;
        int total = 0;
        for (int index = 0; index < array.length; index++) {
            total += array[index];
            min = total - array[0];
            max = total - array[3];

        }


        System.out.println(total);
        System.out.printf("%d%s%d", max, ",", min);


    }
}