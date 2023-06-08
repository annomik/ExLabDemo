package week2.automobile;

public class Main {

    public static void main( String[] args )  {
        Car ford = new Car(new Engine(), new PetrolTank(),2018, "Ford", 0);
        ford.getEngine().setTypeEngine("diesel");
        ford.getEngine().setAmountOfCylinders(6);
        ford.getPetrolTank().setTotalVolumeTank(50);
        ford.getPetrolTank().setCurrentVolumeTank(2);

        System.out.println("Current FuelInTank: " + ford.checkFuelInTank() + " liters");
        ford.drive();
        ford.startDrivingCar();
        ford.drive();
        ford.drive();
        System.out.println("Current FuelInTank: "+ ford.checkFuelInTank() + " liters");
        ford.turnOffCar();
        ford.refuelCar(2);
        ford.startDrivingCar();
        ford.drive();
        System.out.println("Car Mileage: " + ford.getCarMileage());


    }

}
