package week2.automobile;

public class PetrolTank {

    private int totalVolumeTank;
    private int currentVolumeTank;

    public PetrolTank() {
    }


    public int getCurrentVolumeTank() {
        return currentVolumeTank;
    }

    public void setCurrentVolumeTank(int volume) {
        this.currentVolumeTank += volume;
    }

    public int getTotalVolumeTank() {
        return totalVolumeTank;
    }

    public void setTotalVolumeTank(int totalVolumeTank) {
        this.totalVolumeTank = totalVolumeTank;
    }

    public void decreaseCurrentFuelInTank(int volume){
        this.currentVolumeTank -= volume;
    }

}
