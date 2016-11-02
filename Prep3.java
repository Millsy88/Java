/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Kafaka157
 */
public class Prep3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InputStream stream = Prep3.class.getResourceAsStream("words.txt");
        Scanner input = new Scanner(stream);
        
        int lineCount = 0;
        int lineCount2 = 0;
        int lineCount3 = 0;
        int wordCount = 0;
        int charCount = 0;
                
        List<Integer> lineNumbers = new ArrayList<>();
        List<Integer> linesW = new ArrayList<>();
        List<String> lines = new ArrayList<>();
        List<String> words = new ArrayList<>();
        
        while (input.hasNextLine()) {
            // read a line from the input file
            String line = input.nextLine();

            // increment line count
            lineCount++;
            
            

            // split line into words and increment word count
            String str [] = line.split("[ ,!?.]");
            //String s[] = line.spl
            //String str [] = line.split("[(^a-zA-Z0-9]");
            if (str.length > 4){
                lineCount3 ++;   
                //System.out.println("IN HERE");
            } else{
                lineCount3 ++;
                linesW.add(lineCount3);
                words.add(line);
            }
                
            
            for ( int i = 0; i <str.length ; i ++) {
                if (str[i].length() > 0 ) {
                    wordCount ++;                                       
                }
            }

            // increment char count
            charCount += (line.length());           
                        
            if(line.length() < 40) {
                lineCount2 ++;
                lineNumbers.add(lineCount2);
                lines.add(line);
                
            } else {
                lineCount2 ++;
            }           
        }

        for(int i = 0; i < lineNumbers.size(); i++) {            
            System.out.println("Lines with less than 40 chars " + lineNumbers.get(i) + " " + lines.get(i));
        }
        for(int i = 0; i < linesW.size(); i++) {            
            System.out.println("Lines with 4 words or less " + linesW.get(i) + " " + words.get(i));
        }
                                        
        System.out.println("Number of lines " + lineCount);
        System.out.println("Number of words " + wordCount);
        System.out.println("Number of chars " + charCount);
        
    }
}
