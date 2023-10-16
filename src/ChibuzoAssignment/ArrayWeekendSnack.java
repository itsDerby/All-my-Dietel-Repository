package ChibuzoAssignment;

public class ArrayWeekendSnack {

    public static void main(String[] args) {

    }

    public static int largestNumber(int[] array) {
        int max = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) max = array[index];

        }
        return max;
    }

    public static int[] reverseArray(int[] reverseList) {
        int length = reverseList.length-1;
        int[] reverse = new int[reverseList.length];
        int count = 0;
        for (int index = length; index > 0 ; index--) {
                reverse[count] = reverseList[index];
                count++;

        }
        return reverse;
    }

}
