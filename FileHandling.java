/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author a9-mills
 */
public class FileHandling {

    public static void main(String[] args) {
        
        InputStream stream = FileHandling.class.getResourceAsStream("numbers.txt");
        Scanner scanner = new Scanner(stream);
        
        int totalNumbers = 0;
        int totalNegs = 0;
        int totalPos = 0;
        int totalZeros = 0;

               
        List<Integer> integers = new ArrayList<>();
        
        for(; scanner.hasNext() ;) {
            int n = scanner.nextInt();
                integers.add(n);         
            }
                
        int count = integers.size();
        
        for (int i = 0; i < count; i++){
            if(integers.get(i) > 0) {
                totalPos ++;
            } else if (integers.get(i) < 0) {
                totalNegs++;
            } else {
                totalZeros++;
            }
        
        }
        
        
        
        /*for(; scanner.hasNext() ;){
            int n = scanner.nextInt();
    
            if (n < 0) {
                totalNegs++;
            } else if (n > 0) {            \\Method Ben used. Much neater than
                totalPos ++;               \\ mine, no arrays etc.
            } else {
                totalZeros++;
            }

        totalNumbers++;
        
        }*/
       
        JOptionPane.showMessageDialog(null, count + " numbers and " + totalPos + " positive numbers, " 
                + totalNegs + " negative numbers and " + totalZeros + " zeros" );
    }
}



