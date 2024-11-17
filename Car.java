package test2;

public class Car {
    public String name = "Toyota";
    protected String model = "Vitz";
    boolean isStarted = true;
    private int speed = 60;

    public void printData(){
        System.out.println(name + " " + model + " " + isStarted + " " + speed);

    }
    
}
