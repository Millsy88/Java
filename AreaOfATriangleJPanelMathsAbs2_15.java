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
public class AreaOfATriangleJPanelMathsAbs2_15 {


    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("####0.##");
        
        JTextField x1 = new JTextField(5);
        JTextField y1 = new JTextField(5);
        JTextField x2 = new JTextField(5);
        JTextField y2 = new JTextField(5);
        JTextField x3 = new JTextField(5);
        JTextField y3 = new JTextField(5);

        JPanel myPanel = new JPanel();
        // The first argument in setPreferredSize() is length, the second height.
        myPanel.setPreferredSize(new Dimension(300, 75));
        myPanel.setLayout(new GridLayout(3,2));
        myPanel.add(new JLabel("input x1:"));
        myPanel.add(x1);
        myPanel.add(new JLabel(" input y1:"));
        myPanel.add(y1);
        myPanel.add(new JLabel("input x2:"));
        myPanel.add(x2);
        myPanel.add(new JLabel(" input y2:"));
        myPanel.add(y2);
        myPanel.add(new JLabel("input x3:"));
        myPanel.add(x3);
        myPanel.add(new JLabel(" input y3:"));
        myPanel.add(y3);

        int result = JOptionPane.showConfirmDialog(null, myPanel, 
                "Please Enter Co-ordinates For The Triangles Points", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            
            double dx1 = Double.parseDouble(x1.getText());
            double dy1 = Double.parseDouble(y1.getText());
            double dx2 = Double.parseDouble(x2.getText());
            double dy2 = Double.parseDouble(y2.getText());
            double dx3 = Double.parseDouble(x3.getText());
            double dy3 = Double.parseDouble(y3.getText());

            double area = Math.abs((dx1*(dy2 - dy3) + dx2*(dy3 - dy1) + dx3*(dy1 - dy2)) / 2);
            
            JOptionPane.showMessageDialog(null, "Area of the triangle is " + df.format(area));
            
        }
        System.exit(0);
    }
    
}
