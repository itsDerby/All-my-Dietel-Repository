package chapterThree;

import java.util.Scanner;

class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile myhealth = new HealthProfile("Ola" , "Judes" , "Female" , 19, 2 , 1990, 5.5, 52.1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first Name: ");
        String firstname1 = scanner.nextLine();
        myhealth.setFirstName(firstname1);

        System.out.println("Enter your Last name: ");
        String lastname = scanner.nextLine();
        myhealth.setLastName(lastname);

        System.out.println("Enter your Gender: ");
        String gender = scanner.nextLine();
        myhealth.setGender(gender);

        System.out.println("What is your day of Birth? ");
        int day = scanner.nextInt();
        myhealth.setDayOfBirth(day);

        System.out.println("What is your Month of Birth? ");
        int month = scanner.nextInt();
        myhealth.setMonthOfBirth(month);

        System.out.println("What is your year of Birth? ");
        int year = scanner.nextInt();
        myhealth.setYearOfBirth(year);
        myhealth.calculateAge();





        


        System.out.println(myhealth.getFirstName());
        System.out.println(myhealth.getLastName());
        System.out.println(myhealth.getGender());
        System.out.println(myhealth.getDayOfBirth());
        System.out.println(myhealth.getMonthOfBirth());
        System.out.println(myhealth.getAge());

    }

}