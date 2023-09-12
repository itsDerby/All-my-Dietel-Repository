package myPractice;

import java.util.Scanner;

class HumanTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human tolani = new Human();
        System.out.println(tolani.getName());
        System.out.println("What is the name?");
        String name1 = scanner.nextLine();
        tolani.setName("Jane Green");
        System.out.println(tolani.getName());
        System.out.println(tolani.getAge());
    }

}