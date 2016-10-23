/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Kafaka157
 */
public class PrintATableOutFormatJTable2_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
        String output = "";
        List listA = new ArrayList();
        List listB = new ArrayList();
        List sum = new ArrayList();
        List product = new ArrayList();
        
    
        System.out.format ("%-10s%-10s%-10s%-10s", "a", "b", "a + b", "a* b");
        System.out.println("\n");
                
        for (int i = 0; i < 5; i++){           
            System.out.format ("%-10d%-10d%-10d%-10d", a, b, (a + b), (a * b));
            System.out.println("\n");
            
            output += a + "  " + b + "  " + (a + b) + "  " + (a * b) + "\n";
            
            listA.add(a);
            listB.add(b);
            sum.add(a + b);
            product.add(a * b);

            a += 1;
            b += 1;
        }
              
        JOptionPane.showMessageDialog(null, output, "a  b  a+b  a*b", JOptionPane.INFORMATION_MESSAGE);
        
        Object[] cols = {
            "a","b","a + b","a * b"
        };
        
        Object[][] rows = {
        {listA.get(0),listB.get(0),sum.get(0),product.get(0)},
        {listA.get(1),listB.get(1),sum.get(1),product.get(1)},
        {listA.get(2),listB.get(2),sum.get(2),product.get(2)},
        {listA.get(3),listB.get(3),sum.get(3),product.get(3)},
        {listA.get(4),listB.get(4),sum.get(4),product.get(4)}
        };
        
        JTable table = new JTable(rows, cols);
        JOptionPane.showMessageDialog(null, new JScrollPane(table));
    }
    
}
