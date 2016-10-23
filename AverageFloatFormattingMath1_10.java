
package chaper1;

/**
 *
 * @author Kafaka157
 */
public class AverageFloatFormattingMath1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kilometer = 14;
        float minutes = (float) 45.5;
        float mile = (float) (kilometer / 1.6);
        
        float n = (float) (mile / minutes);
        float mph = (float) (n * 60);
        
        System.out.println("You ran " + kilometer + " kilometers or " + mile + " miles in " + minutes + " minutes");
        System.out.printf("Your average mph was %.2f\n", mph);
    }
    
}
