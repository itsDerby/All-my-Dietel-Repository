package chapt4and5;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        int result = 1;
        int count;

        for ( count =1;count <= number  ;){
            result *=number;
           number--;
        }
        System.out.println(result);
        


    }
}
