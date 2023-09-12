package myPractice;

public class WhileLoop {
    public static void main(String[] args) {
//        int product = 3;
//        while (product <= 50){
//            product = product * 3;
//
//        }
//        System.out.println(product);

        for(int count=0; count<5; count++){
            System.out.println("first loop " +  count );
            for (int count2=1; count2<count; count2++){
                System.out.print("second loop"+" " + count2);
            }
        }
        System.out.println();
   }
}
