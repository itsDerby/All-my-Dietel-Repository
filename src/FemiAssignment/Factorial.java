package FemiAssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        int count = 1;

        while (count <= number){
            factorial = factorial * count;
            count++;

            System.out.println(factorial);


        }
    }
}
