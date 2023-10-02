package nokiaApp;

import java.util.Scanner;

public class NokiaFunctions {
  private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to your Nokia, Click 1 to display your main menu or 0 to exit");

        int menu = input.nextInt();

        switch (menu){
            case 1: mainMenu();
            case 0: System.exit(0);

        }




    }
    public static void mainMenu(){


        System.out.println("""
                press
                1. Phone book
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services """);

        int menu = input.nextInt();


        switch (menu) {
            case 1:
//                int input = scanner.nextInt();
//                switch (input) {
//                    case 1:
//                        System.out.println("Search");
//                        break;
//                    case 2:
//                        System.out.println("Service Nos");
//                        break;
//                    case 3:
//                        System.out.println("Add Name");
//                        break;
//                    case 4:
//                        System.out.println("Erase");
//                        break;
//                    case 5:
//                        System.out.println("Edit");
//                        break;
//                    case 6:
//                        System.out.println("Assign tone");
//                        break;
//                    case 7:
//                        System.out.println("Send b' Card");
//                        break;
//                    case 8:
//                        System.out.println("""
//                                8. Options
//                                        1. Type of view
//                                        2. Memory status""");
//                        int options = scanner.nextInt();
//                        switch (options) {
//                            case 1:
//                                System.out.println("1. Type of view");
//                                break;
//                            case 2:
//                                System.out.println("2. Memory status");
//                                break;
//                        }
//                        System.out.println();
//                        break;
//                    case 9:
//                        System.out.println("Speed dials");
//                        break;
//                    case 10:
//                        System.out.println("Voice tags");
//
//                       break;
                //    case 0: mainMenu();
//                }
//                break;
//            case 2:
//                System.out.println("""
//                        1. Write messages
//                        2. Inbox
//                        3. Outbox
//                        4. Picture messages
//                        5. Templates
//                        6. Smileys
//                        7. Message settings
//                        8. Info service
//                        9. Voice mailbox number
//                        10. Service command editor""");
//                int messages = scanner.nextInt();
//                switch (messages) {
//                    case 1:
//                        System.out.println("1. Write messages");
//                        break;
//                    case 2:
//                        System.out.println("2. Inbox");
//                        break;
//                    case 3:
//                        System.out.println("3. Outbox");
//                        break;
//                    case 4:
//                        System.out.println("4. Picture messages");
//                        break;
//                    case 5:
//                        System.out.println("5. Templates");
//                        break;
//                    case 6:
//                        System.out.println("6. Smileys");
//                        break;
//                    case 7:
//                        System.out.println("""
//                                7. Message settings
//                                    1. Set
//                                    2. Common""");
//                        int set1 = scanner.nextInt();
//                        switch (set1) {
//                            case 1:
//                                System.out.println("""
//                                        1. Message centre number
//                                        2. Messages sent as
//                                        3. Message validity""");
//                                int messageCentre = scanner.nextInt();
//                                switch (messageCentre) {
//                                    case 1:
//                                        System.out.println("1. Message centre number");
//                                        break;
//                                    case 2:
//                                        System.out.println("2. Message sent as");
//                                        break;
//                                    case 3:
//                                        System.out.println("Message validity");
//                                        break;
//                                }
//                                break;
//
//
//                            case 2:
//                                System.out.println("""
//                                        1. Delivery reports
//                                        2. Reply via same centre
//                                        3. Character support""");
//                                int deliveryReport = scanner.nextInt();
//                                switch (deliveryReport) {
//                                    case 1:
//                                        System.out.println("1. Delivery reports");
//                                        break;
//                                    case 2:
//                                        System.out.println("Reply via same centre");
//                                        break;
//                                    case 3:
//                                        System.out.println("3. Character support");
//                                        break;
//
//                                }
//                                break;
//
//                        }
//
//                        System.out.println();
//                        break;
//                    case 8:
//                        System.out.println("8. Info service");
//                        break;
//                    case 9:
//                        System.out.println("9. Voice mailbox number");
//                        break;
//                    case 10:
//                        System.out.println("10. Service command editor");
//                        break;
//                }
//            case 3:
//                System.out.println("""
//                        3. Chat""");
//                break;
//            case 4:
//                System.out.println("""
//                        1. Missed calls
//                        2. Received calls
//                        3. Dialled numbers
//                        4. Erase recent call lists
//                        5. Show call duration
//                        6. Show call costs
//                        7. Call cost settings
//                        8. Prepaid credit""");
//                int callOptions = scanner.nextInt();
//                switch (callOptions){
//                    case 1:
//                        System.out.println("1. Missed calls");
//                        break;
//                    case 2:
//                        System.out.println("2. Received calls");
//                        break;
//                    case 3:
//                        System.out.println("3. Dialled numbers");
//                        break;
//                    case 4:
//                        System.out.println("4. Erase recent call list");
//                        break;
//                    case 5:
//                        System.out.println("""
//                                5. Show call duration
//                                    1. Last call duration
//                                    2. All calls' duration
//                                    3. Received calls duration
//                                    4. Dialled calls duration
//                                    5. Clear timers""");
//                        int callDuration = scanner.nextInt();
//                        switch (callDuration) {
//                            case 1:
//                                System.out.println("1. Last call duration");
//                                break;
//                            case 2:
//                                System.out.println("2. All calls duration");
//                                break;
//                            case 3:
//                                System.out.println("3. Received calls duration");
//                                break;
//                            case 4:
//                                System.out.println("4. Dialled calls duration");
//                                break;
//                            case 5:
//                                System.out.println("5. Clear timers");
//                                break;
//
//
//                        }
//                        System.out.println();
//                        break;
//                    case 6:
//                        System.out.println("""
//                                1. Show call costs
//                                       1. Last call cost
//                                       2. All calls' cost
//                                       3. Clear counters""");
//                        int callCosts = scanner.nextInt();
//                        switch (callCosts){
//                            case 1:
//                                System.out.println("Last call cost");
//                                break;
//                            case 2:
//                                System.out.println("All calls' cost");
//                                break;
//                            case 3:
//                                System.out.println("Clear counters");
//                                break;
//                        }
//                    case 7:
//                        System.out.println("""
//                                7. Call cost settings
//                                       1. Call cost limit
//                                       2. Show costs in""");
//                        int callCost = scanner.nextInt();
//                        switch (callCost){
//                            case 1:
//                                System.out.println("1. Call cost limit");
//                                break;
//                            case 2:
//                                System.out.println("2 Show costs in");
//                                break;
//
//                        }
//                        System.out.println();
//                        break;
//                    case 8:
//                        System.out.println("8. Prepaid credit");
//
//                }
//
//            case 5:
//                System.out.println("""
//                        1. Ringing tone
//                        2. Ringing volume
//                        3. Incoming call alert
//                        4. Composer
//                        5. Message alert tone
//                        6. Keypad tones
//                        7. Warning and game tones
//                        8. Vibrating alert
//                        9. Screen saver""");
//                int tone = scanner.nextInt();
//                switch (tone){
//                    case 1:
//                        System.out.println("1. Ringing tone");
//                        break;
//                    case 2:
//                        System.out.println("2. Ringing volume");
//                        break;
//                    case 3:
//                        System.out.println("3. Incoming call alert");
//                        break;
//                    case 4:
//                        System.out.println("4. Composer");
//                        break;
//                    case 5:
//                        System.out.println("5. Message alert tone");
//                        break;
//                    case 6:
//                        System.out.println("6. Keypad tones");
//                    case 7:
//                        System.out.println("7. Warning and game tones");
//                        break;
//                    case 8:
//                        System.out.println("8. Vibrating alert");
//                        break;
//                    case 9:
//                        System.out.println("9. Screen saver");
//                        break;
//
//
//
//
//                }
//                System.out.println();
//                break;
//            case 6:
//                System.out.println("""
//                        1. Call settings
//                        2. Phone settings
//                        3. Security settings
//                        4. Restore factory settings""");
//                int callSetting = scanner.nextInt();
//                switch (callSetting){
//                    case 1:
//                        System.out.println("""
//                                1. Automatic redial
//                                2. Speed dialling
//                                3. Call waiting
//                                4. Own number sending
//                                5. Automatic answer""");
//                        int call = scanner.nextInt();
//                        switch (call){
//                            case 1:
//                                System.out.println("Automatic redial");
//                                break;
//                            case 2:
//                                System.out.println("Speed dialling");
//                                break;
//                            case 3:
//                                System.out.println("Call waiting");
//                                break;
//                            case 4:
//                                System.out.println("Own number sending");
//                                break;
//                            case 5:
//                                System.out.println("Automatic answer");
//                                break;
//
//                        }
//                        System.out.println();
//                        break;
//
//                    case 2:
//                        System.out.println("""
//                                1. Language
//                                2. Cell info display
//                                3. Welcome note
//                                4. Network note
//                                5. Lights
//                                6. Confirm SIM service actions""");
//                        int language = scanner.nextInt();
//                        switch (language){
//                            case 1:
//                                System.out.println("1. Language");
//                                break;
//                            case 2:
//                                System.out.println("2. Cell info display");
//                                break;
//                            case 3:
//                                System.out.println("3. Welcome note");
//                                break;
//                            case 4:
//                                System.out.println("4. Network selection");
//                                break;
//                            case 5:
//                                System.out.println("5. Lights");
//                                break;
//                            case 6:
//                                System.out.println("Confirm SIM service actions");
//                                break;
//
//                        }
//                        System.out.println();
//                        break;
//                    case 3:
//                        System.out.println("""
//                                1. PIN code request
//                                2. Call barring service
//                                3. Fixed dialing
//                                4. Closed user group
//                                5. Phone security
//                                6. Change access codes""");
//                        int pinCode = scanner.nextInt();
//                        switch (pinCode){
//                            case 1:
//                                System.out.println("1. PIN code request");
//                                break;
//                            case 2:
//                                System.out.println("2. Call barring service");
//                                break;
//                            case 3:
//                                System.out.println("3. Fixed dialing");
//                                break;
//                            case 4:
//                                System.out.println("4. Closed user group");
//                                break;
//                            case 5:
//                                System.out.println("5. Phone security");
//                                break;
//                            case 6:
//                                System.out.println("Change access codes");
//                                break;
//                        }
//
//                }
//                System.out.println();
//                break;
//            case 7:
//                System.out.println("7. Divert");
//                break;
//            case 8:
//                System.out.println("8. Games");
//                break;
//            case 9:
//                System.out.println("9. Calculator");
//                break;
//            case 10:
//                System.out.println("10. Reminders");
//                break;
//            case 11:
//                System.out.println("""
//                        11. Clock
//                            1. Alarm clock
//                            2. Clock settings
//                            3. Date setting
//                            4. Stopwatch
//                            5. Countdown
//                            6. Auto update of date and time""");
//                int clock = scanner.nextInt();
//                switch (clock){
//                    case 1:
//                        System.out.println("1. Alarm clock");
//                        break;
//                    case 2:
//                        System.out.println("2. Clock settings");
//                        break;
//                    case 3:
//                        System.out.println("3. Date setting");
//                        break;
//                    case 4:
//                        System.out.println("4. Stopwatch");
//                        break;
//                    case 5:
//                        System.out.println("5. Countdown timer");
//                        break;
//                    case 6:
//                        System.out.println("6. Auto update of date and time");
//                }
//                System.out.println();
//                break;
//
//            case 12:
//                System.out.println("12. Profiles");
//                break;
//            case 13:
//                System.out.println("13. SIM services");
//                break;

        }

}


}
