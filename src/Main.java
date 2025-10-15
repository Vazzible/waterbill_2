import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        Customer customer = new SingleFamily();
        Customer customer2 = new Duplex();
        customer.customerInput();
        customer.generateBill();

        customer2.customerInput();
        customer2.generateBill();
        Customer.sortCustomerByBill();
        System.out.print(Customer.getHighestBill());


        for(Customer c : Customer.getAllCustomer()){
            c.printCustomerInfo();
        }

    }
}