package ClassTasksWithChibuzo;

import java.util.Scanner;

public class Task8TenScoreSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count;
        for (count = 0; count < 9; count++ ){
            System.out.println("Enter score: ");
           int score = scanner.nextInt();
            if  (score > 0 && score <=100)  {
                total = score + total;

            }
        }
        System.out.println(total);
    }
}
