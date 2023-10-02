package chapter7;

import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] score = new int[10];
        int count;
        double total = 0;
        for (count = 0; count < score.length; count++){
            System.out.print("Enter scores: ");
            score[count] = scanner.nextInt();
            total = total + score[count];

        }
        int minimum = score[0];
        for (count = 0; count < score.length; count++){
            if (minimum > score[count]) minimum = score[count];
        }
        int maximum = score[0];
        for (count = 0; count < score.length; count++){
            if (maximum < score[count]) maximum = score[count];
        }
        for (count = 0; count < score.length; count++){
            if (score[count] %2 ==1) {
                System.out.printf("%s%d%n" ,"The Odd Score is ", score[count]);
            }
        }
        System.out.println("The Sum of Total is " + total);
        System.out.println("The Average is " + total / 10);
        System.out.println("The minimum is " + minimum);
        System.out.println("The maximum is " + maximum);
    }
}
