/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kafaka157
 */
public class Prep1 {
    
    // creates the find function, this takes two arguments, the var word and
    // an array. It then searches through the array, using for. If an element
    // in the array matches the var word (user input) it returns true
    // else return false.
    private static boolean find(String number, String elements[]) {
        for (String e: elements) {
            if (e.contains(number)) {
                return true;
            }
        }        
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        InputStream stream = Prep1.class.getResourceAsStream("search.txt");
        Scanner scanner = new Scanner(stream);
        
        String list[] = new String[20];
        
        //read in content, using the scanner.hasNext, this reads through
        //only if there is a next line.
        for (int i = 0; scanner.hasNext(); i++) {
            list[i] = scanner.next();
        }
        
        
        String number = JOptionPane.showInputDialog("Input number to look for: ");
        
        
        if (find(number, list)) {
            JOptionPane.showMessageDialog(null, number + " found");
        }
        else {
            JOptionPane.showMessageDialog(null, number + " not found");
        }
    }
}