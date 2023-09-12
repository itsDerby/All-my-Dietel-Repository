package chapterTwo;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int count = 1;
        while(count <= 10) {
            System.out.print("Enter next exam result(1 = pass, 2 = fail): ");
            int examResult = scanner.nextInt();
            if (examResult ==1) {
                pass = pass + 1;

            }
            else {
                fail = fail + 1;


            }
            count = count + 1;
        }
            System.out.printf("Passed: %d%nFailed: %d%n", pass , fail);
            if(pass > 8) System.out.println("Bonus to this Instructor");
        }


    }

