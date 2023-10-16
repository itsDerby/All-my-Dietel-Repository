package myPractice;

import java.util.Scanner;

public class ArraySat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(max(new int[]{2, 3, 4, 5}));

        /* to declare a value into an array */
        int[] myArray = new int[3];
        for (int i = 0; i < myArray.length ; i++) {
            System.out.println("Enter " + myArray.length + " values");
            myArray[i]= scanner.nextInt();

        }
        //summing elements of an array

        int total = 0;
        for (int index = 0; index < myArray.length; index++) {
            total += index;
        }


    }
    public static int max(int[] number){
        int total = 0;
        for (int index = 0; index < number.length; index++) {
            total += number.length;
        }
        return total;
    }
    // to print an array



}
