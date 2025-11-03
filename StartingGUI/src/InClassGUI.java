import javax.swing.*;
import java.awt.*;

public class InClassGUI {
    private JFrame jFrame;
    private JButton jButton;
    private JPanel jPanel;
    private JTextField jTextField;
    private JTextArea jTextArea;
    private JCheckBox skiCheckBox;
    private JCheckBox runCheckBox;
    private JCheckBox danceCheckBox;
    private JList jList;


    public InClassGUI(){
        jFrame = new JFrame();
        jFrame.add(jButton, BorderLayout.NORTH);
        jFrame.setSize(500, 100);
        jFrame.setVisible(true);

        //event source >> like a button
        //event >> click, enter into a box
        //Listener >> run method when we do the event

        public void addActionListenerButton(ActionListener listener){
            jButton.addActionListener(listener);

        }

        /*
        MODEL/VIEW/CONTROLLER...
        DESIGN: Data/logic
        VIEW: Represents the user interfce that interacts with user (buttons, text area)
        CONTROLLER: Handles user input and
         */

        /*
        jTextField = new JTextField();
        jTextField.setText("some text to be displayed");

        jFrame = new JFrame();
        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

        jTextArea = new JTextArea();
        jTextArea.append("some text");
        jFrame.add(jTextArea, BorderLayout.SOUTH);

        skiCheckBox = new JcheckBox("Skiing");
        runCheckBox = new JcheckBox("running");
        danceCheckBox = new JcheckBox("dancing");

        jPanel.add(skiCheckBox);
        jPanel.add(runCheckBox);
        jPanel.add(danceCheckBox);


        jPanel.add(new JButton("a"));
        jPanel.add(new JButton("b"));
        jPanel.add(new JButton("c"));
        jPanel.add(new JButton("d"));
        jPanel.add(new JButton("e"));
        jFrame.add(jPanel);

        jFrame.setSize(500, 500);
        jPanel.setPreferredSize(new Dimension(500, 100));

        String[] text = {"ski", "hike", "bike"};

        jList = new JList<>(text);  //array of objects or values

         */


        //BorderLayout  North, East, South, West, Center
        /*
        JButton northButton = new JButton("North");
        JButton eastButton = new JButton("East");
        JButton southButton = new JButton("south");
        JButton westButton = new JButton("west");
        JButton centerButton = new JButton("center");
        */
        //
         /*
        jFrame.add(northButton, BorderLayout.NORTH);
        jFrame.add(eastButton, BorderLayout.EAST);
        jFrame.add(southButton, BorderLayout.WEST);
        jFrame.add(westButton, BorderLayout.SOUTH);
        jFrame.add(centerButton, BorderLayout.CENTER);
        jFrame.setVisible(true);
        */
    }

}
