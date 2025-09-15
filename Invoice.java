
import java.util.Date;

public class Invoice {
    private Date date;
    private String customerId;
    private String salespersonId;
    private String vehicleSerialNumber;
    private double tradeInAllowance;
    private double taxes;
    private double licenseFees;
    private double finalPrice;
    private String customerSignature;

    public Invoice(Date date, String customerId, String salespersonId, String vehicleSerialNumber,
                   double tradeInAllowance, double taxes, double licenseFees, double finalPrice,
                   String customerSignature) {
        this.date = date;
        this.customerId = customerId;
        this.salespersonId = salespersonId;
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.tradeInAllowance = tradeInAllowance;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.finalPrice = finalPrice;
        this.customerSignature = customerSignature;
    }

    public void displayInfo() {
        System.out.println("Invoice Date: " + date);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Salesperson ID: " + salespersonId);
        System.out.println("Vehicle Serial #: " + vehicleSerialNumber);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Signature: " + customerSignature);
    }
}
