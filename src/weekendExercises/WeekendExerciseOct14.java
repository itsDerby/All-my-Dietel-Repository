package weekendExercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WeekendExerciseOct14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("Personality Test. Pick either A or B");

        String [] questionnaires = {
                    "Question 1: " +
                        "A. Expand energy, enjoy groups" +
                        "B. Conserve energy, enjoy one-on-one" +
                        "Question 2:" +
                        "A. Interpret literally" +
                        "B. Look for meaning and possibilities" +
                        "Question 3: " +
                            "A. Logical, thinking, questioning" +
                            "B. Empathetic, feeling, accomodating"};
        for (int index = 0; index < questionnaires.length ; index++) {
            System.out.println(questionnaires[index]);
        }
        char[] response = new char[questionnaires.length];
        System.out.println("MBTI PERSONALITY TEST");
        System.out.println("Answer A or B");
        for (int i = 0; i < questionnaires.length; i++) {
            System.out.println("Questions" +(i + 1) + questionnaires);
            while(true){
                String userResponses = scanner.nextLine();
                if ((userResponses.equals("A")) || userResponses.equals("B")){
                    response[i] = userResponses.charAt(0);
                    break;
                }
                else {
                    System.out.println("Please select A or B");
                }
            }

        }

    }


}