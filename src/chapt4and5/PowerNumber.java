package chapt4and5;

import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Base number: ");
        int baseNumber = scanner.nextInt();

        System.out.print("Enter the Exponent Number: ");
        int exponentNumber = scanner.nextInt();

        int result = 1;


        for (int count = 0; count < exponentNumber; count++) {
            result *= baseNumber;
        }

        System.out.println("Result: " + result);
    }
}

