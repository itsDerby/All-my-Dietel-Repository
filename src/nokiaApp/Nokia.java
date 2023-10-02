package nokiaApp;

import java.util.Scanner;

public class Nokia {
    private static Scanner input = new Scanner(System.in);

    public static void mainMenu() {


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
                phoneBook();
            case 2:
                messages();
            case 3:
                chat();
            case 4:
                callRegister();
            case 5:
                tones();
            case 6:
                settings();
            case 7:
                callDivert();
            case 8:
                games();
            case 9:
                calculator();
            case 10:
                reminder();
            case 11:
                clock();
            case 12:
                profiles();
            case 13:
                simServices();
        }
    }

    public static void phoneBook() {
        System.out.println("""                     
                1. Search
                2. Service Nos
                3. Add Name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send B' Card
                8. Options
                9. Speed Dials
                10. Voice Tag
                0. <--""");

        int phoneBook = input.nextInt();
        switch (phoneBook) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos");
                break;
            case 3:
                System.out.println("Add Name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send b' Card");
                break;
            case 8:
                options();

                break;
            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tags");

                break;
            case 0:
                mainMenu();
        }
    }

    public static void options() {
        System.out.println("""
                8. Options
                 1. Type of view
                 2. Memory status
                 
                 Click 0 to go back to PhoneBook Menu""");

        int options = input.nextInt();
        switch (options) {
            case 0:
                phoneBook();

            case 1:
                System.out.println("""
                        1. Type of view
                                                
                                                
                        Click 0 to go back to options""");

                int back = input.nextInt();
                if (back == 0) options();


            case 2:
                System.out.println("""
                        2. Memory status
                                                
                                                
                        Click 0 to go back to options""");
                back = input.nextInt();
                if (back == 0) options();


            default:
                System.out.println("invalid key, click the right options");
                options();
        }
    }

    public static void messages() {
        System.out.println("""
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                0. <-- """);
        int messages = input.nextInt();
        switch (messages) {
            case 0:
                mainMenu();
            case 1:
                System.out.println("1. Write messages");
                break;
            case 2:
                System.out.println("2. Inbox");
                break;
            case 3:
                System.out.println("3. Outbox");
                break;
            case 4:
                System.out.println("4. Picture messages");
                break;
            case 5:
                System.out.println("5. Templates");
                break;
            case 6:
                System.out.println("6. Smileys");
                break;
            case 7:
                messageSettings();
                int set1 = input.nextInt();
                switch (set1) {
                    case 1:
                        System.out.println("""
                                1. Message centre number
                                2. Messages sent as
                                3. Message validity
                                
                                
                                Click 0 to go back to MainMenu""");


                        int messageCentre = input.nextInt();
                        switch (messageCentre) {
                            case 0:
                                mainMenu();
                            case 1:
                                System.out.println("1. Message centre number");
                                break;
                            case 2:
                                System.out.println("2. Message sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                        }
                        break;


                    case 2:
                        System.out.println("""
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support""");
                        int deliveryReport = input.nextInt();
                        switch (deliveryReport) {
                            case 1:
                                System.out.println("1. Delivery reports");
                                break;
                            case 2:
                                System.out.println("Reply via same centre");
                                break;
                            case 3:
                                System.out.println("3. Character support");
                                break;

                        }
                        break;

                }

                System.out.println();
                break;
        }
    }

    public static void messageSettings() {
        System.out.println("""
                7. Message settings
                    1. Set
                    2. Common
                    
                    
                    Click 0 to go back""");
        int set1 = input.nextInt();
        switch (set1) {
            case 0:
                messages();
            case 1:set1();


            case 2:
                System.out.println("""
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                                
                                Click 0 to go back""");

                int back = input.nextInt();
                if (back == 0) messageSettings();


        }

    }

    public static void set1(){
        System.out.println("""
                        1. Message centre number
                        2. Messages sent as
                        3. Message validity
                        
                        
                        Click 0 to go back""");


        int set = input.nextInt();
        switch (set) {
            case 1:
                System.out.println("""
                                1. Message Centre number
                                
                                
                                Press 0 to go back to the Set Menu""");

                backForSet();
            case 2:
                System.out.println("""
                        2. Messages sent as
                        
                        Press 0 to go back to the Set Menu""");
                backForSet();
            case 3:
                System.out.println("""
                        3. Message Validity
                        
                        
                        Press 0 to go back to the Set Menu""");
                backForSet();
                break;
            default:
                System.out.println("invalid key, click the right options");
                messages();

        }
    }
    public static void backForSet(){
        int back = input.nextInt();
        if (back== 0)set1();
    }
    public static void chat(){
        System.out.println();
    }
    public static void callRegister(){
        System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit""");

       int callRegister = input.nextInt();
       switch (callRegister){
           case 5:
              showCallDuration();

           case 6:
               showCallCosts();

           case 7:
               callCostSettings();



       }
    }
    public static void showCallDuration(){
        System.out.println("""
                                5. Show call duration
                                    1. Last call duration
                                    2. All calls' duration
                                    3. Received calls duration
                                    4. Dialled calls duration
                                    5. Clear timers
                                    
                                   0<----""");
        int back = input.nextInt();

        backForCallSettings(back);

    }
    public static void showCallCosts(){
        System.out.println("""
                                1. Show call costs
                                       1. Last call cost
                                       2. All calls' cost
                                       3. Clear counters
                                       
                                       
                                       0<-----""");
        int back = input.nextInt();

        backForCallSettings(back);
    }
    public static void callCostSettings(){
        System.out.println("""
                                7. Call cost settings
                                       1. Call cost limit
                                       2. Show costs in
                                       
                                       0<-----""");
        int back = input.nextInt();
        backForCallSettings(back);


    }
    public static void backForCallSettings(int back){
         back = input.nextInt();
        if (back == 0) callRegister();
    }
    public static void tones(){
        System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver""");
    }
    public static void settings(){
        System.out.println("""
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        
                        0<------""");
        int settings = input.nextInt();
        switch (settings){
            case 1:
                callSettings();

            case 2:
                phoneSettings();

            case 3:
                securitySettings();

        }


    }
    public static void callSettings(){
        System.out.println("""
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting
                                4. Own number sending
                                5. Automatic answer
                                
                                0<------""");
        int back = input.nextInt();
        backForSettings(back);
    }
    public static void backForSettings(int back){
         back = input.nextInt();
        if (back== 0)settings();
    }
    public static void phoneSettings(){
        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network note
                                5. Lights
                                6. Confirm SIM service actions
                                
                                0<-------""");
        int back = input.nextInt();
        backForSettings(back);
    }
    public static void securitySettings(){
        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialing
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                
                                0<-------""");
        int back = input.nextInt();
        backForSettings(back);
    }
    public static void callDivert(){
        System.out.println("""
                7. Call Divert
                
                0<-----""");
        int back = input.nextInt();

        backForMainMenu(back);
    }

    private static void backForMainMenu(int back) {
        if (back == 0) mainMenu();
    }

    public static void games(){
        System.out.println("""
                8. Games
                
                0 <----""");

        int back = input.nextInt();
        backForMainMenu(back);
    }
    public static void calculator(){
        System.out.println("""
                8. calculator
                
                0<-----""");
        int back = input.nextInt();
        backForMainMenu(back);
    }
    public static void reminder(){
        System.out.println("""
                10. Reminder
                
                
                0<------""");
        int back = input.nextInt();
        backForMainMenu(back);
    }
    public static void clock(){
        System.out.println("""
                        11. Clock
                            1. Alarm clock
                            2. Clock settings
                            3. Date setting
                            4. Stopwatch
                            5. Countdown
                            6. Auto update of date and time""");
        int back = input.nextInt();
        backForMainMenu(back);
    }
    public static void profiles(){
        System.out.println("""
                12. Profiles
                
                
                0<----""");
        int back = input.nextInt();
        backForMainMenu(back);
    }
    public static void simServices(){
        System.out.println("""
                13. SIM services
                
                
                0<----""");
        int back = input.nextInt();
        backForMainMenu(back);
    }

}
