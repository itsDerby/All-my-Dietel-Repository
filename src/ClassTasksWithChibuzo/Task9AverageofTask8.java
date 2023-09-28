package ClassTasksWithChibuzo;

import java.util.Scanner;

public class Task9AverageofTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int total = 0;



        for (count = 1; count <= 10; count++ ){
            System.out.print("Enter score: ");
            int score = scanner.nextInt();
            if  (score > 0 && score <=100)  {
                total = score + total;


            }
        }
        int average = total / 10;

        System.out.println("The average of Task 8 is %d " + average);
}
}
