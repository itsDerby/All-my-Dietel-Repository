package tdd;

import java.util.Scanner;

public class FactorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();

       int result = 0;
       int count = 1;


        for (; count <= number; count++) {
            if (number % count == 0) result= result + 1;

        }
        System.out.println(result);






    }
}
