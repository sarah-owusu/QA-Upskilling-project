package project2;

public class Bike extends Vehicles{

    public Bike(String licenseNumber, double rentalRatePerDay, String make, int maxSpeed) {
        super(licenseNumber, rentalRatePerDay, make);
        this.maxSpeed = maxSpeed;
    }
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
