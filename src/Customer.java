import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Customer {

    private final int TIER2_CUTOFF = 13000;
    private final double GALLONS = 1000.0;

    private String name = null;
    private int gallonsUsed = 0;
    private int customerType = 0; // 1 - single fam, 2 - duplex
    private double bill = 0;

    Customer(){
        System.out.println("hello world");
    }
    
    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public int getCustomerType() {
        return customerType;
    }

    public double getBill() {
        return bill;
    }

    public int getTIER2_CUTOFF() {
        return TIER2_CUTOFF;
    }

    public double getGALLONS() {
        return GALLONS;
    }

    public void customerInput() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in); //input stream (holds input)
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);   //stream reader(reads input)
        try {
            System.out.print("Enter customer type 1-single Family, 2-Duplex: ");
            customerType = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Enter your name: ");
            name = bufferedReader.readLine();

            System.out.print("Enter gallons used: ");
            gallonsUsed = Integer.parseInt(bufferedReader.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    protected abstract double calculateBill();

    public void generateBill(){
        double calculateBill = calculateBill();
        if(calculateBill < 0){
            System.out.println("This bill must be positive");
        } else{
            System.out.println("coolio");
        }
    }

    public void printCustomerInfo() {
        System.out.println("Customer Type: " + customerType);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.println("Customer Name: " + name);
        System.out.printf("Total Bill: %.2f\n", bill);
    }
}
