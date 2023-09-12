package Jonathan;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int remainder = number % 10;
        int total = number + remainder;

        System.out.println(total);
    }
}
