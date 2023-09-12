package tdd;

public class BikeAss {
    private boolean isOn;
    private int speed;
    private int gear;

    public void key(){
        if(!isOn) {
            this.isOn = true;
        }
        else {
            this.isOn = false;
        }
    }

    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }
    public void accelerate(){

        if(speed >= 0 && speed <= 19 ) {
            speed += 1;
            this.gear = 1;
        }

        else if(speed == 21 || speed <= 29){
            speed += 2;
            this.gear = 2;
        }
        else if (speed == 31 || speed <= 39){
            speed = speed +3;
            this.gear = 3;
        }
        else if  (speed > 40){
            speed = speed +4;
            this.gear = 4;
        }
    }
    public int getGear(){
        return gear;
    }

    public int getSpeed() {

        return speed;
    }
    public void decelerate(){
        if(speed <= 19 && speed >0 ) {
            speed -= 1;
            this.gear = 1;
        }

        else if(speed == 21 || speed <= 29){
            speed -= 2;
            this.gear = 2;
        }
        else if (speed == 31 || speed <= 39){
            speed = speed -3;
            this.gear = 3;
        }
        else if  (speed > 40 ){
            speed = speed -4;
            this.gear = 4;
        }
    }
}

