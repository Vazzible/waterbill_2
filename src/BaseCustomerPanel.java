import javax.swing.*;
//when we implement an interface, we must instantiate the methods of that interface
public class BaseCustomerPanel extends JPanel implements CustomerPanel{
    @Override
    public Customer createCustomer(String name, int gallonsUsed) {
        //controller is going to decide what customer to create
        return null;
    }
}
