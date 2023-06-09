package week2.automobile;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Engine{" +
                "typeEngine='" + typeEngine + '\'' +
                ", amountOfCylinders=" + amountOfCylinders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return amountOfCylinders == engine.amountOfCylinders && Objects.equals(typeEngine, engine.typeEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeEngine, amountOfCylinders);
    }
}
