import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        CustomerGUI customerGUI = new CustomerGUI();
        customerGUI.initializeUI();

        CustomerController customerController = new CustomerController(customerGUI);

        Customer customer = new SingleFamily("name", 0, 100, false);
    }
}