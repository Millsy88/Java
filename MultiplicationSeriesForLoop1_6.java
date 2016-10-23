
package chaper1;

import javax.swing.JOptionPane;

/**
 *
 * @author Kafaka157
 */
public class MultiplicationSeriesForLoop1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int endVal = 9;
        //int startVal = 1;
        int startVal = Integer.parseInt(JOptionPane.showInputDialog("Please enter a starting number: "));
        int start = startVal;
        int endVal = Integer.parseInt(JOptionPane.showInputDialog("Please enter a ending number: "));
        int answer = 1;

        for (int i = 1 ; i < endVal; i++){
            int answerTemp = answer *(startVal + 1);
            answer = answerTemp;
            startVal +=1;            
        } 
        System.out.println("multiplcation of series " + start + " to " + endVal + " is " + answer);
    }
    
}
