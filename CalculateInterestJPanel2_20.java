/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kafaka157
 */
public class CalculateInterestJPanel2_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        DecimalFormat df = new DecimalFormat("####0.##");
        
        JTextField balance = new JTextField(10);
        JTextField rate = new JTextField(5);


        JPanel myPanel = new JPanel();
        // The first argument in setPreferredSize() is length, the second height.
        myPanel.setPreferredSize(new Dimension(400, 20));
        myPanel.setLayout(new GridLayout(1,1));
        myPanel.add(new JLabel("Balance:"));
        myPanel.add(balance);        
        myPanel.add(new JLabel("Interest Rate:"));
        myPanel.add(rate);  
        


        int result = JOptionPane.showConfirmDialog(null, myPanel, 
                "Please Enter Balance and Interest Rate (e.g. 3 for 3%)", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            
            double dbalance = Double.parseDouble(balance.getText());
            double drate = Double.parseDouble(rate.getText());


            double interest = dbalance * (drate / 1200);
            
            JOptionPane.showMessageDialog(null, "The interest is " + df.format(interest));
        }
    }
    
}
