/*
 *  File: FontNames.java
 *  Author: Java, Java, Java
 *  Description:  This application gets the names of the first 10
 *   fonts stored in the GraphicsEnvironment. Fonts are system dependent. 
 */

package L6;

import java.awt.*;
import javax.swing.*;

public class FontNames extends JPanel {
   /**
    *  paint() is called automatically to paint the JApplet each time
    *   it needs it. Note the use of vRef and vGap to space the fonts.
    */
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
       // Get the font names available in this graphics environment
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = ge.getAvailableFontFamilyNames();
		
       // Display the first 10 fonts	
        int vRef = 30; 
        int vGap = 15;
        g.drawString("The amount of fonts are: " + fonts.length, 30, vRef);
        for (int k = fonts.length - 10; k < fonts.length; k++) {
            vRef += vGap;
            Font font = new Font(fonts[k], Font.PLAIN, 12);
//        	g.drawString("Font " + (k+1) + " = " + fonts[k],30,vRef);
            g.setFont(font);
            g.drawString("Hello World!",30,vRef);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 12));
            g.drawString(fonts[k],200,vRef);
        }
    } // paint()
    
    public static void main(String args[]) {
        FontNames c = new FontNames();
        JFrame f = new JFrame();
		f.getContentPane().add(c);
        f.setTitle("Font Names");
        f.pack();
        f.setSize(400,300);
        f.setVisible(true);
    }
} // FontNames
