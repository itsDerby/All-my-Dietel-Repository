package ClassTasksWithChibuzo;

import java.util.Scanner;

public class Task6AverageOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int score = 0;
        for(int count = 1; count <= 10 ; count++){
            System.out.println("Enter scores: ");
            score = scanner.nextInt();
            if (score % 2== 0) total = total + score;
            score = score + 1;


        }
        System.out.println(score);
        System.out.println("The Average Even Score is " + total / score);
    }

}
