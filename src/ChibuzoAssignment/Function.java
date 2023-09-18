package ChibuzoAssignment;

public class Function {

    public double collectionRate(int amount){
        if (amount < 0){
            double salary = 0;
            return salary;
        }
        else if (amount < 50){
            double salary = amount * 160 + 5000;
            return salary;
        }
        else if(amount <= 59){
            double salary = amount * 200 + 5000;
            return salary;
        }
        else if (amount <= 69){
            double salary = amount * 250 + 5000;
            return salary;
        }
        else {
            double salary = amount * 500 + 5000;
            return salary;
        }


    }
}
