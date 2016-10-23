/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import javax.swing.JOptionPane;

/**
 *
 * @author Kafaka157
 */
public class IntToStringReverseString2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number", "0"));
             
        String string = String.valueOf(number);
        String reverse = new StringBuffer(string).reverse().toString();
        
        JOptionPane.showMessageDialog(null, "The reverse of " + number + " is " + reverse);


        
        
    }
    
}
