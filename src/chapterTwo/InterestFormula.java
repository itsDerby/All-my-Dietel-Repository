package chapterTwo;

import java.util.Scanner;

public class InterestFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the balance:");
        double balance = input.nextDouble();

        System.out.println("Enter the interest rate:");
        double annualInterest = input.nextDouble();

        double interest = balance * (annualInterest / 1200);

        System.out.printf("The interest is %f" , interest );


    }
}
