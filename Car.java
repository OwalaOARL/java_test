package test2;

public class Car {
    public String name = "Toyota";
    protected String model = "Vitz";
    boolean isStarted = true;
    private int speed = 80;

    public void printData(){
        System.out.println(name + " " + model + " " + isStarted + " " + speed);

    }
    
}
public class Animal {
    public String name = "Dog";
    protected String type = "Boxer";
    boolean isStarted = true;
   

    public void printData(){
        System.out.println(name + " " + type + " " + isStarted );

    }
    
}
