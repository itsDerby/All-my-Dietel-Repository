package chapter7;

public class Array3By3Char {
    public static void main(String[] args) {
        char[][] letter = new char[3][3];

        letter[0][0] = 'X';
        letter[0][1] = '0';
        letter[0][2] = 'X';
        letter[1][0] = 'X';
        letter[1][1] = 'X';
        letter[1][2] = '0';
        letter[2][0] = '0';
        letter[2][1] = 'X';
        letter[2][2] = 'X';

        for(int count = 0; count < letter.length; count++){
            for (int count2 = 0; count2 < letter[count].length; count2++) {
                System.out.print(letter[count][count2] +"|\t ");
            }
            System.out.println(" ");

        }

    }


}
