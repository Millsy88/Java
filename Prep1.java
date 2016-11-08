/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kafaka157
 */
public class Prep1 {
    /**
     * @param i
     * @param j
     * @return 
     */   
    public static int adder(int i , int j ){
        int k = i + j;
        return k;
    }
     /**
     * @param i
     * @param j
     * @param k
     * @return 
     */    
    public static int biggest(double i , double j, double k ){
        double max  = Math.max(Math.max(i,j),k);
        int answer = (int) Math.round(max); // closests whole int
        // int answer = (int) max; // rounded down
        return answer;
    }
     /**
     * @param i
     * @param j
     * @param k
     * @return 
     */ 
    public static boolean sameString(String i , String j, String k ){
        boolean answer = false;
        
        if (i.equalsIgnoreCase(j)){
            answer = true;
        } else if (i.equalsIgnoreCase(k)){
            answer = true;
        } else if (j.equalsIgnoreCase(k)){
            answer = true;
        }        
        return answer;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(adder(5, 4));
        //System.out.println(biggest(3.5, 4.6, 7.9));
        //System.out.println(sameString("Yes", "yes", "YES?"));
        
        /*JOptionPane.showMessageDialog(null, i + "+" + j + "=" + adder(i, j), 
                "Output from adder method", JOptionPane.INFORMATION_MESSAGE);                     
        JOptionPane.showMessageDialog(null, biggest(3.5, 4.6, 7.9), 
                "Output from biggest method", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, sameString("Yes", "yes", "YES?"),
                "Output from sameString method", JOptionPane.INFORMATION_MESSAGE);
        */
        
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        

        JPanel adderPanel = new JPanel();
        // The first argument in setPreferredSize() is length, the second height.
        adderPanel.setPreferredSize(new Dimension(300, 75));
        adderPanel.setLayout(new GridLayout(3,2));
        adderPanel.add(new JLabel("input number 1:"));
        adderPanel.add(num1);
        adderPanel.add(new JLabel("input number 2:"));
        adderPanel.add(num2);
        
        int result = JOptionPane.showConfirmDialog(null, adderPanel, 
                "Please enter two numbers to add together", 
                JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            int i = Integer.parseInt(num1.getText());
            int j = Integer.parseInt(num2.getText());
        JOptionPane.showMessageDialog(null, i + "+" + j + "=" + adder(i, j), 
                "Output from adder method", JOptionPane.INFORMATION_MESSAGE);            
        }
        
        JTextField num1_1 = new JTextField(5);
        JTextField num2_1 = new JTextField(5);
        JTextField num3_1 = new JTextField(5);
        

        JPanel biggestPanel = new JPanel();
        // The first argument in setPreferredSize() is length, the second height.
        biggestPanel.setPreferredSize(new Dimension(300, 75));
        biggestPanel.setLayout(new GridLayout(3,2));
        biggestPanel.add(new JLabel("input number 1:"));
        biggestPanel.add(num1_1);
        biggestPanel.add(new JLabel("input number 2:"));
        biggestPanel.add(num2_1);
        biggestPanel.add(new JLabel("input number 3:"));
        biggestPanel.add(num3_1);
        
        int result1 = JOptionPane.showConfirmDialog(null, biggestPanel, 
                "Please enter three double to see which is the biggest "
                        + "(answer returned as an interger)", 
                JOptionPane.OK_CANCEL_OPTION);
        if (result1 == JOptionPane.OK_OPTION) {
            double i = Double.parseDouble(num1_1.getText());
            double j = Double.parseDouble(num2_1.getText());
            double k = Double.parseDouble(num3_1.getText());
            
        JOptionPane.showMessageDialog(null, biggest(i, j, k) + " Is the biggest double returned"
                + " as an interger", "Output from biggest method", 
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        JTextField string1 = new JTextField(5);
        JTextField string2 = new JTextField(5);
        JTextField string3= new JTextField(5);
        

        JPanel sameStringPanel = new JPanel();
        // The first argument in setPreferredSize() is length, the second height.
        sameStringPanel.setPreferredSize(new Dimension(300, 75));
        sameStringPanel.setLayout(new GridLayout(3,2));
        sameStringPanel.add(new JLabel("input string 1:"));
        sameStringPanel.add(string1);
        sameStringPanel.add(new JLabel("input string 2:"));
        sameStringPanel.add(string2);
        sameStringPanel.add(new JLabel("input string 3:"));
        sameStringPanel.add(string3);
        
        int result2 = JOptionPane.showConfirmDialog(null, sameStringPanel, 
                "Please enter three strings to comapre if they contain the same words", 
                JOptionPane.OK_CANCEL_OPTION);
        if (result1 == JOptionPane.OK_OPTION){
            String i = string1.getText();
            String j = string2.getText();
            String k = string3.getText();
           JOptionPane.showMessageDialog(null, sameString(i, j, k),
                "Output from sameString method", JOptionPane.INFORMATION_MESSAGE); 
        }
                
    }
    
}
