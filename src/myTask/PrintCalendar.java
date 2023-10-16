package myTask;

import tdd.Switch;

import java.util.Scanner;

public class PrintCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full year");
        int year = scanner.nextInt();

        System.out.println("Enter month Between 1 to 12");
        int month = scanner.nextInt();

        printMonth(year, month);
    }
    public static void printMonth(int years, int months){
        printMonthTitle(years, months);
        printMonthBody(years, months);
    }
    public static String getMonth(int month){
//        String monthName = " ";
//        switch (month){
//            case 1: monthName = "January";break;
//            case 2: monthName = "February";break;
//            case 3: monthName = "March";break;
//            case 4: monthName = "April";break;
//            case 5: monthName = "May";break;
//            case 6: monthName = "June";break;
//            case 7: monthName = "July";break;
//            case 8: monthName = "August";break;
//            case 9: monthName = "September";break;
//            case 10: monthName = "October";break;
//            case 11: monthName = "November";break;
//            case 12: monthName = "December";
//
//
//        }
//        return monthName;

        if(month < 0 || month >12){
            return ("invalid, please enter number between 1-12");
        }
        if (month == 1){
            return ("January");
        }
        else if (month == 2){
            return ("February");
        }
        else if (month == 3){
            return ("March");
        }
        else if (month == 4){
            return ("April");
        }
        else if (month == 5){
            return ("May");
        }
        else if (month == 6){
            return ("June");
        }
        else if (month == 7){
            return ("July");
        }
        else if (month == 8){
            return ("August");
        }
        else if (month == 9){
            return ("September");
        }
        else if (month == 10){
            return ("October");
        }
        else if (month == 11){
            return ("November");
        }
        return ("December");
    }

    public static void printMonthTitle(int year, int month){
        System.out.println("      "+getMonth(month)+ "   "+ year);
        System.out.println(".................................");
        System.out.println("Sun Tues Wed Thu Fri Sat Sunday");

    }
    public static void printMonthBody(int year, int month){
        int startDay = getStartDay(year, month);
                int numberOfDaysInAMonth = getNumberOfDaysInMonth(year,month);
        for (int i = 0; i < startDay ; i++) {
            System.out.println(" ");

        }
        for (int i = 0; i < numberOfDaysInAMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0){
                System.out.println()
                ;
            }
            System.out.println();

        }
    }
    public static int getStartDay(int year, int month){

        return 0;
    }
    public static int getTotalNumberOfDays(int year, int month){

        return 0;
    }
    public static int getNumberOfDaysInMonth(int year, int month){
        if(month == 1 || month== 3 || month == 5 || month ==7 || month == 8 || month == 10 || month == 12)return 31;
        else if (month== 4 || month == 6 || month == 9)return 30;
        else if(month == 2)return isLeapYear(year)? 29:28;

        else return 0;
    }

    public static boolean isLeapYear(int year){
        return false;
    }
}

