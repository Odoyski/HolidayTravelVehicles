
public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;
    private String saleStatus;

    public Vehicle(String serialNumber, String name, String model, int year,
                   String manufacturer, double baseCost, String saleStatus) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
        this.saleStatus = saleStatus;
    }

    public void displayInfo() {
        System.out.println("Vehicle: " + manufacturer + " " + name + " " + model + " (" + year + ")");
        System.out.println("Base Cost: $" + baseCost);
        System.out.println("Status: " + saleStatus);
    }
}
