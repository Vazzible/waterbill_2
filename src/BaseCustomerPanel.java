import javax.swing.*;

public class BaseCustomerPanel extends JPanel implements CustomerPanel{
    @Override
    public Customer createCustomer(String name, int gallonsUsed) {
        //controller is going to decide what customer to create
        return null;
    }
}
