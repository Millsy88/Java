/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Kafaka157
 */
public class CalculateInterestDoubleFormatting2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //diirect conversion to double from input
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the principal amount (numbers only)", "£0"));
        
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the rate of interest (numbers only)", "0%"));
        
        double duration = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the duration (numbers only)", "0 months"));
        
        double interest = (amount * rate * duration) /100 ;
        // used to set the vale of miles to 2 decimal places. Requires import DecimalFormat.
        
        DecimalFormat df = new DecimalFormat("####0.##");
      
        // note the use of df.format() for printing, required or else the above does nothing.
        JOptionPane.showMessageDialog(null,"For the principal amount " + df.format(amount) +
                " with an interest rate of " + df.format(rate) + " over " + df.format(duration) + 
                " months your simple interest would be £" + df.format(interest));
    }
    
}
