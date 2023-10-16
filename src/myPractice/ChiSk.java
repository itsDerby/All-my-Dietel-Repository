package myPractice;

import java.util.Scanner;

public class ChiSk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count;
        for (count = 1; count <= 10 ; count++) {
            System.out.println("Enter score: ");
            number = scanner.nextInt();
            if (number % 3 == 0){
                sum += number;
            }
        }
        System.out.println("The sum of number is:" + sum);
    }
}
