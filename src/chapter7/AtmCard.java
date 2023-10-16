package chapter7;

public class AtmCard {
    public static void main(String[] args) {
        System.out.println(cardNumber("56666456345677"));
    }

    public static String cardNumber(String atmDetails){
    int [] atmNumber = new int[atmDetails.length()];
        for (int index = 0; index < atmNumber.length ; index++) {
            atmNumber[index] = Integer.parseInt(atmDetails.substring(index,index+1));
            System.out.println(atmNumber[index]);
        }

        return atmDetails;
    }


}
