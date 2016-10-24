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
public class IntToASCII2_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int ascii = Integer.parseInt(JOptionPane.showInputDialog("Please enter an "
                 + "ASCII code (within the range of 97 - 122): "));
                         
        char lowerCase = (char) ascii;
        char upperCase = (char) (ascii - 32);
        
        
        System.out.println(lowerCase);
        
        JOptionPane.showMessageDialog(null,"The number " + ascii + " is lower case " + 
                lowerCase + " in ASCII. It's equivalent upper case character is "
                        + upperCase + " and it's number is " + (ascii - 32));
            
    
    }
    
}
