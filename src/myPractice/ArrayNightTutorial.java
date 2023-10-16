package myPractice;

public class ArrayNightTutorial {
    public static void main(String[] args) {
      sumOddPosition(new int[]{5,4,1,0,6,7,4});
      sumEvenPosition(new int[]{5,4,1,0,6,7,4});

        }

         public static int sumOddPosition(int[] array){
            int sum = 0;
            for (int index = 1; index < array.length ; index+=2) {
               sum += array[index];
            }
            return sum;
        }

    public static int sumEvenPosition(int[] array){
        int sum = 0;
        for (int index = 1; index < array.length ; index+=2) {
            sum += array[index];
        }
        System.out.println(sum);

        return sum;
    }

    public static int addOddPosition(int[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index+=2) {
            sum += array[index];
        }
        return sum;
    }
    public static int addOddNumber(int[] array){
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 1){
                sum += array[index];
            }

        }
        return sum;
    }

    public static int addEvenNumber(int[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            if(array[index] % 2 == 0) sum += array[index];
        }
        return sum;
    }

}

