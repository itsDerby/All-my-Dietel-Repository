package tdd;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                press 
                1 -> English
                2 -> Yoruba
                3 -> Pidgin""");
        int userInput = scanner.nextInt();
        switch (userInput){
            case 2:
                System.out.println("Yoruba");
                break;
            case 3:
                System.out.println("Pidgin");
                System.out.println("You wan speak pidgin? 1 or 2?");
                int speakWafi = scanner.nextInt();
                switch (speakWafi){
                    case 1:
                        System.out.println("Pidgin mode on");
                        break;
                    case 2:
                            System.out.println("Pidgin Mode Off");
                            break;
                }
            case 1:
                System.out.println("English");
                break;
            default:
                System.out.println("You no get sense");
        }
    }
}
