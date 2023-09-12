package chapterThree;

import java.util.Scanner;

class PetrolPurchaseTest {
    public static void main(String[] args) {
        PetrolPurchase myPurchase = new PetrolPurchase("Sabo" , 4000 , 700, 5);
        myPurchase.getPurchaseAmount();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name ");
        String theName = input.nextLine();
        myPurchase.setStationLocation(theName);

        System.out.println(myPurchase.getStationLocation());
        System.out.println(myPurchase.getQuantityPurchase());
        System.out.println(myPurchase.getPricePerLiter());
        System.out.print(myPurchase.getPricePerLiter());
        System.out.print( myPurchase.getPurchaseAmount());





    }
}