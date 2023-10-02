package ChibuzoAssignment;

public class ArrayClass {
    public static void main(String[] args) {
        int[] ages = {12, 13, 65, 5, 45, 23};
        int count;
        for (count = 0; count < ages.length; count++) {
            ages[count] = ages[count] * 2;
        }
        System.out.println(ages[count]);
    }
}
