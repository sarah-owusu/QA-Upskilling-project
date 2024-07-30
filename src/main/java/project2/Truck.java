package project2;

public class Truck extends Vehicles{
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Truck(String licenseNumber, double rentalRatePerDay, String make, int numberOfDoors) {
        super(licenseNumber, rentalRatePerDay, make);
        this.numberOfDoors = numberOfDoors;
    }
}
