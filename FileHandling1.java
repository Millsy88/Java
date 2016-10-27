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

/**
 *
 * @author a9-mills
 */
public class FileHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InputStream stream = FileHandling1.class.getResourceAsStream("tokens.txt");
        Scanner scanner = new Scanner(stream).useDelimiter("[ ,!?.]");
        
        List<String> words = new ArrayList<>();
        List<String> duplicates = new ArrayList<>();
        List<String> chars = new ArrayList<>();

        for(; scanner.hasNext() ;){
            String n = scanner.next().trim();
            words.add(n);
            if(n.length() == 4){
                chars.add(n+"\n");
            }
        }

        scanner.close();
        
        int wCount = words.size();
        
        for (int i = 0; i < wCount; i++){
            String a = words.get(i);
            for (int j = i+1; j < wCount; j++) {
                String b = words.get(j);
                if (a.equalsIgnoreCase(b)){
                    duplicates.add(a+"\n");                                        
                }
            }
                
        }

        /*if(wordFound){
            JOptionPane.showMessageDialog(null, "The word " + word + " was found " + count + " times ");// found
        }else{
            JOptionPane.showMessageDialog(null,word + " not found");// not found
        }*/
        
        String duplicatesFormated = duplicates.toString()
            .replace(",", "")  //remove the commas
            .replace("[", "")  //remove the right bracket
            .replace("]", "");  //remove the left bracket
            
        
        String charsFormated = chars.toString()
            .replace(",", "")  //remove the commas
            .replace("[", "")  //remove the right bracket
            .replace("]", "");  //remove the left bracket
            
        
        System.out.println("There are " + chars.size() + " words with 4 characters. They are: \n" + charsFormated);// found
        System.out.println("There are " + duplicates.size() + " duplicates. They are: \n" + duplicatesFormated);

    }
}

