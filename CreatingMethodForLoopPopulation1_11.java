
package chaper1;
/**
 *
 * @author Kafaka157
 */
public class CreatingMethodForLoopPopulation1_11 {

    
    // Below is the format for creating a method in Java.
    // For it to be referenced it needs to be declared static(?)
    public static int peryear (float permin) {
        
        float perday = (float) (permin * 60) * 24;
        //float birthsperyear = (float) perday * 365;
        int peryear = Math.round(perday * 365);
        
        return peryear;
    }
    
    public static void main(String[] args) {
        
        int currentpop = 312032486;
        int year = 2017;
        int n = 5;
        
        float birthspermin = (float) 60 / 7;
        float deathspermin = (float) 60 / 13;
        float immigrationpermin = (float) 60 / 45;
        
        int birthsperyear = peryear(birthspermin);
        int deathsperyear = peryear(deathspermin);
        int immigrationperyear = peryear(immigrationpermin);
        
        int totalperyear =  birthsperyear + immigrationperyear - deathsperyear;
                
        System.out.println("Population for 2016 " + currentpop);
        
        for(int i = 0 ; i < n; i++){
            int temp = currentpop + totalperyear;
            currentpop = temp;
            System.out.println("Population for " + year + " " + temp);
            year += 1;
        }
    }     
}
