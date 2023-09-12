package chapterTwo;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int userInput = scanner.nextInt();

        if((userInput % 5==0)&&(userInput % 6 == 0));

        System.out.print((userInput % 5==0)&&(userInput % 5 == 0));

        if ((userInput % 5==0) || (userInput % 6 ==0));
        System.out.print((userInput % 5==0) || (userInput % 6 ==0));

        if ((userInput % 5==0) ^ (userInput % 6 ==0));
        System.out.print((userInput % 5==0) ^ (userInput % 6 ==0));
    }
}
