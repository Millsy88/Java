
package chapter2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Kafaka157
 */

public class AreaWidthDoubleFormatting2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        double breadth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the rectangles breadth", "Breadth"));
     
        double width = Double.parseDouble(JOptionPane.showInputDialog("Please enter the rectangles width", "Width"));
        
        double area = breadth * width;
        double perimeter = 2 * (breadth + width);
        
         DecimalFormat df = new DecimalFormat("####0.##");
                        
        JOptionPane.showMessageDialog(null, "Area = " + df.format(area) + "\nPerimeter =" + df.format(perimeter), "Answer",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
}
