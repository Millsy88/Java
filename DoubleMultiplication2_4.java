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
public class DoubleMultiplication2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter " + 
                "the first number", "0"));
        
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter " +
                "the second number", "0"));
        
        double answer = num1 * num2;
        // used to set the vale of miles to 2 decimal places. Requires import DecimalFormat.
        
        DecimalFormat df = new DecimalFormat("####0.##");
      
        // note the use of df.format() for printing, required or else the above does nothing.
        JOptionPane.showMessageDialog(null, "The product of " + df.format(num1) + " and " 
                + df.format(num2) + " to two decimal places is " + df.format(answer) );
    }
    
}
