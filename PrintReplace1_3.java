/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaper1;

/**
 *
 * @author Kafaka157
 */
public class PrintReplace1_3 {

    public static void main(String[] args) {
        // Printing the following via a loop is currently beyond my scope
        // The below is very unelegant, but it'll do for now
        
        String Pattern = "...J....A...V.....V..A\n" +
                         "...J...A.A...V...V..A.A\n" +
                         "J..J..AAAAA...V.V..AAAAA\n" +
                         ".JJ..A.....A...V..A.....A\n";
        Pattern = Pattern.replace(".", " ");
        System.out.println(Pattern);
        
    }
    
}
