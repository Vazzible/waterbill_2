import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController {
    public CustomerGUI view;

    public CustomerController(CustomerGUI view){
        this.view = view;
        view.addActionListenerGenerateButton(new ActionListenerGenerateBill());
    }
    public class ActionListenerGenerateBill implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getNameField().getText();
            int gallons = Integer.parseInt(view.getGallonsField().getText());

            Customer c = new Duplex(name, gallons);
            c.generateBill();
        }
    }
}
