package chapterTwo;

import java.util.Scanner;

public class AddInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 to 1000: ");
        int number = input.nextInt();


        int digit1 = number / 100;
        int remainingNumber1 = number % 100;
        int digit2 = remainingNumber1 / 10;
        int digit3 = remainingNumber1 % 10;
                
        int sum = digit1  + digit2 + digit3 ;

        System.out.printf("The sum of the digits is: %d"  , sum);



    }
}
