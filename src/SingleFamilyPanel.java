import javax.swing.*;
import java.awt.*;

public class SingleFamilyPanel extends JPanel implements CustomerPanel{

    private JCheckBox lowIncomeBox;
    public SingleFamilyPanel(){
        lowIncomeBox = new JCheckBox("Is Low Income");
        initializeUI();
    }

    private void initializeUI(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(lowIncomeBox);
    }

    @Override
    public Customer createCustomer(String name, int gallonsUsed) {
        return new SingleFamily(name, gallonsUsed, lowIncomeBox.isSelected());
    }
}
