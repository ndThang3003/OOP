package interface_text;

public class Bicycle extends AbstractVehicle {
    public Bicycle(String name, double baseMaintenanceCost, int mileage) {
        super(name, baseMaintenanceCost, mileage);
    }
    public double calculateMaintenanceCost(){
        return baseMaintenanceCost + mileage;
    }
}
