package myPractice;

public class ArrayWithAlfred {
    public static void main(String[] args) {
        int [] box = {20, 30, 40, 50};
        for (int count = 0; count <= box.length-1; count++){
            System.out.println(box[count]);
        }
        System.out.println();
        for (int count = box.length-1; count >= 0; count--){
            System.out.println(box[count]);
        }
        System.out.println();
        int maximum = 0;
        for(int count = 0; count < box.length; count++){
            if (box[count]> maximum)
               maximum  = box[count];

        }
        System.out.println(maximum);
    }

}
