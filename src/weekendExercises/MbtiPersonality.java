package weekendExercises;

import java.util.Scanner;

public class MbtiPersonality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MBTI personality Test");
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        String [] responses = new String[questions.length];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("A " + answers[i][0]);
            System.out.println("B " + answers[i][1]);
            System.out.println("Pick either A or B: ");

            String response = scanner.nextLine();;
            while(!response.equals("A") && !response.equals("B")){
                System.out.println("Invalid input, Please enter A or B ");
                System.out.println("Pick either A or B:");
                response = scanner.nextLine();

            }
            responses[i] = response;


        }
        String personalityTrait = " ";
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":" + questions[i] + "-Answer: " + answers[i][responses[i].charAt(0) - 'A']);
        }
//        System.out.println("Your personality trait: " + personality_traitss[personalityTrait.charAt(0) - 'A']);

    }
    public static String[] questions = {
            " Do you expand energy, enjoy groups or you conserve energy and enjoy one on one",
            " Do you interpret literally or you look for meaning and possibilities",
            " Are you logical,thinking, questioning or you are empathetic, feeling and accommodating ",
            " Are you organized, orderly or flexible, adoptable",
            " Are you more outgoing, think out loud or more reserved, think to yourself?",
            " Are you practical, realistic, experiential or imaginative, innovative, theoretical",
            " Are you candid, straight forward, frank or tactful, kind and encouraging",
            " Do you plan, schedule or you are unplanned, spontaneous",
            " Do you seek many tasks, public activities, interaction with others or you seek private, solitary activities with quiet to concentrate",
            " Are you standard, usual, conventional or different, novel, unique",
            " Are you firm, tend to criticize, hold the line or gentle, tend to appreciate, conciliate",
            " Are you regulated, structured or easy-going, live and let live",
            " Are you external, communicative, express yourself kind of person or internal, reticent, keep to yourself ",
            " Do you focus on here-and-now or you look to the future, global perspective, big picture",
            " Are you tough-minded, just or tender-hearted, merciful",
            " Do you make preparations and plan ahead or you go with the flow, adapt as you go",
            " Are you active and initiative or you are reflective and deliberate?",
            " Are you a facts, things, what is or ideas, dreams, what could be, philosophical?",
            " Are you a matter of fact, issue-oriented or you are sensitive, people-oriented, compassionate?",
            " Do you love to control or govern or you love  latitude and freedom"


    };
    public static String[][] answers = {
            {"Expand energy, enjoy groups ", "Conserve energy, enjoy one on one"},
            {"Interpret literally" , "Look for meaning and possibilities"},
            {"Logical, thinking, questioning" , "Empathetic, feeling, accommodating"},
            {"organized, orderly" , "flexible, adaptable"},
            {"more outgoing, think out loud" , "more reserved, think to yourself?"},
            {" practical, realistic, experiential" , "imaginative, innovative, theoretical"},
            {" candid, straight forward", "frank or tactful, kind and encouraging"},
            {" plan, schedule" ,"unplanned, spontaneous"},
            {" seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"},
            {" standard, usual, conventional" ,"different, novel, unique"},
            {" firm, tend to criticize" ,"hold the line or gentle, tend to appreciate, conciliate"},
            {" regulated, structured" , "easy-going, live and let live"},
            {" external, communicative, express yourself kind of person" , "internal, reticent, keep to yourself "},
            {" focus on here-and-now" , "look to the future, global perspective, big picture"},
            {" tough-minded, just" , "tender-hearted, merciful"},
            {" make preparations and plan ahead" , "go with the flow, adapt as you go"},
            {" active and initiative" , "reflective and deliberate?"},
            {" facts, things, what is" , "ideas, dreams, what could be, philosophical?"},
            {" matter of fact, issue-oriented" , "you are sensitive, people-oriented, compassionate?"},
            {" control , govern" , "latitude and freedom"}

    };

    public static String [] personality_traitss = {
            "Extrovert",
            "Introvert",
            "Sensitive",
            "Intuitive",
            "Thoughtful",
            "Perceiving",
            "Judging"
    };


}
