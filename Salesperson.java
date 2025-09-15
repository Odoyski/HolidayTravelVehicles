
public class Salesperson {
    private String salespersonId;
    private String name;

    public Salesperson(String salespersonId, String name) {
        this.salespersonId = salespersonId;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Salesperson ID: " + salespersonId);
        System.out.println("Name: " + name);
    }
}
