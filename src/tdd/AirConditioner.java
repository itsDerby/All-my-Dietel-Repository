package tdd;

    public class AirConditioner {
    private boolean isOn;
    private boolean isOff;
    private int temperature;

    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }
        public boolean getIsOn(){
            return isOn;
        }
    public void setIsOff(boolean isOff){
        this.isOff = isOff;
    }
    public boolean getIsOff(){
        return isOff;
    }

        public void turnOn() {
        isOn = true;
        System.out.print("It is on");
        }
        public void turnOff(){
        isOff = false;
        System.out.print("It is Off");
        }


    }


