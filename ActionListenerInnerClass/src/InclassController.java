import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InclassController implements ActionListener {
    private InclassView inclassView;  // gives us access to our View

    public InclassController(InclassView view) {
        this.inclassView = view;

        // call the views method that has the listener
        view.addActionListenerButton(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click");
    }
}