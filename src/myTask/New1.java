package myTask;


public class New1 {
    public static void main(String[] args) {
//        System.out.print("Grade is ");
        printGrade(74);
        printGrade(89);
        printGrade(-2);
        xMethod(34, 56);
        nprint("Come here", 5);
        nameSake("Get Here" , 6);

    }
    public static void printGrade(double score){
        if (score < 0 || score > 100)
            return;
        if (score >= 90){
            System.out.println("A");
        }
        else if (score >= 80){
            System.out.println("B");
        }
        else if(score >= 70){
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }

    }
    public static double xMethod(double x, double y){
        while (x < y){
            y--;
        }
        return y;
    }
    public static void nprint(String message, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(message);

        }
    }
    public static void nameSake(String name, int timesOccur){
        for (int count = 0; count < timesOccur; count++) {
            System.out.println("Bukky no well");

        }

    }



}
