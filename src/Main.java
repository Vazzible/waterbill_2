import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        /*
        Customer customer1 = new Customer();
        SingleFamily singleFamily = new SingleFamily();
        singleFamily.customerInput();
        singleFamily.calculateBill();
        singleFamily.printCustomerInfo();

         */
        Duplex duplex = new Duplex();
        duplex.customerInput();
        duplex.calculateBill();
        duplex.printCustomerInfo();

    }
}