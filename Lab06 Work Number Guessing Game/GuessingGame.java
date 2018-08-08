/**
 * NOTICE THAT THIS IS INCOMPLETE FOR NOW
 * Name:
 * ID:
 * Date modified:
 * Summary of class:
 * Pseudo code:
 */

import javax.swing.JOptionPane;
import java.util.Random;
public class GuessingGame
{
    private final int number = 10;

    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog( null , "insert explanation of game here" );

        for( int attempts = 0; attempts < 5; attempts++ )
        {
            String geussString =
                JOptionPane.showInputDialog( "Attempt number:%d. Enter your guess", attempts );

            double guess = Double.parseDouble( geussString );
        }
    }
}
