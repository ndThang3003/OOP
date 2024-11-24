package interface_text;

public interface vehicle {
    String getType();
    double calculateMaintenanceCost();
    void displayInfo();
    void move(int distance);
    void refuel(double amount);
}
