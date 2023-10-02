package chapter7;

import java.util.Scanner;

public class ArrayTaskWithoutUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter scores: ");
        int scores = scanner.nextInt();

        int total = scores; int count;
        int minimum = scores; double average = scores;
        int maximum = 0;

        for (count = 1; count <= 3; count++) {
            System.out.print("Enter scores: ");
            scores = scanner.nextInt();

            if (scores < minimum) minimum = scores;
            if (scores > maximum) maximum = scores;

            total = total + scores;
            average = (double) total / count;
        }

            System.out.println("The sum is " + total);
            System.out.println("The average is " + average);
            System.out.println("minimum is : " + minimum);
            System.out.println("maximum is :" + maximum);

    }
}