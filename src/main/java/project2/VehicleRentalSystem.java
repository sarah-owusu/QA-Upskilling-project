package project2;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicles bike = new Bike("Gw123", 5, "Suzuki", 200);
        Vehicles car = new Car("Gw123", 10, "Suzuki", 4);
        Vehicles truck = new Truck("Gw123", 50, "Suzuki", 4 );

        List<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(bike);
        vehicles.add(car);
        vehicles.add(truck);

        for (Vehicles vehicle : vehicles) {
            System.out.println(" Fifthy days cost is " + vehicle.calculateRentalCost(3));

        }

    }
}
