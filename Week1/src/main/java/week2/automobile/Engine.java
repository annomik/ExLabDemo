package week2.automobile;

public class Engine {

    private String typeEngine;
    private int amountOfCylinders;

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public int getAmountOfCylinders() {
        return amountOfCylinders;
    }

    public void setAmountOfCylinders(int amountOfCylinders) {
        this.amountOfCylinders = amountOfCylinders;
    }

    public boolean startEngine(){
        System.out.println("Engine is working");
        return true;
    }

    public void turnOffEngine(){
        System.out.println("Engine stopped");
    }


}
