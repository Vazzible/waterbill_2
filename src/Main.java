import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        Customer customer1 = new Customer();
        customer1.customerInput();
        customer1.calculateBill();
        customer1.setGallonsUsed(-1000);
        customer1.calculateBill();
        customer1.setGallonsUsed(-10000);
        customer1.printCustomerInfo();
    }
}