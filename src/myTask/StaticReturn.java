package myTask;

public class StaticReturn {
    public static void main(String[] args) {
//        System.out.println("The grade of the score: " + getGrade(74));
        getGrade(78);

    }
    public static char getGrade(double score){
        //it is returning a character
        if (score >= 90){
            return 'A';
        }
        else if (score >= 80){
            return 'B';
        }
        else if(score >= 70){
            return 'C';
        }
        else {
            return 'F';
        }
    }
}
