package nokiaApp;

import java.util.Scanner;

public class NokiaMainMenu {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your Nokia, Click 1 to display your main menu or 0 to exit");

        int menu = scanner.nextInt();

        switch (menu){
            case 1: Nokia.mainMenu();
            case 0: System.exit(0);

        }




    }

}
