package tdd;

public class AirCon {
    private boolean isOn;
    private boolean isOff;

    private int temperature;


    public void setIsOn(boolean isOn) {

        this.isOn = isOn;
    }

    public boolean getIsOn() {

        return isOn;
    }

    public void setIsOff(boolean isOff) {

        if (isOff) this.isOff = true;
        else {
            this.isOff = false;
        }
    }

    public boolean getIsOff() {

        return isOff;
    }

    public void increaseTemperature(int increaseTemperature) {

        temperature += increaseTemperature;


    }

    public void decreaseTemperature(int decreaseTemperature) {

        temperature -= decreaseTemperature;
    }




}



