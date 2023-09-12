package chapterTwo;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please Enter the Investment Amount:");
        double investmentAmount = input.nextDouble();

        System.out.println("Please Enter the Annual Interest Rate in Percentage:");
        double InterestRate = input.nextDouble();

        double sum = 1 + InterestRate;

        System.out.println("Please Enter the Number of Years:");

        double valueofYears = input.nextDouble();
        double value2= valueofYears * 12;

//double constant = 0.603;

        double power = (Math.pow(sum, value2));

        double futureInvestmentValue = investmentAmount * power;

        System.out.printf("The accumulated value is:  %.3f  " , futureInvestmentValue );


    }
}
