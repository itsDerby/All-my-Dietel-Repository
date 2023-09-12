package tdd;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int number1 = number;

        if (number  %2 ==0){
            System.out.println("The number " + number1 + " is an even number");
        }
        if(number % 2==1 ){
            System.out.println("The number " + number1 + "  is an Odd Number");
        }
    }
}
