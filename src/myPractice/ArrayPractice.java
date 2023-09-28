package myPractice;

public class ArrayPractice {
    public static void main(String[] args) {
        String[] fruits = {"pineapple", "apple", "pawpaw", "banana", "strawberry", "cashew"};
//            for(int index = 0; index < fruits.length; index++ ){
//                System.out.println(fruits[index]);
//            }
            for(String fruit: fruits){
                System.out.println(fruit);
            }
    }
}
