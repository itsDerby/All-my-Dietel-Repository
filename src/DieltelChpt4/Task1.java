package DieltelChpt4;

public class Task1 {
    public int milesDriven;
    public int galonsUsed;

    public double average;

    public  double totalAverageValue = 0;
    public int userInput;


    public void setMilesDriven(int milesDriven){
        this.milesDriven = milesDriven;
    }
    public void setGalonsUsed(int galonsUsed){
        this.galonsUsed = galonsUsed;
    }
    public double averageValue(){
        average = milesDriven/galonsUsed;
        totalAverageValue += average;
        return average;


    }
    public double totalAverage(){

        return totalAverageValue;

    }


}
