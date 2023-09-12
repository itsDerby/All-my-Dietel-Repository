package myPractice;

public class Human {

    private String name;
    private String age;
    private String location;

    //method to set name in the object
    public void setName(String name){
        this.name = name;
    }
    //method to set age in the object
    public  void setAge (String age){
        this.age = age;
    }
    public void setLocation(String  location){
        this.location = location;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }

    public String getLocation() {
        return location;
    }
}
