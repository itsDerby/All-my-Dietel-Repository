package chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in pounds:");
        double weight =input.nextDouble();

        System.out.println("Enter height in inches:");
        double height = input.nextDouble();

        double constant1 = 0.45359237;
        double weightOutput = weight * constant1;

        double constant2 = 0.0254;
        double heightOutput = height * constant2;

        double result = heightOutput * heightOutput;

        double bmi = weightOutput / result;

        System.out.printf("BMI is %.2f" , bmi);

    }
}
