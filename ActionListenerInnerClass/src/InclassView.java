import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InclassView {
    private JFrame jFrame;
    private JButton jButton;

    public InclassView(){
        // instantiate our J widget or items
        jFrame = new JFrame();
        jButton = new JButton("click me");
    }

    public void initializeUI(){
        // add to frames and panels figure out the layout
        jFrame.add(jButton, BorderLayout.NORTH);
        jFrame.setSize(300, 500);
        jFrame.setVisible(true);
    }

    // Event Source >> like a button
    // Event >> click, enter into a box
    // Listener >> run method when we do the Event
    public void addActionListenerButton(ActionListener listener){
        // event source
        // we add the listener to the button
        jButton.addActionListener(listener);
    }
}
