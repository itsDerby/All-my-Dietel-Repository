package tdd;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int userNumber = scanner.nextInt();
        int userNumber1 = userNumber;


        int number1 = userNumber * userNumber;

        System.out.printf("%s%d%s%d", "The square of ", userNumber1 , " is ", number1);

    }
}
