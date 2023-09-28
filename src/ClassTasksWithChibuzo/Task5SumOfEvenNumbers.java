package ClassTasksWithChibuzo;

import java.util.Scanner;

public class Task5SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for(int count = 1; count <= 10 ; count++){
            System.out.println("Enter scores: ");
            int score = scanner.nextInt();
            if (score % 2== 0) total = total + score;


        }

        System.out.println("The Sum of The Even Scores Is" + total);
    }
}
