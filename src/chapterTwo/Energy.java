package chapterTwo;

import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms:");
        float number1 = input.nextFloat();

        System.out.println("Enter the initial temperature:");
        float number2 = input.nextFloat();

        System.out.println("Enter the final temperature:");
        float number3 = input.nextFloat();

        float result = number1 * (number3 - number2) * 4184;

        System.out.printf("%s%f" , "The energy needed is " , result);

    }
}
