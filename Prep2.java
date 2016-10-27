/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kafaka157
 */
public class Prep2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */   
       
    public static void main(String[] args) throws FileNotFoundException {
                
    
        InputStream stream = Prep2.class.getResourceAsStream("words.txt");
        Scanner scanner = new Scanner(stream).useDelimiter("[ ,!?.]");            
        boolean wordFound = false;//initially set it to false

        String word = JOptionPane.showInputDialog("Input word to look for: ");
        int count = 0;

        while(scanner.hasNext()){
            
            // outer loop is required to make sure that the whole document is searched.
            if(word.equalsIgnoreCase(scanner.next().trim())){
                wordFound = true; //make the flag as true and break out of the loop 
                count ++;
            }
        }
        scanner.close();
        
        if(wordFound){
            JOptionPane.showMessageDialog(null, "The word " + word + " was found " + count + " times ");// found
        }else{
            JOptionPane.showMessageDialog(null,word + " not found");// not found
        }
    }
}

 
