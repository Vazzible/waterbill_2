import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController {
    public CustomerGUI view;

    public CustomerController(CustomerGUI view){
        this.view = view;

        view.addActionListenerGenerateButton(new ActionListenerGenerateBill());

        view.addActionListenerDuplex(new ActionListenerDuplex());
        view.addActionListenerSignelFamily(new ActionListenerSingleFamily());

    }
    public class ActionListenerDuplex implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

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
