package tdd;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number = scanner.nextInt();

        int number2 = number + 1;



        for(int count =1; count >= 5; number2++){
            number2 += number2;
        }
        System.out.println("a            b               pow(a,b)");








    }
}
