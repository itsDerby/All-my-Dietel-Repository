package chapter7;

import java.util.Arrays;

public class ArraySnack {
    public static void main(String[] args) {
        reverseNumber(new int[]{23, 45, 89, 97, 34, 78, 200, 560, 780});
    }

    public static int[] reverseNumber(int[] array) {
        int reverser = array.length - 1;
        int num = 0;
        int[] arrayReverse = new int[array.length];
        for (int count = reverser; count >= 0; count--) {
            arrayReverse[num] = array[count];
            num++;

        }
//        System.out.println(Arrays.toString(arrayReverse));
        return arrayReverse;
    }

    public static int largestNumber(int[] element) {
        int largest = 0;
        for (int count = 0; count < element.length; count++) {
            if (element[count] > largest) largest = element[count];
        }
        return largest;

    }

    public static boolean existingElement(int[] elements, int element2) {
        boolean result = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element2)
                result = true;
        }
        return result;
    }
}

//    public static int oddNumber(int[] odd) {
//
//    }
//    }


