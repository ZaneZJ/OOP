package L5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Objects;

/*
Change listing2 class ButtonDemo so that instead of the text
“You pressed Up.” an image with thumb up appears
and instead of the text  “You pressed down.”
an image with thumb down appears.
For image display use the class ImageIcon.
 */

public class ButtonDemo implements ActionListener {

    JLabel jlab;
    ImageIcon imageIcon;

    ButtonDemo() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Button Example");

        // Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(220, 150);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons.
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        // Add action listeners.
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        // Add the buttons to the content pane.
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        // Create a label.
        jlab = new JLabel("Press a button.");

        // Add the label to the frame.
        jfrm.add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Handle button events.
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Up")) {
            jlab.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("up.jpg")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        } else {
//            jlab.setText("You pressed down. ");
            jlab.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("down.jpg")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        }
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }

}
