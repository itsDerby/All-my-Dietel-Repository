package chapter7;

public class ClassTask {
    public static void main(String[] args) {
        int [] [] items = {{34, 23, 65}, {23, 67, 44, 68}};
        for(int[] iterate:items){
            System.out.println(" ");
            for(int item : iterate){
                System.out.print(item + "\t\t");
            }
        }
    }
}
