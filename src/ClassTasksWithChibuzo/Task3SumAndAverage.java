package ClassTasksWithChibuzo;

import java.util.Scanner;

public class Task3SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int total = 0;
        while (count <= 10) {
            System.out.println("Enter Scores: ");
            int score = scanner.nextInt();
            count += 1;
            total = total + score;


        }
        double average = total / 10;
        System.out.println("The Sum is " + total);
        System.out.println("The average is " + average);

    }
}
