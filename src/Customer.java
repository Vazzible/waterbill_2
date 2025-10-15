import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Customer implements Comparable<Customer> {

    private final int TIER2_CUTOFF = 13000;
    private final double GALLONS = 1000.0;

    private String name = null;
    private int gallonsUsed = 0;
    private int customerType = 0; // 1 - single fam, 2 - duplex
    private double bill = 0;

    /*
    private int[] test = new int[5];
    private ArrayList<Integer> something = new ArrayList<>();
    */
    private static ArrayList<Customer> AllCustomer = new ArrayList<>();
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

    public static ArrayList<Customer> getAllCustomer() {
        return AllCustomer;
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

    public static Customer getHighestBill(){
        Customer max = getAllCustomer().get(0);
        for(Customer c : getAllCustomer()){
         if(c.getBill() < max.getBill()){
            max = c;
         }
        }
        return max;
    }
    public static Customer getLowestBill(){
        Customer min = getAllCustomer().get(0);
        for(Customer c : getAllCustomer()){
            if(c.getBill() < min.getBill()){
                min = c;
            }
        }
        return min;
    }

    protected abstract double calculateBill();

    public void generateBill(){
        double calculateBill = calculateBill();
        double finalBill = applyDiscount(calculateBill);
        if(finalBill < 0){
            System.out.println("This bill must be positive");
        } else{
            this.bill = finalBill;
            System.out.println("coolio");
            registerCustomer();
        }
    }

    protected void registerCustomer(){
        AllCustomer.add(this);
    }

    protected double applyDiscount(double calculatedBill){
        return calculatedBill;
    }

    public void printCustomerInfo() {
        System.out.println("Customer Type: " + customerType);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.println("Customer Name: " + name);
        System.out.printf("Total Bill: %.2f\n", bill);
    }

    @Override
    public String toString(){
        return "Customer Name: " + name + "\n GallonsUsed: " + gallonsUsed + "\n Total_Bill: " + bill +"\n";
    }
    public static void sortCustomerByBill(){
        Collections.sort(getAllCustomer());
    }

    @Override
    public int compareTo(Customer o) {
        // -1 this obj < o: Means this obj is smaller and must come first.
        // 0 this obj == o: Equality, nothing happens.
        //1 this obj > o: Obj is larger, and must come after.

        return Double.compare(this.bill, o.bill);
    }
}
