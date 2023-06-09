package week2.automobile;

import java.util.Objects;

public class Car {

    private final Engine engine;
    private PetrolTank petrolTank;
    private int yearOfProduction;
    private String brand;
    private int carMileage;
    private boolean isCarStarting = false;

    public Car(Engine engine, PetrolTank petrolTank, int yearOfProduction, String brand, int carMileage) {
        this.engine = new Engine();
        this.petrolTank = new PetrolTank();
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.carMileage = carMileage;
    }

    public Car(Engine engine, PetrolTank petrolTank) {
        this.engine = engine;
        this.petrolTank = petrolTank;
    }

    public boolean isCarStarting() {
        return isCarStarting;
    }

    public void setCarStarting(boolean carStarting) {
        isCarStarting = carStarting;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage() {
        this.carMileage += 10;
    }

    public Engine getEngine() {
        return engine;
    }

    public PetrolTank getPetrolTank() {
        return petrolTank;
    }

    public void setPetrolTank(PetrolTank petrolTank) {
        this.petrolTank = petrolTank;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void drive(){
        if (petrolTank.getCurrentVolumeTank() > 0) {
            if (isCarStarting() ) {
                System.out.println("Car is driving");
                setCarMileage();
                petrolTank.decreaseCurrentFuelInTank(2);
            } else
                System.out.println("Engine isn't starting!");
        }else System.out.println("No fuel!");
    }

    public void startDrivingCar(){
        if(petrolTank.getCurrentVolumeTank() > 0) {
            engine.startEngine();
            System.out.println("Car is starting");
            setCarStarting(true);
        }else{
            System.out.println("No fuel!");
        }
    }

    public void turnOffCar(){
        engine.turnOffEngine();
        System.out.println("Car stopped");
    }

    public void refuelCar(int litersOfFuel){
        petrolTank.setCurrentVolumeTank(litersOfFuel);
        System.out.println("Car is fueled. Current: "
                + petrolTank.getCurrentVolumeTank() + " liters in the tank" );
    }

    public int checkFuelInTank(){
        return petrolTank.getCurrentVolumeTank();
    }


    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", petrolTank=" + petrolTank +
                ", yearOfProduction=" + yearOfProduction +
                ", brand='" + brand + '\'' +
                ", carMileage=" + carMileage +
                ", isCarStarting=" + isCarStarting +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && carMileage == car.carMileage && isCarStarting == car.isCarStarting && Objects.equals(engine, car.engine) && Objects.equals(petrolTank, car.petrolTank) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, petrolTank, yearOfProduction, brand, carMileage, isCarStarting);
    }
}
