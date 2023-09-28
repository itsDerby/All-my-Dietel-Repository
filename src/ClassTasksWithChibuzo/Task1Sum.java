package ClassTasksWithChibuzo;

import java.util.Scanner;

public class Task1Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count =1;
        int total = 0;
        while(count <= 10){
            System.out.print("Enter Score: ");
            int score = scanner.nextInt();
            total = total + score;
            count = count + 1;
        }
        System.out.print("The sum is " + total);


    }
}
