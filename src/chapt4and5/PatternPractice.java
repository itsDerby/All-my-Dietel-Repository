package chapt4and5;

public class PatternPractice {
    public static void main(String[] args) {
        int number = 6;


        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*  ");
            }
            //when one row is printed, a new line is needed
            System.out.println();
        }
        int number2 = 5;
        for (int row2 = 1; row2 <= number2; row2++) {
            for (int column = 1; column <= number2; column++) {
                System.out.print("*  ");
            }
            //when one row is printed, a new line is needed
            System.out.println(" ");
        }

        int number3 = 5;
        for (int row2 = 1; row2 <= number2; row2++) {
            for (int column = 1; column <= number2; column++) {
                System.out.print("*  ");
            }
            //when one row is printed, a new line is needed
            System.out.println(" ");
        }
        System.out.println();
        int number4 = 5;
        for (int row2 = 1; row2 <= number4; row2++) {
            for (int column = 1; column <= number4 - row2 + 1; column++) {
                System.out.print("*  ");
            }
            //when one row is printed, a new line is needed
            System.out.println();
        }
        int number5 = 5;
        for (int row2 = 1; row2 <= number5; row2++) {
            for (int column = 1; column <= row2-1; column++) {
                System.out.print(column +" ");
            }
            //when one row is printed, a new line is needed
            System.out.println(row2 + " ");
        }
        int number6 = 5;
        for (int row2 = 1; row2 <= number6; row2++) {
            for (int column = 1; column <= row2-1; column++) {
                System.out.print(column +" ");
            }
            //when one row is printed, a new line is needed
            System.out.println(row2 + " ");
        }
    }
}
