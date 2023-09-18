package FemiAssignment;

import java.util.Scanner;

public class FactorialB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms to calculate e: ");
        int numberOfTerm = scanner.nextInt();

        if (numberOfTerm < 0) {
            System.out.println("Please enter a non-negative integer");
            return;
        }
        double eEstimate = estimateOfE(6);
        System.out.printf("Estimated Value of e with %d terms: %.10f%n", numberOfTerm, eEstimate);
        scanner.close();
    }
    public static double estimateOfE(int numberOfTerms){
        double eEstimate = 1.0;
        double factorial = 1.0;

        for (int i =1; i < numberOfTerms; i++){
            factorial *= i;
            eEstimate += 1.0 / factorial;
        }
        return eEstimate;
    }
}
