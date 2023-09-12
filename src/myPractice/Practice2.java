package myPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int total = 0;
       int counter = 1;
        System.out.print("Enter the grade: ");
        int grade = scanner.nextInt();
        while(grade != -1) {
            total = total+ grade;
            grade = grade+ 1;

            System.out.println("Enter -1 to quit code");
            grade = scanner.nextInt();
        }


        if (grade != 0) {
            double average =( double )total/grade;
            System.out.printf("%f%f", grade, total);
        }
        else{
            System.out.println("No grades were entered");
        }
    }
}
