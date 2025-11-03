import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InClassController implements ActionListener {
    private InClassView inclassView;

    public void InClassView(InClassView view){
        this.inclassView = view;

        //call the views method that has the listener
        view.addActionListenerButton(this);
        view.addActionListenerButtonOther(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click");
    }
}
