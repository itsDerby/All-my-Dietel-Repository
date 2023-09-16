package ChibuzoAssignment;

public class WeekendSnack2 {

    public static void main(String[] args) {
        testDrillerUtme(500);

    }
    public static int testDrillerUtme(int numberOfCopies) {
        int result = 0;
        if (numberOfCopies <= 4){
            result = numberOfCopies * 2000;
            System.out.printf("#%d" ,result);

        }
        else if(numberOfCopies <= 9){
            result = numberOfCopies * 1800;
            System.out.printf("#%d" ,result);

        }
        else if(numberOfCopies <=29){
            result = numberOfCopies * 1600;
            System.out.printf("#%d" ,result);


        }
        else if(numberOfCopies <=49){
            result = numberOfCopies * 1500;
            System.out.printf("#%d" ,result);

        }
        else if (numberOfCopies <= 99) {
                result = numberOfCopies * 1300;
                System.out.printf("#%d" ,result);

            }
            else if(numberOfCopies <=199){
                result = numberOfCopies * 1200;
                System.out.printf("#%d" ,result);


            }
            else if(numberOfCopies <= 499 ){
                result = numberOfCopies * 1100;
                System.out.printf("#%d" ,result);

            }
            else {
            result = numberOfCopies * 1000;
            System.out.printf("#%d" ,result);
        }
        return result;
    }
}

