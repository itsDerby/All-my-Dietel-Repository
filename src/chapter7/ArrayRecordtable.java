package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRecordtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 13; i++) {
            System.out.println("Enter the value for row: ");
            int row0 = scanner.nextInt();
            
        }
        int[][] record = new int[4][3];

        record[0][0] = 2500;
        record[0][1] = 1200;
        record[0][2] = 800;
        record[1][0] = 1150;
        record[1][1] = 850;
        record[1][2] = 720;
        record[2][0] = 8000;
        record[2][1] = 1200;
        record[2][2] = 135;
        record[3][0] = 200;
        record[3][1] = 120;
        record[3][2] = 122;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int row = 0; row < record.length; row++) {
//            System.out.println(Arrays.toString(record[row]));
            for (int column = 0; column < record[row].length; column++) {
                System.out.print(record[row][column] + "     \t");

            }
            System.out.println();


        }
        System.out.println(max);
        System.out.println(min);


        }

    }



