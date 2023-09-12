package chapt4and5;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 6;
        for(int count = 1; count <= number; count++ ){

            for(int count2 = 1; count2<= count; count2++){
               System.out.print(count2 +"   ");
            }
            System.out.println();
        }

    }
}
