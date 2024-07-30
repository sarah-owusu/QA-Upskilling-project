package project2;

public  class Car extends Vehicles{

    private int numberOfTyres;

    public Car(String licenseNumber, double rentalRatePerDay, String make, int numberOfTyres) {
        super(licenseNumber, rentalRatePerDay, make);
        this.numberOfTyres = numberOfTyres;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

}
