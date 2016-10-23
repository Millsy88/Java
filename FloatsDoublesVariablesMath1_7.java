
package chaper1;

/**
 *
 * @author Kafaka157
 */
public class FloatsDoublesVariablesMath1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float third = (float) 1 / 3;
        float fifth = (float) 1 / 5;
        float seventh = (float) 1 / 7;
        float nineth = (float) 1 / 9;
        float eleventh = (float) 1 / 11;
        float thirteenth = (float) 1 / 13;
                
        double pie0 = 4 * (1.0 - third + fifth - seventh + nineth - eleventh);
        float pie1 = (float) (4 * (1.0 - third + fifth - seventh + nineth - eleventh + thirteenth));
        double pie2 = ((1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13)) * 4);
          
        
        System.out.println(pie0 + "\n" + pie1 + "\n" + pie2);
                
    }
    
}
