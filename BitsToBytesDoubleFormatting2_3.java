
package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Kafaka157
 */
public class BitsToBytesDoubleFormatting2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bits = Integer.parseInt(JOptionPane.showInputDialog("Please enter "
                + "the number of bits", "Bits"));
        
        double bytes = bits / 8;
        // used to set the vale of miles to 2 decimal places. Requires import DecimalFormat.
        
        DecimalFormat df = new DecimalFormat("####0.##");
      
        // note the use of df.format() for printing, required or else the above does nothing.
        JOptionPane.showMessageDialog(null, bits + " bits is " + df.format(bytes) 
                + " bytes" );
        
        
    }
    
}
