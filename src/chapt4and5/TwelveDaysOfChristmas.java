package chapt4and5;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("""
                Twelve days of christmas song
                 press: Either 1, 2, 3, 4, 5, 6, 7 ,8 ,9 ,10 ,11 or 12
                 : """);
        int dayOfChristmas = scanner.nextInt();
        switch (dayOfChristmas){
            case 1:
                System.out.println("""
                        On the first day of Christmas
                    My true love gave to me
                    A partridge in a pear tree""");
                break;

            case 2:
                System.out.println("""
                        On the second day of Christmas
                    My true love gave to me
                    Two turtle doves
                    And a partridge in a pear tree""");
                break;
            case 3:
                System.out.println("""
                        On the third day of Christmas
                    My true love gave to me
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree.""");
                break;
            case 4:
                System.out.println("""
                        On the fourth day of Christmas
                    My true love gave to me
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree.""");
                break;
            case 5:
                System.out.println("""
                        On the fifth day of Christmas
                    My true love gave to me
                    Five golden rings,
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree.""");
                break;
            case 6:
                System.out.println("""
                       On the sixth day of Christmas
                    My true love gave to me
                    Six geese a-laying,
                    Five golden rings,
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree.""");
                break;
            case 7:
                System.out.println("""
                       On the seventh day of Christmas
                    My true love gave to me
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five golden rings,
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree. """);
                break;
            case 8:
                System.out.println("""
                       On the eighth day of Christmas
                    My true love gave to me
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five golden rings,
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree. """);
                break;
            case 9:
                System.out.println("""
                        On the ninth day of Christmas
                    My true love gave to me
                    Nine ladies dancing,
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five golden rings,
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree.""");
                break;
            case 10:
                System.out.println("""
                        On the tenth day of Christmas
                    My true love gave to me
                    Ten lords a-leaping,
                    Nine ladies dancing,
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five golden rings,
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree.""");
                break;
            case 11:
                System.out.println("""
                       On the eleventh day of Christmas
                    My true love gave to me
                    Eleven pipers piping,
                    Ten lords a-leaping,
                    Nine ladies dancing,
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five golden rings,
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree. """);
                break;
            case 12:
                System.out.println("""
                        On the twelfth day of Christmas
                    My true love gave to me
                    Twelve drummers drumming,
                    Eleven pipers piping,
                    Ten lords a-leaping,
                    Nine ladies dancing,
                    Eight maids a-milking,
                    Seven swans a-swimming,
                    Six geese a-laying,
                    Five golden rings,
                    Four calling birds,
                    Three French hens,
                    Two turtle doves
                    And a partridge in a pear tree.""");
        }


    }
}
