package pythonToJava;

public class ArraySnack {
    public static void main(String[] args) {
//        Arrays Array = null;
//        List<Integer> numbers = Array.asList(15, 20, 25, 20, 10, 5);
////        numbers.add(15);
////        numbers.add(20);
////        numbers.add(25);
////        numbers.add(20);
////        numbers.add(10);
////        numbers.add(5);
//
//        System.out.println(list.toString(numbers));
//

int sum = 0; int multiply = 1; int largest = 0; int smallest = 25;
    int[] number = {15,20,25,20,10,5};
        for (int i = 0; i < number.length; i++) {
            sum = sum + i;
            multiply = multiply* i;
            if (i > largest) largest = i;
            else if (i < smallest) smallest =i;

            }
        System.out.println("Sum is :" +sum);
        System.out.println("product is :" +multiply);
        System.out.println("largest is :" +largest);
        System.out.println("smallest is :" +smallest);
        }

}

