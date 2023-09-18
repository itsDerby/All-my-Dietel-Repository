package ChibuzoAssignment;

public class WeekendSnack2 {

    public static void main(String[] args) {
        testDrillerUtme(500);

    }
    public static int testDrillerUtme(int numberOfCopies) {
        int result = 0;
        if (numberOfCopies <= 4){
            result = 2000;
            System.out.printf("#%d" ,result);

        }
        else if(numberOfCopies <= 9){
            result = 1800;
            System.out.printf("#%d" ,result);

        }
        else if(numberOfCopies <=29){
            result = 1600;
            System.out.printf("#%d" ,result);


        }
        else if(numberOfCopies <=49){
            result = 1500;
            System.out.printf("#%d" ,result);

        }
            else if (numberOfCopies <= 99) {
                result = 1300;
                System.out.printf("#%d" ,result);

            }
            else if(numberOfCopies <=199){
                result = 1200;
                System.out.printf("#%d" ,result);


            }
            else if(numberOfCopies <= 499 ){
                result = 1100;
                System.out.printf("#%d" ,result);

            }
            else {
            result = 1000;
            System.out.printf("#%d" ,result);
        }
        return result;
    }
}

