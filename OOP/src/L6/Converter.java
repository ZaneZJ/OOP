/*
 *  File: Converter.java
 *  Author: Java, Java, Java
 *  Description: This class creates a GUI interface for
 *   the MetricConverter application using the Java Swing
 *   component set. It illustrates the use of some of the
 *   primary components of Swing, including JFrame, JTextField,
 *   JTextArea, and JButton. The top-level window for a Swing
 *   application is a JFrame. The event model for Swing is the
 *   same as that used in JDK 1.1. So to handle action events
 *   for the application, an ActionListener interface is implemented.
 */

package L6;

import javax.swing.*;             // Packages used
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame implements ActionListener{

    private JLabel prompt = new JLabel("Distance in miles: "); 
    private JTextField input = new JTextField(6);
    private JTextArea display = new JTextArea(10,20);
    private JButton convert = new JButton("Convert!");

//

    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    ButtonGroup G1;

    /**
     *  Converter() constructor sets the layout and adds
     *  components to the top-level JFrame. Note that components
     *  are added to the ContentPane rather to the JFrame itself.
     */
    public Converter() {
        getContentPane().setLayout(new FlowLayout()); 
        getContentPane().add(prompt);
        getContentPane().add(input);
        getContentPane().add(convert);
        getContentPane().add(display);
        display.setLineWrap(true);
        display.setEditable(false);
        convert.addActionListener(this);
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        G1 = new ButtonGroup();
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("km to miles");
        jRadioButton2.setText("miles to km");
        jRadioButton1.setBounds(120, 30, 120, 50);
        jRadioButton2.setBounds(250, 30, 80, 50);
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
    } // Converter()
  
    /**
     *  actionPerformed() handles all action events for the program.
     *   In this case static methods of the MetricConverter class are
     *   called to perform the conversions requested by the user. The
     *   user's input is taken from a JTextField and the results are
     *   appended to a JTextArea.
     *  @param e -- the ActionEvent which prompted this method call
     */
    public void actionPerformed(ActionEvent e) {
        if (jRadioButton2.isSelected()) {
            double miles = Double.valueOf(input.getText()).doubleValue();
            double km = MetricConverter.milesToKm(miles);
            display.append(miles + " miles equals " + km + " kilometers\n");
        } else if (jRadioButton1.isSelected()) {
            double km = Double.valueOf(input.getText()).doubleValue();
            double miles = MetricConverter.kmToMiles(km);
            display.append(km + " km equals " + miles + " miles\n");
        }
    } // actionPerformed()

    /**
     *  main() creates an instance of this (Converter) class and sets
     *   the size and visibility of its JFrame. 
     *  An anonymous class is used to create an instance of the 
     *   WindowListener class, which handles the window close events
     *   for the application.
     */
    public static void main(String args[]) {
        try {
           UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) { }
        Converter f = new Converter();
        f.setSize(400, 300);  
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {      // Quit the application
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    } // main()
} // Converter
