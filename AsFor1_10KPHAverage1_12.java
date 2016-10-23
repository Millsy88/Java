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
public class AsFor1_10KPHAverage1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miles = 24;
        float minutes = (float) 100;
        float kilometers = (float) (miles * 1.6);
        
        float n = (float) (kilometers / minutes);
        float kph = (float) (n * 60);
        
        System.out.println("You ran " + miles + " miles or " + kilometers + " kilometers in " + minutes + " minutes");
        System.out.printf("Your average kph was %.2f\n", kph);
    }
    
}
