import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController {
    public CustomerGUI view;
    public CustomerModel model;

    public CustomerController(CustomerGUI view){
        this.view = view;
        this.model = new CustomerModel();

        view.addActionListenerGenerateButton(new ActionListenerGenerateBill());

        view.addActionListenerDuplex(new ActionListenerDuplex());
        view.addActionListenerSignelFamily(new ActionListenerSingleFamily());

    }
    public class ActionListenerDuplex implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //inner class
                //@override
                    //createCustomer return new

            view.switchPanel(view.getBaseCustomerPanel());
            view.setCurrentPanel(new CustomerPanel() {
                @Override
                public Customer createCustomer(String name, int gallonsUsed) {
                    return new Duplex(name, gallonsUsed);
                }
            });
        }
    }
    public class ActionListenerSingleFamily implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.switchPanel(view.getSingleFamilyPanel());

        }
    }
    public class ActionListenerGenerateBill implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getNameField().getText();
            int gallons = Integer.parseInt(view.getGallonsField().getText());

            Customer c = view.getCurrentPanel().createCustomer(name, gallons);
            c.generateBill();

            view.setOutputArea("added \n" + c.printCustomerInfo());
        }
    }
}
