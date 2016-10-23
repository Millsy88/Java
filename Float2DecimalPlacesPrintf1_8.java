
package chaper1;

/**
 *
 * @author Kafaka157
 */
public class Float2DecimalPlacesPrintf1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pie = (float) 3.14;
        float radius = (float) 3.7;
        
        float perimeter = 2 * radius * pie;
        float area = radius * radius * pie;
        
        System.out.printf("The perimeter of the circle is %.2f\n", perimeter);
        System.out.printf("The area of the circle is %.2f\n", area);
    }
    
}
