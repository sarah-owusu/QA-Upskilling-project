package project2;

public class Vehicles {
    public Vehicles(String licenseNumber, double rentalRatePerDay, String make) {
        this.licenseNumber = licenseNumber;
        this.rentalRatePerDay = rentalRatePerDay;
        this.make = make;
    }

    private   String licenseNumber;
    private   double rentalRatePerDay;

    private String make;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double calculateRentalCost(int days){
        return rentalRatePerDay * days;
    }
}
