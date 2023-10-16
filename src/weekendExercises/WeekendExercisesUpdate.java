package weekendExercises;

import tdd.Switch;

import java.util.Scanner;

public class WeekendExercisesUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Personality Test");
        String questionnaire = scanner.nextLine();
        switch (questionnaire){
            case "1":
                System.out.println("""
                        Please select either A or B
                        Question 1:
                        A.  Expand energy, enjoy groups
                        B.  Conserve energy, Enjoy one-on-one""");
                String reply = scanner.nextLine();



            case "2":
                System.out.println("""
                        Question 2:
                        A.  Interpret Literally
                        B. Look for meaning and possibilities""");
                break;
            case "3":
                System.out.println("""
                            Question 3:
                            A.  Logical thinking, questioning
                            B.  Empathetic, feeling, accomodating""");
                break;

        }
//        public static void response(char userResponses,int count){
//            if(userResponses == 'A'){
//                count += 1;
//            }
//            else{
//                count += 1;
//            }
//
//        }
    }
}
