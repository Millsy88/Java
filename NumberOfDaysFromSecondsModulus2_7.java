
package chapter2;

import javax.swing.JOptionPane;

/**
 *
 * @author Kafaka157
 */
public class NumberOfDaysFromSecondsModulus2_7 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        
       int secondsIn, secondsLeft, minutes, hours, days, temp;
       
       secondsIn = Integer.parseInt(JOptionPane.showInputDialog("Please enter "
               + "the number of seconds", "0"));
       
       temp = secondsIn / 60 ; // used to get the intital number of minutes
       secondsLeft = secondsIn % 60; // used to get the number of seconds
       hours = temp / 60; // used to get the intital number of hours
       minutes = temp %60; // used to get the number of minutes
       temp = hours; // we have the number of minutes, so now we need the number of hours
       days = temp / 60; // number of days
       hours = temp % 60; // our final number of hours.
       //temp = days; // we have the number of hours, so now we need the number of days
       //months = temp / 12; // intial for months
       //days = temp % 12; // final for days
       //temp = months;
       //years = months / 12;
       //months = temp % 12;
       
       
       if (hours == 24){
           hours = 0;
           days = days + 1;
           JOptionPane.showMessageDialog(null, secondsIn + " seconds is approximately " 
                   + days + " days " + minutes + " minutes " + hours + " hours and " 
                   + secondsLeft + " seconds ");
       } else {
           JOptionPane.showMessageDialog(null, secondsIn + " seconds is approximately " 
                   + days + " days " + minutes + " minutes " + hours + " hours and " 
                   + secondsLeft + " seconds ");
       }
       
       
        
    }
    
}
