import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    private final double SINGLE_BASE = 13.21;
    private final int SINGLE_TIER1 = 7000;
    private final double SINGLE_TIER1_COST = 2.04;
    private final int SINGLE_TIER2 = 6000;
    private final double SINGLE_TIER2_COST = 2.35;
    private final double SINGLE_TIER3_COST = 2.70;
    private final double DUPLEX_BASE = 15.51;
    private final int DUPLEX_TIER1 = 9000;
    private final double DUPLEX_TIER1_COST = 1.97;
    private final int DUPLEX_TIER2 = 4000;
    private final double DUPLEX_TIER2_COST = 2.26;
    private final double DUPLEX_TIER3_COST = 2.60;
    private final int TIER2_CUTOFF = 13000;
    private final double GALLONS = 1000.0;

    private String name = null;
    private int gallonsUsed = 0;
    private int customerType = 0; // 1 - single fam, 2 - duplex
    private double bill = 0;
    
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

    public void calculateBill() {
        if (customerType == 1) {
            if (gallonsUsed <= SINGLE_TIER1) {
                bill = SINGLE_BASE + gallonsUsed * (SINGLE_TIER1_COST / GALLONS);
            } else if (gallonsUsed <= TIER2_CUTOFF) {
                bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / GALLONS)
                        + (gallonsUsed - SINGLE_TIER1) * (SINGLE_TIER2_COST /
                        GALLONS);
            } else {
                bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / GALLONS)
                        + SINGLE_TIER2 * (SINGLE_TIER2_COST / GALLONS)
                        + (gallonsUsed - TIER2_CUTOFF) * (SINGLE_TIER3_COST /
                        GALLONS);
            }
        } else {
            if (gallonsUsed <= DUPLEX_TIER1) {
                bill = DUPLEX_BASE + gallonsUsed * (DUPLEX_TIER1_COST / GALLONS);
            } else if (gallonsUsed <= TIER2_CUTOFF) {
                bill = DUPLEX_BASE + DUPLEX_TIER1 * (DUPLEX_TIER1_COST / GALLONS)
                        + (gallonsUsed - DUPLEX_TIER1) * (DUPLEX_TIER2_COST /
                        GALLONS);
            } else {
                bill = DUPLEX_BASE + DUPLEX_TIER1 * (DUPLEX_TIER1_COST / GALLONS)
                        + DUPLEX_TIER2 * (DUPLEX_TIER2_COST / GALLONS)
                        + (gallonsUsed - TIER2_CUTOFF) * (DUPLEX_TIER3_COST /
                        GALLONS);
            }
        }
    }

    public void printCustomerInfo() {
        System.out.println("Customer Type: " + customerType);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.println("Customer Name: " + name);
        System.out.printf("Total Bill: %.2f\n", bill);
    }
}
