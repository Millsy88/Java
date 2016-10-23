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
public class CalculationOfRevenueDoublePercentage2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the total number of company sales", "0"));
        
        double percentage = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the sales percentage of the central zone (numbers only)", "0%"));
        
        
        double sales = (total / 100) * percentage ;
        // used to set the vale of miles to 2 decimal places. Requires import DecimalFormat.
        
        DecimalFormat df = new DecimalFormat("####0.##");
      
        // note the use of df.format() for printing, required or else the above does nothing.
        JOptionPane.showMessageDialog(null,"Central zone sales " + df.format(sales));
    }
    
}
