package ClassTasksWithChibuzo;

import java.util.Scanner;

public class Task7TenValidScoreSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int total = 0;
        int score = 0;

        for (count = 1; count <= 10; ){
            System.out.println("Enter score: ");
             score = scanner.nextInt();
            if  (score > 0 && score <=100)  {
                total = score + total;
                count = count + 1;
            }
        }
        System.out.println(total);
        }


    }
