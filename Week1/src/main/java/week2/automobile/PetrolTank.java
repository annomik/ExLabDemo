package week2.automobile;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "PetrolTank{" +
                "totalVolumeTank=" + totalVolumeTank +
                ", currentVolumeTank=" + currentVolumeTank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetrolTank that = (PetrolTank) o;
        return totalVolumeTank == that.totalVolumeTank && currentVolumeTank == that.currentVolumeTank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalVolumeTank, currentVolumeTank);
    }
}
