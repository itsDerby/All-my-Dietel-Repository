package chapter7;

public class Array3By2 {
    public static void main(String[] args) {
        int [][] grades = new int[3][2];
        grades[0][0] = 5;
        grades[0][1] = 4;
        grades[1][0] = 18;
        grades[1][1] = 3;
        grades[2][0] = 21;
        grades[2][1] = 5;

        for (int count = 0; count < grades.length; count++) {
            for (int count2 = 0; count2 < grades[count].length; count2++) {
                System.out.print(grades[count][count2] + "\t");

            }
            System.out.println(" ");
        }


    }

}
