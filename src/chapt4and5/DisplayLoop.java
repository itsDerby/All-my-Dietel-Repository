package chapt4and5;

import java.util.Scanner;

public class DisplayLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;


        int userResponse;
        do {
            System.out.print("Enter First Number: ");
            int number = scanner.nextInt();

            System.out.print("Enter Second Number: ");
            int number2 = scanner.nextInt();
            int sum = number + number2;
            System.out.println("The sum is:  " + sum);

            System.out.println("Do you wish to perform this operation again? 1: Yes, 2: No)?");
            userResponse = scanner.nextInt();



            }
            while ((userResponse == 1)) ;

        }

    }


