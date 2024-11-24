package interface_text;

public class AbstractVehicle implements vehicle {

    @Override
    public String getType() {
        return "";
    }

    @Override
    public double calculateMaintenanceCost() {
        return 0;
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public void move(int distance) {

    }

    @Override
    public void refuel(double amount) {

    }
    String name;
    double baseMaintenanceCost;
    int mileage;
    public AbstractVehicle(String name, double baseMaintenanceCost, int mileage) {
        this.name = name;
        this.baseMaintenanceCost = baseMaintenanceCost;
        this.mileage = mileage;
    }
}
