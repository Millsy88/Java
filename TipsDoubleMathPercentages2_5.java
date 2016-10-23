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
public class TipsDoubleMathPercentages2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the subltotal", "0"));
        
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the gratuity rate (numbers only)", "0%"));
        
        double gratuity = (num2 / 100) * num1;
        
        double total = num1 + gratuity;
        // used to set the vale of miles to 2 decimal places. Requires import DecimalFormat.
        
        DecimalFormat df = new DecimalFormat("####0.##");
      
        // note the use of df.format() for printing, required or else the above does nothing.
        JOptionPane.showMessageDialog(null, "The gratuity is £" + df.format(gratuity) + 
                " and your total is £" + df.format(total));
    }
    
}
