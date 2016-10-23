
package chapter2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Kafaka157
 */
public class KiloToMilesDoubleFormating2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //diirect conversion to double from input
        double kilometers = Double.parseDouble(JOptionPane.showInputDialog("Converting "
                + "Kilometers to miles: ", "Kilometers"));
                
        double miles = kilometers / 1.609;
        // used to set the vale of miles to 2 decimal places. Requires import DecimalFormat.
        
        DecimalFormat df = new DecimalFormat("####0.##");
      
        // note the use of df.format() for printing, required or else the above does nothing.
        JOptionPane.showMessageDialog(null, kilometers + " is " + df.format(miles) );

    }
    
}
