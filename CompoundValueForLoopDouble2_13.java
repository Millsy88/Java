
package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Kafaka157
 */
public class CompoundValueForLoopDouble2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("####0.##");
        int counter = 1;        
        double monthlyInterestRate = 0.05/12;
        
        double saved = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the how much you save per month (numbers only)", "£0"));
        
        
        // sets the monethly interest to 1 by adding 1 to the equation.
        // multiplying it by the amount saaved produces the total.
        // the below sets the amount for after 1 month. 
        double permonth = saved * (1 + monthlyInterestRate); 
        
        JOptionPane.showMessageDialog(null, "After " + counter + 
                " months your total saved would be £" + df.format(permonth));                
        
        for(int i = 0; i < 5; i++){
            double temp = (saved + permonth) * (1 + monthlyInterestRate);
            // assigns the value above to the permonth var. Allows us to add
            // the the previous amount saved (permonth) to the monthly amount saved
            permonth = temp;
            counter += 1;
            JOptionPane.showMessageDialog(null, "After " + counter + 
                " months your total saved would be £" + df.format(permonth));
            
        }
    }
    
}
